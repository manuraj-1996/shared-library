def call(Map config) {

    sh """
        docker push ${config.ecrUrl}:${config.tag}
    """
}


