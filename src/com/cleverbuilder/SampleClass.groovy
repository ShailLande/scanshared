#!/usr/bin/env groovy
package com.cleverbuilder

class SampleClass {
   String name
   Integer code

   def increaseAge(String val) {
     
      return sh("script: docker pull aquasec/trivy")
 // sh(returnStdout: true, script: 'docker pull venafidevops/venafi-java-base')
//  def rc= sh(returnStatus: true, script: 'docker run --rm aquasec/trivy image  venafidevops/venafi-java-base')
 //     this.code= ${rc}
    // return 1
     // this.name = env['VARIABLE']
   }
}
