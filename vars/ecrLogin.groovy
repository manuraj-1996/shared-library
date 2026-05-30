def call() {
    withCredentials([
        [$class: 'AmazonWebServicesCredentialsBinding',
         credentialsId: 'aws-ecr-creds']
    ]) {

        sh '''
        aws ecr get-login-password --region us-east-1 | \
        docker login \
          --username AWS \
          --password-stdin 772064137213.dkr.ecr.us-east-1.amazonaws.com
        '''
    }
}
