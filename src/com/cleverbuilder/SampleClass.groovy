#!/usr/bin/env groovy
package com.cleverbuilder

class SampleClass {
   String name
   Integer code

   def increaseAge(String val) {
     /* def map = [
    'FF0000' : 'Red',
    '00FF00' : 'Lime',
    '0000FF' : 'Blue',
    'FFFF00' : 'Yellow'
]
      map.each { println "Hex Code: $it.key = Color Name: $it.value" }
    */ 
     // def proc ='./script.sh'.execute()
        sh(returnStdout: true, script: 'docker pull aquasec/trivy')
  sh(returnStdout: true, script: 'docker pull venafidevops/venafi-java-base')
  def rc= sh(returnStatus: true, script: 'docker run --rm aquasec/trivy image  venafidevops/venafi-java-base')
 this.code= rc
     
     // this.name = env['VARIABLE']
   }
}
