pipeline 
{
    agent any

    stages 
    {
        stage('Build') 
        {
            steps 
            {
               //bat 'git branch: main'
               //bat ' git url: \'https://github.com/sijypaul/Testing.git\''
               git branch: 'master', url: 'https://github.com/sijypaul/Devops-Jenkins-Demo.git'
            }
        }
        stage('compile') 
        {
            steps 
            {
               //readFile 'JunitTesting/src/testing'
               bat 'javac JunitTest.java'
            }
        }
        stage('run') 
        {
            steps 
            {
              //readFile 'JunitTesting/src/testing'
               bat 'java JunitTest.java'
               
            }
        }      
    }
    post{
        failure{
                mail bcc: '', body: '''Hi Welcome to jenkins email alerts...

               Thanks,
               Sijy''', cc: '', from: '', replyTo: '', subject: 'Email configuration of Pipeline jenkins job', to: 'sijypaul.devops@gmail.com'

        }
    }   
}
