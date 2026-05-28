stage('Initialize') {
            steps {
                script {
                    def config = constant(params.AWS)
                    env.ACCOUNT_ID = config.ACCOUNT_ID
                    env.AWS_REGION = config.AWS_REGION
                    env.ECR_REPO   = config.ECR_REPO
                    env.ECR_URL    = config.ECR_URL
                    env.GIT_URL    = config.GIT_URL
                }
            }
        }
