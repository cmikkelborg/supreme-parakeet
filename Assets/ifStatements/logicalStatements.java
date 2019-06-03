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
