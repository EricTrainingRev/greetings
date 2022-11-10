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
                    // this tells this one command below to send a tcp request instead of the default socket file
                    sh 'docker build -t ' + ENGLISH_REGISTRY + ':latest english'                
                }
                                
            }

        }
    }
}