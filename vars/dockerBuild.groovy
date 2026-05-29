def call(Map config) {

    sh """
        docker build -t ${config.imageName}:${env.BUILD_NUMBER} .
    """

    env.APP_VERSION = env.BUILD_NUMBER
}
