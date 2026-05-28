def call(script, Map config) {

    script.env.AWS_REGION = config.region
    script.env.ACCOUNT_ID = config.accountId
    script.env.ECR_REPO   = config.repo ?: 'ecommerce'
    script.env.ECR_URL    = "${config.accountId}.dkr.ecr.${config.region}.amazonaws.com/${script.env.ECR_REPO}"
}
