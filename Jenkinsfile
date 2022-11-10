pipeline {

    // agent any
    agent {
        kubernetes {
            inheritFrom "greeting"
        }
    }

    environment{
        ENGLISH_REGISTRY='esuminski/english'
        E_IMAGE=''
        SPANISH_REGISTRY='esuminski/spanish'
        S_IMAGE=''
        dockerHubCreds='dockerhub'
        dockerImage=''
    }

    stages {
        stage("build english image"){
            steps{
                container("docker"){
                    echo "building english image"
                    script{
                        E_IMAGE = docker.build(ENGLISH_REGISTRY + ":latest", "english")
                    }           
                }                   
            }
        }
        stage("build spanish image"){
            steps{
                container("docker"){
                    echo "building spanish image"
                    script{
                        S_IMAGE = docker.build(SPANISH_REGISTRY + ":latest", "spanish")
                    }
                }
            }
        }
        stage("push images"){
            steps{
                container("docker"){
                    script{
                        docker.withRegistry("","dockerhub"){
                            E_IMAGE.push()
                            S_IMAGE.push()
                        }                        
                    }

                }
            }
        }
    }
}