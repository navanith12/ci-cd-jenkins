pipeline 
{

    agent any
	tools {
        Maven 'maven_3.6.1'
        jdk 'JDK 12.0.2'
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

        stage('Deploy') {
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
