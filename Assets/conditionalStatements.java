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
