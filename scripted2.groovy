node {
    stage('pull'){
        git 'https://github.com/iamtruptimane/Terraform-projects.git'
    }
    stage('Build') {
        echo 'build is successfull'
    }
    stage('Test') {
        echo 'Test run successfully'
    }
    stage('Deploy') {
        echo 'Yahoo!! Application deploy successfully '
    }
}