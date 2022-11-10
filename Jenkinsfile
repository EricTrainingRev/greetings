pipeline {

    // agent any
    agent {
        kubernetes {
            inheritFrom "greeter"
        }

    environment{
        english_registry='esuminski/english'
        spanish_registry='esuminski/spanish'
        dockerHubCreds='dockerhub'
        dockerImage=''
    }

    stages {
        stage("build english image"){
            steps{
                script{
                    echo "building english image"
                    sh 'cd english'
                    def myImage = docker.build 'esuminski/english:latest'
                }                
            }

            }
        }
    }
}