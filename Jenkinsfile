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
                bat 'mvn clean package'
            }
        }
       
    }
}
