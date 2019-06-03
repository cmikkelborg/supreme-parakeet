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
