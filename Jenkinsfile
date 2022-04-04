pipeline {
 agent any 
 environment{
   M2_HOME='C:\\Program Files\\apache-maven-3.8.4'
   PATH = "${M2_HOME}\\bin;${env.PATH}"
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
                 mvn clean package
           }
     }
   stage('JaCoCo Report') 
    {
          steps {
                 jacoco()
         }
    }
  }
}
