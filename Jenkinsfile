pipeline {
    agent any
    tools{
        maven 'Maven-3.9.1'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/abhij2109/SimpleDeployableAPP']])
                bat 'mvn clean install'
            }
        }
    }
}