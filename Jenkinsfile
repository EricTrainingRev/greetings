pipeline {

    agent {
        kubernetes {
            label 'build-agent'
            defaultContainer 'jnlp'
            yaml """
            apiVersion: v1
            kind: Pod
            metadata:
            labels:
            component: ci
            spec:
            containers:
            - name: jnlp
                image: ikenoxamos/jenkins-slave:latest
                workingDir: /home/jenkins
                env:
                - name: DOCKER_HOST
                value: tcp://localhost:2375
                resources:
                requests:
                    memory: "500Mi"
                    cpu: "0.3"
                limits:
                    memory: "800Mi"
                    cpu: "0.5"
            - name: dind-daemon
                image: docker:18-dind
                workingDir: /var/lib/docker
                securityContext:
                privileged: true
                volumeMounts:
                - name: docker-storage
                mountPath: /var/lib/docker
                resources:
                requests:
                    memory: "300Mi"
                    cpu: "0.3"
                limits:
                    memory: "500Mi"
                    cpu: "0.5"
            // - name: kubectl
            //     image: jshimko/kube-tools-aws:latest
            //     command:
            //     - cat
            //     tty: true
            volumes:
            - name: docker-storage
                emptyDir: {}
            """
        }
    }


    environment{
        english_registry='esuminski/english'
        spanish_registry='esuminski/spanish'
        dockerHubCreds='dockerhub'
        dockerImage=''
    }

    stages {
        stage("Please Work"){
            steps{
                sh 'echo "Hello world!"'
            }
        }
    }
}