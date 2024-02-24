
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                   git branch: 'main', url: 'https://github.com/Michelle-ZW/Lab2-Q2.git'
                   bat "mvn -Dmaven.test.failure.ignore=true clean package"
                   echo 'Building..'
            }
        }
    }
}
