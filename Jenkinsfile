pipeline {

    agent any

    environment{
        english_registry='esuminski/english'
        spanish_registry='esuminski/spanish'
        dockerHubCreds='dockerhub'
        dockerImage=''
    }

    stages {
        stage("build english image"){
            steps{
                // node("build"){
                    sh 'cd english'
                    def myImage = docker.build 'esuminski/english:latest'
                // }                
            }

        }
    }
}