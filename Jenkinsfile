pipeline {
    agent any
    environment{
        PATH = "/apache-maven-3.9.1-bin/apache-maven-3.9.1/bin:$PATH"
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
