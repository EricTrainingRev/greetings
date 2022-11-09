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
                node{
                    sh 'cd english'
                    docker.build 'esuminski/english:latest'
                }                
            }

        }
    }
}