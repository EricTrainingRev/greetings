pipeline {

    agent any

    environment{
        english_registry='esuminski/english'
        spanish_registry='esuminski/spanish'
        dockerHubCreds='dockerhub'
        dockerImage=''
    }

    stages {
        stage("Please Work"){
            steps{
                sh 'echo $english_registry'
            }
        }
    }
}