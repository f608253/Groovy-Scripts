package com.test.demo

//Closure definition/syntax without paramaters
//def myclosure = {
//	println "Hello World"
//	}  //Defining closure
//myclosure.call()                        //Calling closure

//Closure with parameters
//def myclosure = { name -> println "Hello ${name}" }  //Defining closure with parameter name and calling same in closure
//myclosure.call("Manav")

//def myclosure = { name -> println "Hello $name" }  //Here name should work w/o curly braces
//myclosure.call("Manav")

//Referring a variable which is outside the closure surrounding scope
//def str = "Namaste"
//def myclosure = { name -> println "$str $name" }  //Calling str value from outside closure
//myclosure.call("Manav")

//def mymethod() {                                 //Here method cannot refer a variable value outside its scope
//	def str = "Namaste from method"
//	println "$str"
//}
//mymethod()

//We can also pass closures as a parameter to methods
//def mymethod(clos) {
//	clos.call("Groovy")
//}
//mymethod(myclosure)

//Closure can also have return type
//def myclosure2 = {
//	a,b,c -> 
//	return (a-b+c)
//}
//def result = myclosure2(1,2,3)
//println result

//Implicit Parameter in groovy closures
//def greet = {
//	return "Hello! ${it}"  //when parameters are not defined, Groovy assumes an implicit parameter named “it”
//}
//def res = greet("Alex")
//print res
//assert greet("Alex") == "Hello! Alex"
//
//So far, we've seen the syntax, execution, and parameters of closures, which are fairly similar to methods. Let's now compare closures with methods.
//
//Unlike a regular Groovy method:
//
//We can pass a Closure as an argument to a method
//Unary closures can use the implicit it parameter
//We can assign a Closure to a variable and execute it later, either as a method or with call
//Groovy determines the return type of the closures at runtime
//We can declare and invoke closures inside a closure
//Closures always return a value
//Hence, closures have benefits over regular methods and are a powerful feature of Groovy.

//We can define a list and using groovy implicit variable - we can call list values
//def mylist = ["Apples", "Oranges", "Pears" ]
//println mylist.each { it }

//We can also use find fucntion to seach for a list value
def mylist1 = [1,2,3,4,5,6,4.45]
println mylist1.find {item -> item ==3 }  //If it get the value in list it will print the value
println mylist1.find {item -> item ==8 }  //If not then it will print null
println mylist1.findAll { item -> item> 2}  //List items which are greater than 2 in the list
println mylist1.any { item -> item> 2}  //If there is any item > 2
println mylist1.every { item -> item> 2} //Do all elements are > then 2
println mylist1.collect { item -> item * 2}  //Multiple all items with 2






