#!/usr/bin/env groovy

def call(String name,int age,Map m) {
  echo "Hello, ${name},${age}"
  m.each{entry -> println "$entry.key: $entry.value"}
  sh '''
 docker pull aquasec/trivy
 docker pull venafidevops/venafi-java-base
 docker run --rm aquasec/trivy image  venafidevops/venafi-java-base 
 exitcode=$?
 return exitcode
 
  '''
} 

