pipeline {
    agent any
    stages{
        stage('Setup'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/abhij2109/SimpleDeployableAPP.git']])
            }
        }
        stage('Build Application'){
            steps{
                def mavenHome = toolName: "Maven-3.9.1",type: "maven"
                def mavenCMD = ${mavenHome}/bin/mvn
                sh "${mavenCMD} clean package"
            }
        }
    }
}
