pipeline  {
    agent any

    tools {
        jdk 'OpenJDK11'
    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }

    stages {
        stage('Main branch release') {
            when { 
                branch 'master' 
            }
            steps {
                echo "I am building on ${env.BRANCH_NAME}"
                sh "./gradlew clean build release -Drelease.dir=$JENKINS_HOME/repo.gecko/release/org.gecko.emf.persistence --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
            }
        }
        stage('Snapshot branch release') {
            when { 
                branch 'snapshot'
            }
            steps  {
                echo "I am building on ${env.JOB_NAME}"
                sh "./gradlew release --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                sh "mkdir -p $JENKINS_HOME/repo.gecko/snapshot/org.gecko.emf.persistence"
                sh "rm -rf $JENKINS_HOME/repo.gecko/snapshot/org.gecko.emf.persistence/*"
                sh "cp -r cnf/release/* $JENKINS_HOME/repo.gecko/snapshot/org.gecko.emf.persistence"
            }
        }
    }

}
