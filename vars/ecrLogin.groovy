def call (Map config = [:]) {
def credentialsId= config.get('credentialsId')
def region= config.get('region')
def accountId= config.get('accountId')
def ecrCredentialsId= config.get('ecrCredentialsId')
if(!credentialsId || !region || !accountId) { 
error "credentialsId, region and accountId are required"
}
with credentials ([[ $class: 'AmazonWebServices Credentials Binding', credentialsId: credentialsId ]]) {
sh """
aws sts get-caller-identity
aws ecr get-loginpassword--region${region}|\docker login--username AWS\--password-stdin ${accountId}.dkr.ecr.${region}.amazonaws.com
"""
}
}
