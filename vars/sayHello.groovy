#!/usr/bin/env groovy

def call(String name,int age,Map m) {
  echo "Hello, ${name},${age}"
  m.each{entry -> println "$entry.key: $entry.value"}
 // helloWorldExternal(name: "shail", dayOfWeek: "Sunday")
  sh(returnStdout: true, script: 'docker pull aquasec/trivy')

  sh(returnStdout: true, script: 'docker pull venafidevops/venafi-java-base')
  def rc = sh(returnStdout: true, script: 'docker run --rm aquasec/trivy image  venafidevops/venafi-java-base')
   echo "RCCCC - ${rc}"
 //docker pull venafidevops/venafi-java-base
// docker run --rm aquasec/trivy image  venafidevops/venafi-java-base 
 
 
} 


