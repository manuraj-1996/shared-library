def call (script, Map config) {
def credentialsId= config.get('credentialsId')
def region= config.get('region')
def accountId= config.get('accountId')
def ecrCredentialsId= config.get('ecrCredentialsId')
if (!credentialsId || !region || !accountId) { 
error "credentialsId, region and accountId are required"
}
withCredentials ([[ $class: 'AmazonWebServicesCredentialsBinding', credentialsId: 'aws-creds' ]]) {
sh """
set -e
aws sts get-caller-identity
aws ecr get-login-password --region ${region} | \docker login --username AWS --password-stdin \ ${accountId}.dkr.ecr.${region}.amazonaws.com
"""
}
}
