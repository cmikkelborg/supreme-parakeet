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
