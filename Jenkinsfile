pipeline {

    // agent any
    agent {
        kubernetes {
            inheritFrom "greeting"
        }
    }

    environment{
        ENGLISH_REGISTRY='esuminski/english'
        spanish_registry='esuminski/spanish'
        dockerHubCreds='dockerhub'
        dockerImage=''
    }

    stages {
        stage("build english image"){
            steps{
                container("docker"){
                    echo "building english image"
                    script{
                        dockerImage = docker.build(ENGLISH_REGISTRY + ':latest', 'english') // this looks in /home/jenkins/agent/workspace/practice for Dockerfile
                    }
                    // dir("english"){
                    //     sh 'docker build -t ' + ENGLISH_REGISTRY + ':latest .'
                    // }                    
                }
                                
            }

        }
    }
}