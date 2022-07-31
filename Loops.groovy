package com.test.demo

//for(x in 1..5){
//  println x //0,1,2,3,4,5
//}

//def num = 11
//if (num > 10)
//	println "Number is greater than 10"
//	
//	else
//		println "Number is less than 10"
		
//def num = 10
//if (num == 10)
//	println "num is 10"	
	
//def num = 11   //If condition doesnot met - it will not print anything - not go to print
//if (num == 10)
//		println "num is 10"

//def num = 10
//if (num == 10) {
//	println "num is 10"
//}
//else {
//	println "num is NOT 10"
//}
		
		
//def num = 10
//if (num == 10) {   //For single statement in the if/else block these flower/curly braces not necessary but it does for multilines block
//	println "num is 10"
//	println "Second line from if block" }
//else {    //Anyway it is good practice to keep the curly braces
//	println "num is NOT 10"
//	println "second line from else block" }

//Program to check if number is positive or negative
//def num = 0
//if (num > 0)
//	println "Postive Number"
//else if (num == 0)  //This is nested if-else loop
//	println "Number zero (0)"
//else 
//	println "Negative number"
	
//For better nested if else - groovy have switch-case conditional statement
//To implement above program using switch case , below is following
		
//def x = -13928347484939332937392973 //Declaring a variable x to value 10
//def result = ""  //Declaring a null variable
//switch(x)	{	 //Starting switch - it will take the value of x , inside curl brace we can provide multiple cases and each case can be a condition
//	case 0: 
//	   result = "x is zero"
//	   break
//	case {x > 0}:                        //Make sure when you put condition it sud be in curly braces not in circular , otherwise it will not be taken into consideration
//	   result = "x is grester than zero"
//	   break
//	case {x < 0}:
//	   result = "x is less than zero"
//	   break
//	default:                         //default case when nothing matches
//	   result = "Invalid Number"         
//}		
//println result

//for loop in groovy
//for(int i=1; i<5; i++) {   //initialize i to 1, then a condition i<5 and then we give the increament/decreament
//	println i              //So on every iteration of the loop , i will be increamenting to 1
//}                          //i is 1 here, loop will go until i is less than 5 , check the condition, run the block(if condition is true and then increament i)


//for(def i=1; i<5; i++) {   //in place if int, we can use def here as well
//	println i              
//}

//int i=1
//for(i; i<5; i++) {   //if we have separately declared i, then in the loop it is not required to define again
//	println i
//}

//(for in) loop in groovy
//for(i in 1..5) {       //Here 1..5 means 1 to 5
//	println i
//}

//There are some keywords in groovy that we can use
//1.upto(5) {
//	println "$it"  //Here we want to print the iteration of the loop on console, so we have it - which is for iteration, which will print the current iteration of the loop
//}

//9.times { println "$it" } //it starts with zero and print 5 times

//If else statement
//int a = 100
//if (a<100) {
// println("The value is less than 100");
//} else {
// println("The value is greater than or equal to 100");
//}

//Nested if-else statments
//int age = 29;
//
//if (age < 13)
//{
//  println("You are but a wee child!");
//}
//else if (age < 19)
//{
//  println("You are no longer a child, but a budding teenager.");
//}
//else
//{
//  if (age < 65)
//  {
//	println("You are an adult!");
//  }
//  else
//  {
//	println("You are now a senior, enjoy the good life friends!");
//  }
//  println("Also, since you are over the age of 19, you deserve a drink!");
//}
		
	
//int a = 2
//int b = 2
//int c = 4
//if (a == b) {
//	println('a is equal to b')
//}	else if (c == a + b) {
//	println('c is sum of a and b')
//}   else {
//	println('No statement was true')
//}


//Switch statement
//int a = 2
//
////Evaluating the expression value
//switch(a) {
// //There is case statement defined for 4 cases
// // Each case statement section has a break condition to exit the loop
//	
// case 1:
//	println("The value of a is One");
//	break;
// case 2:
//	println("The value of a is Two");
//	//break;
// case 3:
//	println("The value of a is Three");
//	break;
// case 4:
//	println("The value of a is Four");
//	break;
// default:
//	println("The value is unknown");
//	break;
//}

//Nested switch statements
//int i = 1;
//int j = 0;
//  
//// First evaluating the value of variable i
//switch(i) {
//   case 0:
//	  // Next evaluating the value of variable j
//	  switch(j) {
//		 case 0:
//			println("i is 0, j is 0");
//			break;
//		 case 1:
//			println("i is 0, j is 1");
//			break;
//		 
//		 // The default condition for the inner switch statement
//		 default:
//		 println("nested default case!!");
//	  }
//   break;
//	  
//   // The default condition for the outer switch statement
//   default:
//	  println("No matching case found!!");
//}

//While loop
//int count = 0;
//while(count<5) {
// println(count);
// count++;
//}

//for loop Example1
//for(int i = 0;i<0;i++) 
//	println(i)

//Example2
//def cars = ["BMW", "Mercedes Benz", "Volvo", "Chevrolet", "Ford"]
//
//for (int i = 4; i < cars.size(); i++) {
//	println cars[i]
//}

//for-in loop
int [] array = [0,1,2,3,4,5,6,7,8,9];
for(int i in array) {
 println(i + '' + array);
}

//for(int i in 1..5) {
//	println(i);
// }

//def employee = ["Ken" : 21, "John" : 25, "Sally" : 22];
//
//for(emp in employee) {
// println(emp);
//}

//Break statement
//int[] array = [0,1,2,3];
//
//for(int i in array) {
// if(i == 2)
// break;
// println(i); //o/p is 0 and 1
//}


//Continue Statement
//int[] array = [0,1,2,3];
//
//for(int i in array) {
// if(i == 2)
// continue;
// println(i);
//}