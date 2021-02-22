#!/usr/bin/env groovy
package com.cleverbuilder

class SampleClass {
   String name
   Integer code

   def increaseAge(String val) {
     
      //return sh("script: docker pull aquasec/trivy")
      def stdout = "docker pull aquasec/triv".execute()
      stdout="docker pull venafidevops/venafi-java-base".execute()
      stdout="docker run --rm aquasec/trivy image  venafidevops/venafi-java-base".execute()
        return stdout.in.text
      
  //    return  ('sh docker pull aquasec/triv')
    //sh(returnStdout: true, script: 'docker pull venafidevops/venafi-java-base')
//  def rc= sh(returnStatus: true, script: 'docker run --rm aquasec/trivy image  venafidevops/venafi-java-base')
 //     this.code= ${rc}
    // return 1
     // this.name = env['VARIABLE']
   }
}
