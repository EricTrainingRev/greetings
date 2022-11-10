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
                    // echo "building english image"
                    // sh 'cd english'
                    // script{
                    //     dockerImage = docker.build(ENGLISH_REGISTRY + ':latest')
                    // }
                    sh 'cd ./english'
                    script{
                        docker.build(ENGLISH_REGISTRY + ':latest')
                    }
                }
                                
            }

        }
    }
}