def call(){
    node{
        sh '''
        git version
        mvn -version
        java -version
        '''

    }
}