package com.test.demo

//def employee = [
//                'name': 'Manav',
//                'age':31,
//                'sex': 'Male'
//                ]
//                		
//println employee
//println employee.name
//println employee['name']
//println employee['age']
//println employee['sex']
//println employee['hobby']
//println employee.get('age')
//println employee.getAt('name')
//println employee.size()
//employee.put('City', 'Pune')
//println employee
//println employee.containsKey('City')
//println employee.containsValue('32')
//println employee.containsKey('Job')
//employee.eachWithIndex {key,value,i ->
//	println "Sr No. $i | key=$key value=$value"
//}

//def emptyMap = [:]
//assert emptyMap.size() == 0
//def notEmptyMap = ["person1":"john", "person2":"mus"]
//assert notEmptyMap.size() == 2
//
//notEmptyMap.put "person3","test"    //adding to existing one
//assert notEmptyMap.size() == 3
//notEmptyMap["person4"] = "beth"
//assert notEmptyMap.size() == 4
//
//assert notEmptyMap.get("person1") == "john"    //accessing the value
//assert notEmptyMap.person1 == "john"
//assert notEmptyMap["person1"] == "john"
//
//notEmptyMap.each{ k,v -> println "key=${k}: value=${v}"}    //iterating
//notEmptyMap.each{ it -> println "key=${it.key}:value${it.value}"}


//def map = [1:20, a:30, 2:42, 4:34, ba:67, 6:39, 7:49]
//def minusMap = map.minus([2:42, 4:34]);
//println minusMap

//def map = [name:"Jerry", age: 42, city: "New York", hobby:"Singing"]

//def map = [
//	1: [name:"Jerry", age: 42, city: "New York"],
//	2: [name:"long", age: 25, city: "New York"],
//	3: [name:"dustin", age: 29, city: "New York"],
//	4: [name:"Dustin", age: 34, city: "New York"]]

//println map

//def names = map.collect{entry -> entry.value.name}
//def names = map.collect { entry -> entry.value.name }
//println names
//def idNames = map.collectEntries{key, value -> [key, value.name]}
//println idNames

//def map = [2
//	:40, 1:20, 4:93, 3:11]
//def subMap = map.groupBy{it.value % 2}
//println subMap
//
//def sortMap = map.sort()
//println sortMap

//def GIT_URL = 'https://alm-github.systems.uk.hsbc/BB-API/wsit-bbuk-servicing-pa-mandates.git'
//name = GIT_URL.replaceFirst(/^.*\/([^\/]+?)git$/, '$1')
//println name

//def displayName() {
//	println "Hi There !!"
//}
//displayName()

//def x = 104
//println x.getClass()
//x = "Guru99"
//println x.getClass()
//def p = 1.45
//println p.getClass()
//def q = 0.00000000001
//println q.getClass()

//int x = 104
//println x
//x = "Guru99"

//for (int x = 0; x <= 5; x++) {
//	for (int y = 1; y <=5; y++ ) {
//		println(y);
//	
//	println(y);
//	println(x);
//}
//}

def http = [
        100 : 'CONTINUE',
        200 : 'OK',
        400 : 'BAD REQUEST'
]
assert http[200] == 'OK'
http[500] = 'INTERNAL SERVER ERROR zgoogle'
println http.size()

short sh = 44565464767






