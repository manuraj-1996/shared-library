def call (Map config = [:]) {
def imageName= config.get('imageName')
def ecrUrl= config.get ('ecrUrl')
def tag= config.get('tag','latest')
if(!imageName || !ecrUrl) {
error "imagename and ecrUrl are required"
}
echo "Tagging ${imageName}- ${ecrUrl}:${tag}"
sh"""
dockertag ${imageName}${ecrUrl:}:${tag}
"""
}
