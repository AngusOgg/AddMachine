pipeline {
  agent none
  stages {
    stage('Test') {
      steps {
        mail(subject: 'Test', body: 'Hello', from: 'Jenkins', to: 'graeme.theangusfamily@gmail.com')
      }
    }

  }
}