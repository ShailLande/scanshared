#!/usr/bin/env groovy
package com.cleverbuilder

class SampleClass {
   String name
   Integer age

   def increaseAge(Map mymap) {
      System.out.println "Invoke method $mymap.name"
      //this.age += years
   }
}
