#!/usr/bin/env groovy

def call(String imgname,Map m) {
//  echo "Hello, ${name},${age}"
//  m.each{entry -> println "$entry.key: $entry.value"}
 // helloWorldExternal(name: "shail", dayOfWeek: "Sunday")
  sh(returnStdout: true, script: 'docker pull aquasec/trivy')
  sh(returnStdout: true, script: 'docker pull venafidevops/venafi-java-base')
  def rc= sh(returnStatus: true, script: 'docker run --rm aquasec/trivy image' + "${imgname}" + ')'  //venafidevops/venafi-java-base')
  echo "RCCCC - ${rc}"

//  return "${rc}"
             return 0
   // def consul =  new org.foo.Consul()
  //  consul.construct(httpObj)
 //   return consul
//  com.cleverbuilder.GlobalVars.foo = "ssss"

} 


