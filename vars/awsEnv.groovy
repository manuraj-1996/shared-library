def call(String envName) {

    def config = [:]

    if (envName == 'ecommerce') {

        config.ACCOUNT_ID = '772064137213'
        config.AWS_REGION = 'us-east-1'
        config.ECR_REPO   = 'ecommerce-app'
        config.ECR_URL    = "${config.ACCOUNT_ID}.dkr.ecr.${config.AWS_REGION}.amazonaws.com/${config.ECR_REPO}"
        config.GIT_URL    = 'https://github.com/manuraj-1996/whatsapp.git'

    } else {

        error "Unknown environment: ${envName}"
    }

    return config
}
