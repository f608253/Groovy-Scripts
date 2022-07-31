package com.test.demo;


def myFunction() {
	throw new RuntimeException();
}

try {
	myFunction();
} catch (Exception e) {
	echo "Caught";
}
