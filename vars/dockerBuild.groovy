def Call(MapConfig= [:]){
def imageName= config.get('imageName')
if(!imageName){
error "imageName is required"
}
sh"""
docker build -t ${imageName}
"""
}
