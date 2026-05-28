def call(Map config) {
script.env.AWS_REGION= 'us-east-1'
script.env.ACCOUNT_ID= '772064137213'
script.env.ECR_REPO= 'ecommerce'
script.env.ECR_URL= '772064137213.dkr.ecr.us-east-1.amazonaws.com/ecommerce'
script.env.IMAGE_NAME= 'ecommerce'
}
