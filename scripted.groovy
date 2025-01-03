node {
    stage('pull'){
        echo 'pull succeed'
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