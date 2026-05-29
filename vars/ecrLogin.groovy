def call() {

    sh """
        aws ecr get-login-password --region ${env.AWS_REGION} | \
        docker login --username AWS --password-stdin ${env.ECR_URL}
    """
}
