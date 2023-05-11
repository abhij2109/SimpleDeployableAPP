pipeline {
    agent any
    tools{
        maven 'maven_3_8_4'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/abhij2109/SimpleDeployableAPP']]])
                sh 'mvn clean install'
            }
        }
    }
}