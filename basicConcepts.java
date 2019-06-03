// JAVA BASIC CONCEPTS //

/*****************************************************************************/
//                               COMMENTS

// There are a few methods for commenting in Java
// the "//" declares a single line comment

// they can be placed on their own line
x = 5; // or they can be placed after code

// as with C++ '/*' and '*/' are used to declare multi-line comments

/* MULTI LINE COMMENT
hi!!
every thing between is commented out
boo
*/

// there are also documentation comments that generate external documentation

/** this is a documentation comment */
/** they work similarly
to muly line comments */

/*************
this is also a valid way to create boxed commenting
Java will simply ignore the extra astriks
*************/

/*****************************************************************************/
//                               VARIABLES

// Java uses familiar data types
String aString = "Bumbo"; // strings
int anInteger = 42; // integers
double aFloat = 2.71828; // doubles or floats
char aChar = 'G'; // characters
boolean isTrue = true; // booleans
// these are the most common, but there are others too including
// float, long, and short

// example of variable declarations
class Variables {
  public static void man(String[] args) {
    String name = "Scoobie"
    int age = 8;
    double score = 9999.99;
    char group = 'A';
  }
}

/*****************************************************************************/
//                               STRINGS

// when working with strings they can be declared empty and declared later
Strings firstName, lastName;
firstName = "Charles";
lastName = "Mikkelborg";

// string concatenation is process of combining two or more STRINGS
System.out.println("My name is" + firstName + " " + lastName); // prints "My name is Charles Mikkelborg"

/*****************************************************************************/
//                               MATH OPERATORS

// Java also has standard arithmetic operators
/*
+ - addition
- - subtraction
* - multiplication
/ - division
% - modulus
*/

x = 5 + 3; // x is 8
z = 9 - 4; // z is 5
y = 7 * 6; // y is 42
t = 21 / 3; // t is 7
p = 23 % 6; // p is 5 -- 6 / 23 = 3 with remainder of 5

// Java also has increment and decrement operators
int var = 7;
++var; // var is now 8

int var = 7;
--var; // var is now 6

// with these operators there are two forms, prefix and postfix

// PREFIX
int var = 12;
int newVar = ++var; // newVar is 13

// POSTFIX
int var = 12;
int newVar = var++; // newVar is 12, var is 13

// there are also the assignment operators
int num1 = 5;
int num2 = 3;
num2 += num1; // num2 = num2 + num1, num2 = 8
num1 -= numb2 // num1 = num1 - num2, num1 = 2

/*****************************************************************************/
//                               USER INPUT

// While Java has many methods for getting user input, the Scanner object is the most common
// the Scanner objected must be imported before used

import java.util.Scanner;
Scanner inVar = new Scanner(System.in);

// here is an example of a program that uses Scanner to get user input

import java.util.Scanner;
class userInput {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println(var.nextLine());
  }
}

// Scanner can read different kinds of input data
// it includes several methods to do so
/*
nextByte() - reads a byte
nextShort() - reads a short
nextInt() - reads an int
nextLong() - reads a long
nextFloat() - reads a float
nextDouble() - reads a double
nextBoolean() - reads a boolean
nextLine() - reads a complete line
next() - reads a single word
*/

/*****************************************************************************/
//                               helloWorld App

 /*
in Java code that is run needs to be inside of a class
public - can be accessed by anyone
static - method can be run without creating an instance of the class
void - method does not return any value
main - starting point of all Java program, main is a method
*/
class MyClass {
  // main contains an array of strings called args
  public static void main(String[] args) {
    // System is a class, here its out stream is used to access the println method
    System.out.println("Hello World!");
  }
}
