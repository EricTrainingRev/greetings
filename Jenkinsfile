pipeline {
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
                        docker.withRegistry("","docker_credentials"){
                            E_IMAGE.push()  
                        }    
                    }
                }                   
            }
        }
        // stage("build spanish image"){
        //     steps{
        //         container("docker"){
        //             echo "building spanish image"
        //             script{
        //                 S_IMAGE = docker.build(SPANISH_REGISTRY + ":latest", "spanish")
        //                 S_IMAGE.push()
        //             }
        //         }
        //     }
        // }
    }
}