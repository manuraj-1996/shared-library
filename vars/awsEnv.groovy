def call(AWS) {

    def ACCOUNT_ID = '772064137213'
    def AWS_REGION = 'us-east-1'
    def ECR_REPO   = 'ecommerce'
    def GIT_URL    = "https://github.com/manuraj-1996/whatsapp.git"
    def ECR_URL = "${ACCOUNT_ID}.dkr.ecr.${AWS_REGION}.amazonaws.com/${ECR_REPO}"
 def IMAGE_NAME = AWS
    return [
        ACCOUNT_ID: ACCOUNT_ID,
        AWS_REGION: AWS_REGION,
        ECR_REPO  : ECR_REPO,
        ECR_URL   : ECR_URL,
        GIT_URL   : GIT_URL,
        IMAGE_NAME : IMAGE_NAME
    ]
}
