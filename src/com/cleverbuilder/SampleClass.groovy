#!/usr/bin/env groovy
package com.cleverbuilder

class SampleClass {
   String name
   Integer code

   def increaseAge(String val) {
     
      //return sh("script: docker pull aquasec/trivy")
      
      def stdout = "docker pull aquasec/triv".execute()
    /*  stdout="docker pull venafidevops/venafi-java-base".execute()
      stdout="docker run --rm aquasec/trivy image  venafidevops/venafi-java-base".execute()
        return stdout.in
      
      */
      def cmd = ["docker pull aquasec/triv"]
// this one should work for you:
// def cmd = ['/bin/sh',  '-c',  'echo "${metric}" | nc carbon.hostedgraphite.com 2003']
/*
cmd.execute().with{
    def output = new StringWriter()
    def error = new StringWriter()
    //wait for process ended and catch stderr and stdout.
    it.waitForProcessOutput(output, error)
    //check there is no error
    println "error=$error"
    println "output=$output"
    println "code=${it.exitValue()}"
}
*/
      
      
  //    return  ('sh docker pull aquasec/triv')
    //sh(returnStdout: true, script: 'docker pull venafidevops/venafi-java-base')
//  def rc= sh(returnStatus: true, script: 'docker run --rm aquasec/trivy image  venafidevops/venafi-java-base')
 //     this.code= ${rc}
     return 1
     // this.name = env['VARIABLE']
   }
}
