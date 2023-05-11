pipeline {
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage('Setup'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/abhij2109/SimpleDeployableAPP.git']])
            }
        }
        stage('Build Maven'){
            steps{
                sh 'mvn clean install'
            }
        }
    }
}
