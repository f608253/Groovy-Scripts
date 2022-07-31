package com.test.demo

//Strings

//String concatenation
//assert 'ab' == 'a' + 'b'

//Triple single quoted strings
//def aMultilineString = '''line one
//line two
//line three'''
//println aMultilineString

//def startingAndEndingWithANewline = '''\
//line one
//line two
//line three
//'''
//println startingAndEndingWithANewline

//Interpolation in Groovy
//def name = 'Guillaume' // a plain string
//def greeting = "Hello ${name}"
//println greeting
//assert greeting.toString() == 'Hello Guillaume'

//def sum = "The sum of 2 and 3 equals ${2 + 3}"
//println sum

//def sum = "The sum of a and b equals ${def a = 1; def b = 2; a + b}"
//println sum

//def person = [name: 'Guillaume', age: 36]
//value = "$person.name is $person.age years old"
//println value

//def name = 'Groovy'
//def template = """\
//    Dear Mr ${name},
//    You're the winner of the lottery!
//    Yours sincerly,
//    Dave
//"""
//assert template.toString().contains('Groovy')
//println template

//def name = 'Guillaume'
//def date = '1 April 2020'
//
//def dollarSlashy = $/
//	Hello $name,
//	today we're $date.
//
//	$ dollar sign
//	$$ escaped dollar sign
//	\ backslash
//	/ forward slash
//	$/ escaped forward slash
//	$$$/ escaped opening dollar slashy
//	$/$$ escaped closing dollar slashy
///$
//
//println dollarSlashy


//def name = "Manav"
//println name
//println "My name is " + name
//println "My name is ".concat(name)
//println "My name is ${name}"
//println "My name is $name"

//println 'My name is ' + name  //this will print
//println 'My name is '.concat(name) //this will print
//println 'My name is ${name}' // this will not print because interpolation cannot happen in single quote.
//println 'My name is $name' //this will not print

//String a = 'Hello Single';
//String b = "Hello Double";
//String c = "'Hello Triple" + "\nMultiple lines'"; //this will print in next line
//String d = "Hello Triple" + "\n\n\nMultiple lines";
//  
//println(a);
//println(b);
//println(c);
//println d;

//String sample = "Hello world";
//println(sample[4]); // Print the 5 character in the string
//  
//Print the 1st character in the string starting from the back
//println(sample[-1]);
//println(sample[1..2]);//Prints a string starting from Index 1 to 2
//println(sample[4..2]);//Prints a string starting from Index 4 back to 2

//def s1 = '''This is first line
//second line
//third line
//'''
////println s1
//
//def s2 = """This is first line
//second line
//third line"""
////println s2
//
//println s1.length()
//println s2.length()
//println s1[0,1,2,3,5,6]
//println s1.indexOf('l')
//println s1[14]

//def str = "This is a groovy class"
//println str.split(" ")
//println str-("groovy")
//println str.replace('class' , 'session')
//println str.toLowerCase()
//println str.toUpperCase()
//println str.toList()
//
//println 'Groovy ' * 4 //repeat strings to n times
//println 'Abc'.equals('AbC')
//println 'Abc'.equals('Abc')
//println 'Abc'.equalsIgnoreCase('ABC')

//def name = 'Manvendra'
//def s1 = /a blue sky $name/
//def s2 = $/a green tree $name/$
//println s1
//println s2

//def name = 'Manvendra'
//def s1 = /a blue sky 
//	$name/
//def s2 = $/a green tree 
//	$name/$
//println s1
//println s2

//def s3 = "My name is Manvendra"
//println s3
//
//def s4 = "My name is 'Manvendra'"
//println s4
//
//def s5 = 'My name is "Manvendra"'
//println s5
//
//def s6 = "My name is \"Manvendra\""
//println s6
//
//def s7 = /My name is "Manvendra"/
//println s7

//println("That's great!")
//println('That's great!') //if you use apostrophe inside a single quote it wil not work.
//println('That\'s great!')

//def ss1 =  '''This is groovy classes and learning strings'''
//println ss1
//println ss1.length()  //using length() you can find and print the string length
//println ss1[5]   //this will println 5th string
//println ss1[0..6]   //this will print 0 to 6 strings
//println ss1[2,3]    //this will print 2nd and 3rd string
//println ss1[-2]     //this will start from back and print 2nd string from back
//println ss1.indexOf('o') //it will return the index of string and if not present it will retun -1
//println ss1[8..3]  //it will count till 8 and start from back and print
//println ss1.substring(3) //print string 3 onwards till last
//println ss1.subSequence(6, 31)  //start from 6 and go to 31
//println "This is the string s1 value = $ss1" 
//println "This is the split value = ${ss1.split(" ")}" //Split put the strings in list with , separated
//def a = "Hello-World"
//println "\nThis is string value = $a"
//println "This is the split value output = ${a.split(" ")}"

//def text = '''1;Joe Doe;joedoe@example.com
//2;Paul Doe;pauldoe@example.com
//3;Mark Doe
//4;Clark Doe;clarkdoe@example.com;2
//'''
//
//text.eachLine { line ->
//	def arr = line.tokenize(';')
//
//	println "id: ${arr[0]}, name: ${arr[1]}, email: ${arr[2]}, sibling: ${arr[3]}"
//}

//println (ss1)
//println ss1-("groovy")  //this will remove groovy if found
//println ss1+("addition") //this will add in the last
//println ss1-("joker") //if match not found - no error
//println ss1.replace("classes", "sessions") //replace oldchar to new char
//println ss1.toLowerCase()  //print all in lower case
//println ss1.toUpperCase()  //print all in UPPER case
//println ss1.toList() //Converts the given CharSequence into a List of Strings of one character.
//println ss1 * 3  //Print the string value 3 times
//println ss1.equals("This is groovy classes and learning strings") //it will be true
//println ss1.equals("This is Groovy classes and learning strings") //it will be false
//Groovy is case-sensitive
//println ss1.equalsIgnoreCase("This is Groovy classes and learning strings") //though there is diff. in G of Groovy and g of groovy , but it still true due to ignorecase

//Slashy and Dollar Slasy strings

def s1 = /a blue sky/
def s2 = $/a green tree/$
println s1
println s2

//def name = "My name is "Manav" "  //this will give error , so here slash strings comes in picture
//println name

def name = "My name is \"Manav\""  //this will print "Manav in the name string"

println name


