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
                sh 'cd english'
                sh "docker build -t esuminski/english:latest ."
            }
        }
    }
}