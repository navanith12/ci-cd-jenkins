pipeline {

    agent any

    stages {

        stage ('Build') {
            steps {
                wmaven(maven : 'Maven_3.5.2'){
                        bat "mvn clean package"
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

}