// CONDITIONALS AND LOOPS

// CONDITIONAL STATEMENTS

// IF STATEMENTS
if (condition) {
  // executes when the condition is true
}

// there are several comparison operators that may be used
/*
< - less than
> - greater than
<= - less than or equal
>= - greater than or equal
!= - not equal to
== - is equal to
*/

int x = 7;
// if x is less than 42 than print HII!!
if(x < 42) {
  System.out.println("HI!!")
}

// IF ELSE STATEMENTS
// and else statement can be added to an if statement to execute code when the if evaluates as false

int age = 32;
if (age < 21) {
  System.out.println("Not old enough");
} else {
  System.out.println("Come on in!");
}

// NESTED IF-ELSE STATEMENTS
// it is acceptable to place if-else statements within each other
// you can nest as many if-else statements as you want

int age = 32;
if (age > 0) {
  if (age < 21) {
    System.out.println("Not old enought");
  } else {
    system.out.println("Come on in!");
  }
} else {
  System.out.println("Now that's starting early");
}

// ELSE-IF STATEMENTS
// if statements can used to check multiple conditions by using else-if
// as many else if statements can be used as needed

int age = 32;

if (age <= 0) {
  System.out.println("How is it even possible that you are here??");
} else if (age <= 21) {
  System.out.println("Not old enough yet");
} else if (age <= 100) {
  System.out.println("Come on in!!");
} else {
  System.out.println("Drinks on us tonight!");
}

// LOGICAL STATEMENTS
// logical operators are used to combine multiple conditions

// previously nested if statements were used to test multiple conditions
if (age > 21) {
  if (money > 50) {
    System.out.println("Welcome");
  }
}

// however using logical operators is more elegant and simpler to reads
if (age > 21 && money > 50) {
  System.out.println("Welcome");
}

// && - and operator
// || - or operator
// ! - not operator

// not operators can be used to reverse logical statements
if (!(age > 21)) {
  System.out.println("Not old enough");
} else {
  System.out.println("Welcome");
}

// SWITCH STATEMENTS
/*
switch statements test a variable for equality against a list of values.
each value is called a case
the switch variable is checked against each case for equality
*/

switch(variable) {
  case value1 :
    // statement(s)
    break; // optional
  case value2 :
    // statement(s)
    break; // optional
  // as many cases can be used as needed
  default: // optional
    // statement(s)
}

// default cases are used when none of the cases match the switch variable
// no break is necessary for the default because it is always the last statement in the switch

/*
when a variable is found equal to a case, the statements of that case are executed
until a break statement is reached.
break statements end switches
not every case has to have a break. if no break is reached the code will flow through
subsequent cases until a break is reached
*/

int day = 3;

switch(day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
}
// "Wednesday" is the output

// WHILE LOOPS

// loop statements allows statemnts to be repeatedly executed while a given
// condition is true

int x = 3;

while (x > 0) {
  system.out.println(x);
  x--;
}
// outputs - 3 2 1
// while loops will loop continuosly within the while's scope until its condition returns false

// DO-WHILE LOOPS

// the do while loop is similar to the while loop except for the loop will always
// execute at least once, even if the condition is initally false

int x = 1;
do {
  System.out.println(x);
  x++;
} while (x < 0);

// outputs 1 even though x was always greater than 0

// FOR LOOPS
// for loops are great when the number of times the statements within
// the loop need to be executed is known or the start and end condition is known

for (initialization; condition; increment/decrement) {
  // statement(s)
}

// initialization - expression executes only once at the beginning of the loop
// condition - evaluated each time the loop is iterated, until condition returns false
// increment/decrement - executes at the end of every loop

for(int x = 1; x <= 5; x++) {
  System.out.println(x);
}
// outputs - 1 2 3 4 5

// LOOP CONTROL

// using break and continue loops may be manipulated beyond their initial perameters
// break - terminates the loop
// continue - ends the current loop and initiates the next loop from the beginning

for (int x = 10; x <= 40; x = x + 10) {
  if (x == 30) {
    continue;
  }
  if (x == 40) {
    break;
  }
  System.out.println(x);
}
// outputs - 10 20
// output at 30 was skipped through the continue statement
// output at 40 was skipped when the loop was terminated by the break
