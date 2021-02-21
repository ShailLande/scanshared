#!/usr/bin/env groovy

def call(String imgname,Map m) {
  echo "Hello, ${imgname}"
//  m.each{entry -> println "$entry.key: $entry.value"}
 // helloWorldExternal(name: "shail", dayOfWeek: "Sunday")
  sh(returnStdout: true, script: 'docker pull aquasec/trivy')
  sh(returnStdout: true, script: 'docker pull venafidevops/venafi-java-base')
  //echo "RCCCC - ${rc}"
  def cmd= "script: 'docker run --rm aquasec/trivy image" +" ${imgname}'" 
  echo "cmddd-  ${cmd}"
  sh """
  docker run --rm aquasec/trivy image ${imgname},returnStatus: true
  """
  //def ret = sh(script: 'uname', returnStdout: true)

 // def rc = sh(script: 'docker run --rm aquasec/trivy image'"${cmd}")
//  def rc= sh(returnStatus: true, script: 'docker run --rm aquasec/trivy image' + "${imgname}" + ')'  //venafidevops/venafi-java-base')
  //echo "RCCCC - ${rc}"

//  return "${rc}"
             return 0
   // def consul =  new org.foo.Consul()
  //  consul.construct(httpObj)
 //   return consul
//  com.cleverbuilder.GlobalVars.foo = "ssss"

} 


