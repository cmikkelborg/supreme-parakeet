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
