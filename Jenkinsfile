pipeline 
{

    agent any
	tools {
        maven 'apache-maven-3.6.1'
        jdk 'jdk1.8'
    }
    stages {
        stage('Build') {
            steps {
                bat "printenv"
                withMaven(mavenSettingsConfig: 'maven-settings-global') {
                    bat "mvn clean package"
                }
            }
        }     
    }    

        stage ('Deploy') {
            steps {

                withCredentials([[$class          : 'UsernamePasswordMultiBinding',
                                  credentialsId   : 'PCF_LOGIN',
                                  usernameVariable: 'thisisnikhil86@gmail.com',
                                  passwordVariable: 'Super@8515']]) {

                    bat "C:/Program Files/Cloud Foundry/cf login -a http://api.run.pivotal.io -u $USERNAME -p $PASSWORD"
		
                    bat "C:/Program Files/Cloud Foundry/cf push"
                }
            }

        }

    }