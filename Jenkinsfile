pipeline {
    agent any

    tools {
        maven "MAVEN3"
    }

    stages {
        stage('Checkout') {
            steps {
                //git 'https://github.com/jglick/simple-maven-project-with-tests.git'
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Michelle-ZW/Lab2-Q2']])
                
            }
        }
        stage('Build Maven') {
            steps {
                bat "mvn clean install"
            }
        }
        stage('JaCoCo') {
            steps {
                jacoco()
            }
        }
        stage('Docker Cred') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhub')]) {
                        bat "docker login -u zmichellew -p ${dockerhub}"
                    }
                }
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    bat "docker build -t zmichellew/lab2q2 ."
                }
            }
        }
        stage('Push Image to Docker') {
            steps {
                script {
                    bat "docker push zmichellew/lab2q2"
                }
            }
        }
    }
}
