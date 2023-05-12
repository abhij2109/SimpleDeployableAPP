pipeline {
    agent any
    tools{
        maven 'Maven-3.9.1'
    }
    stages{
        stage('Code Setup'){
            steps{
                git 'https://github.com/abhij2109/SimpleDeployableAPP'
            }
        }
        stage('Maven Build Integration'){
            steps{
                bat 'mvn clean package'
            }
        }
        stage('Dockerization'){
            steps{
                script{
                    bat 'docker build -t abhij2109/spring-boot-docker .'
                }
            }
        }
    }
}
