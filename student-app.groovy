pipeline {
    agent any
    stages {
        stage('Pull') {
            steps {
                git 'https://github.com/iamtruptimane/student-app.git'
            }
        }
        stage('Build'){
            steps{
                sh '/opt/apache-maven/bin/mvn clean package'
            }
        }
        stage('Test') {
            steps {
               echo 'Test run successfully ' 
            }
        }
        stage('Deploy') {
            steps {
                echo 'Yahoo!! Application deploy successfully '
            }
        }
    }
}