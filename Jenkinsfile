pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
        stage('Publish Test Report') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }
}
