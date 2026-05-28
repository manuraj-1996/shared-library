def call (map Config = [:])
def ecrUrl= config.get('ecrUrl')
def tag= config.get('tag', 'latest')
if (!ecrUrl) {
error "ecrUrl is required"
}
sh"""
docker push ${ecrUrl}: ${tag}
"""
}



