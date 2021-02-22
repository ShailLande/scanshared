#!/usr/bin/env groovy

def call(String imgname,Map m) {
  echo "Hello, ${imgname}"
  String[] str = imgname.split(':');
  //for( String values : str )
   //   println(values);
//  m.each{entry -> println "$entry.key: $entry.value"}
 // helloWorldExternal(name: "shail", dayOfWeek: "Sunday")
  sh(returnStdout: true, script: 'docker pull aquasec/trivy')
  sh(returnStdout: true, script: "docker pull ${imgname}")
  //echo "RCCCC - ${rc}"
 
 // sh("${cmd}")//returnStdout: true,script: 'docker run --rm aquasec/trivy image ${imgname}')//
 // docker run --rm aquasec/trivy image  venafidevops/venafi-java-base 
//  echo "cmddd-  ${cmd}"
  /*
  sh """
  docker run --rm aquasec/trivy image ${imgname}
    """
    */

  def rc = sh(script: "docker run --rm aquasec/trivy image ${imgname}")//\\\"${since}\\\""
//  def rc= sh(returnStatus: true, script: 'docker run --rm aquasec/trivy image' + "${imgname}" + ')'  //venafidevops/venafi-java-base')
  //echo "RCCCC - ${rc}"

  //return 1
  return "${rc}"
   // def consul =  new org.foo.Consul()
  //  consul.construct(httpObj)
 //   return consul
//  com.cleverbuilder.GlobalVars.foo = "ssss"

} 


