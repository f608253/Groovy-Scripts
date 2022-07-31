package com.test.demo;

//package com.test.demo
//
//def _name = "Manav"
//println _name
//println 'Name is '+ _name  //Concatenating string with + sign
//println 'Name is $_name'  // within '' every thing is taking literally ...no interpolation
//println "Name is ${_name}"  //Here it will refer the name value ..interpolation is there
//println "Name is $_name"   //Even curly braces not required here, but as a good practice you should put curly braces whenver you are calling a varibale
//
//def x = 10
//x = "I am coming from string for value of x"
//def X = 20
//println x
//println X
//
//def name = "Raghav"
//name = 10
//println name

//def (a,b,c,d) = [10,20,30,40]
//println a
//println b
//println c
//println d

//def (String a,int b,double c, float d) = [10,20,30,40]
//println a
//println b
//println c
//println d

//import java.lang.Double
//def (String a,int b) = [10,20,30]
//println a
//println b

//x = 1
//println x
//
//x = -3.1499392
//println x
//
//x = false
//println x
//
//x = "Hi"
//println x

//Multiple assignment

//def (a, b, c) = [10, 20, 'foo']  //Groovy supports multiple assignment, i.e. where multiple variables can be assigned at once, e.g.:
//assert a == 10 && b == 20 && c == 'foo'
//println a
//println b
//println c

//def (int i, String j) = [10, 'foo']  //You can provide types as part of the declaration if you wish:
//assert i == 10 && j == 'foo'
//println i
//println j

//def nums = [1, 3, 5]  //As well as used when declaring variables it also applies to existing variables:
//def a, b, c
//(a, b, c) = nums
//println a
//println b
//println c

//def (_, month, year) = "18th June 2009".split()
//assert "In $month of $year" == 'In June of 2009'

//Overflow
//def (a, b, c) = [1, 2]  //If the left hand side has too many variables, excess ones are filled with null’s:
//println a
//println b
//println c

//def (a, b) = [1, 2, 3] //If the right hand side has too many variables, the extra ones are ignored:
//println a
//println b 




