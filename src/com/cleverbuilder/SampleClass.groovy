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
      sh '''
     VARIABLE="something"
     //docker pull aquasec/trivy
     //docker pull venafidevops/venafi-java-base
    // docker run --rm aquasec/trivy image  venafidevops/venafi-java-base 
     //exitcode=$?
    '''
      this.name = env['VARIABLE']
   }
}
