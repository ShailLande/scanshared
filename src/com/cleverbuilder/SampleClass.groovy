#!/usr/bin/env groovy
package com.cleverbuilder

class SampleClass {
   String name
   Integer code

   def Integer increaseAge(String val) {
    
    
        sh(returnStdout: true, script: 'docker pull aquasec/trivy')
 // sh(returnStdout: true, script: 'docker pull venafidevops/venafi-java-base')
//  def rc= sh(returnStatus: true, script: 'docker run --rm aquasec/trivy image  venafidevops/venafi-java-base')
 //     this.code= ${rc}
     return 1
     // this.name = env['VARIABLE']
   }
}
