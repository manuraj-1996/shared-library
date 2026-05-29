def call(Map config) {

    sh """
        docker tag ${config.imageName}:${config.tags} \
        ${config.ecrURL}:${config.tags}
    """
}
