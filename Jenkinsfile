pipeline{
    agent any
    stages{
        stage("Checkout from GIT..."){
            steps{
                echo "Cloning from GIT"
            }

        }
        stage("Mavne Build"){
            steps{
                echo "start maven build"
                bat "mvn clean install"
                echo "end maven build"
            }

        }

    }

}
