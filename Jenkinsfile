currentBuild.displayName = "demo-docker-jenkins-#"+currentBuild.number
pipeline{
    agent any
    environment{
   DOCKER_TAG = getDockerTag()
  }
    stages{
        stage("Checkout from GIT..."){
            steps{
                echo "Cloning from GIT"
            }

        }
        stage("Maven Build"){
            steps{
                echo "start maven build"
                bat "mvn clean install"
                echo "end maven build"
            }

        }
        stage("Docker Build"){
            steps{
                echo "start docker build"
                bat "docker build -t farhan1985/demo-docker-jenkins:${DOCKER_TAG} ."
                echo "end docker build"
            }

        }
        stage("Docker push"){
            steps{
                echo "start docker push"
                withCredentials([string(credentialsId: 'DockerHUB', variable: 'DockerHUBPassword')]) {
                 bat "docker login -u farhan1985 -p ${DockerHUBPassword}"
                 bat "docker push farhan1985/demo-docker-jenkins:${DOCKER_TAG} "
               }
                echo "end docker push"
            }

        }

    }

}

def getDockerTag(){
    echo "started to execute getDockerTag function"
    def dockertag = bat(returnStdout: true, script:"@git rev-parse HEAD").trim()
    echo "execution done getDockerTag function  ${dockertag}"
    return dockertag
}
