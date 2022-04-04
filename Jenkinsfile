pipeline {
    agent any

    stages {
        stage('Check Out') {
            steps {
                echo 'Checking out'
            }
        }
        stage('Package') {
            steps {
                mvn clean package
            }
        }
        stage('Publish') {
            steps {
                echo 'Publishing'
            }
        }
    }
}
