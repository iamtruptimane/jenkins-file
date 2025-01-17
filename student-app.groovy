pipeline {
    agent any
    stages {
        stage('Pull') {
            steps {
                echo 'pull succeed'
            }
        }
        stage('Build'){
            steps{
                echo 'Build succeed '
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