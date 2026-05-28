def call() {
sh 'mvn clean package'
sh 'mvn test'
}
