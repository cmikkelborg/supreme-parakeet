// USER INPUT

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
