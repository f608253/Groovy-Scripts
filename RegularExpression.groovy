package com.test.demo

//regex - patterns used to find substrings in a text
// ~"expression"

//def match = "Groovy" =~"o"
//
//if (match) {
//println match[0]
//}else {
//	println "No match found"
//}
//class RegularExpression{
//  static void main(String[] args) { 
//	  
//   def oneTo10 = 1..10;
//   def aToz = 'a'..'z';
//   def zToa = 'z'..'a';
//
//   println(oneTo10);
//   println(aToz);
//   println(zToa);
// 
//}
//
//}

//
//String str = "Learn Programming Yourself";
//String str2 = str.replace(/\w{6,8}/,"Thanks");
//println(str2)
//
//
//println "great" ==~ /great/
//String s1 = "This is demo"
//String s2 = s1.replace("is","was")	  
//println s2
//
//String s3 = s1.replaceFirst("is", "was")
//println s3
//
//String s4 = s1.replaceAll("is(.)", "was")  //it will remove spaces and in place of is it will print was
//println s4
//
//String s5 = s1.replaceAll("is(.*)", "was")  //It will replace first is with was and remove rest
//println s5

//String a = "Hello";
//println(a.length());

//centre()
//String a = "Hello     World";
//println(a.center(1) + '|');

//['A', 'BB', 'CCC', 'DDDD'].each{ println '|' + it.center(6) + '|' }

//compareToIgnoreCase()
//String str1 = "Hello World";
//String str2 = "HELLO WORLD";
//String str3 = "HELLO World World";
//  
//println(str1.compareToIgnoreCase( str2 )); //it will print 0 means both are equals
//println(str2.compareToIgnoreCase( str3 ));  // not equals and result is -6
//println(str3.compareToIgnoreCase( str1 ));  // not equals and result is 6

//concat()
//String t = "Boom"
//String s = "Hello ";
//println(s.concat("${t}"));  //This is print "Hello World"
//println(s);                  //This will print "Hello" only because we have not saved the value of the operation

//endsWith()
//String s = "HelloWorld";
//println(s.endsWith("ld"));
//println(s.endsWith("lo"));
//println("Hello".endsWith("lo"));

//getAt
//String a = "Hello World";
//println(a.getAt(2));
//println(a[2]);
//println(a.getAt(6));
//println(a.getAt(7));

//minus()
//String a = "Hello World";
//println(a.minus("World"));
//println(a.minus("Hello"));

//next()
//String a = "Hello World";
//println(a.next());

//split()
//String a = "Hello-World";
//String[] str;
//str = a.split('-');
//
//for( String values : str )
//println(values);

//String s="hi how are you";
//String[] a;
//a = s.split("\\s");
//for( String w : a )
//println(w)
//println(s.split("\\s"))

//split() and tokenize()
//def (value1, value2, value3, value4) = 'abc|xyz|zxc|mnb'.tokenize( '|' )
//println(value1)
//println(value2)
//println(value3)
//println(value4)

String a = "abc-xyz-zxc-mnb-poi-qwe";
String[] str;
str = a.split('x');
println str;
for( String values : str )
println(values);

//char[] characters = "hello".toCharArray();
//println characters

//String s1 = "This is demo"
//String s2 = s1.replaceAll(" is"," was") //Done it , it will print "This was demo"
//println s2

//String[] tokens = "I,am ,Legend,oh ,you ?".split(",");
//
//for (String token : tokens)
//{
//	println(token);
//}

//import java.util.StringTokenizer;
//
//String url = "https://howtodoinjava.com/java-initerview-questions";
//
//StringTokenizer st = new StringTokenizer(url,".");
//
//while(st.hasTokens()){
//	println(st.nextToken());
//}

//String url = "https://howtodoinjava.com/java-initerview-questions";
//String[] str;
//str = url.split('java')
//println str
//for ()

