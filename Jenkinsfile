pipeline {
  agent { docker {image 'maven:3.3.3' } }
    
  stages {
      
    stage('maven'){
      
      steps{
        sh 'maven --version'
      }
    }
  }
}
