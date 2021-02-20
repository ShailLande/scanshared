#!/usr/bin/env groovy
package com.cleverbuilder

class SampleClass {
   String name
   Integer age

   def increaseAge(String s) {
      def map = [
    'FF0000' : 'Red',
    '00FF00' : 'Lime',
    '0000FF' : 'Blue',
    'FFFF00' : 'Yellow'
]
      map.each { println "Hex Code: $it.key = Color Name: $it.value" }
      
      System.out.println "Invoke method $s"
      //this.age += years
   }
}
