pipeline {
    agent any
    stages{
        stage('Setup'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/abhij2109/SimpleDeployableAPP.git']])
            }
        }
    }
}
