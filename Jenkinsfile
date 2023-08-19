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
}
