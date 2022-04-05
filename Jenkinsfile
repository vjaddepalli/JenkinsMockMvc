pipeline {
 agent any 
 environment{
   M2_HOME='C:\\Program Files\\apache-maven-3.8.4'
   PATH = "${M2_HOME}\\bin;${env.PATH};C:\\Windows\\System32;"
 }
    stages 
   {
      stage('Check out')
     {
           steps {
                  echo 'Checking out'
           }
     }
     stage('Package') 
     {
      
           steps {
            
            script{
              bat 'mvn clean package'
            }
                
           }
     }
    stage('Sonar Analysis') 
    {
          steps {
           withSonarQubeEnv('ZensarCodeAnalysis'){
            bat 'mvn sonar:sonar'
           }
         }
    }
   stage('JaCoCo Report') 
    {
          steps {
                 jacoco()
         }
    }
    stage('Build Docker Image') 
    {
          steps {
                bat 'docker build -t vjaddepalli/test .'
         }
    }
    stage('Push Docker Image to Docker Hub') 
    {
          steps {
                 bat 'docker login -u username -p password'
                 bat 'docker push vjaddepalli/test'
         }
    }
  }
}
