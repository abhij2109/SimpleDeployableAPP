pipeline {
    agent any
    stages{
        stage('Setup'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/abhij2109/SimpleDeployableAPP.git']])
            }
        }
        stage('Build Application'){
                def mavenHome = tool name: "Maven-3.9.1", type: "maven"
                def mavenCMD = ${mavenHome}/bin/mvn
            steps{
                sh "${mavenCMD} clean package"
            }
        }
    }
}
