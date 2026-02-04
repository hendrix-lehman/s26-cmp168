// add package name here if needed
//
class App {

  public static void main(String[] args) {

    // iteration using Java's loop statements
    // for loop
    // while loop
    // do-while loop
    // for-each loop
    // nested loops
    //

    // there are multiple things going on between the parentheses of a for loop
    // 1. initialization, only runs once at the beginning
    // int i = 1;
    // 2. condition, checked before each iteration
    // i <= 5;
    // 3. increment/decrement, runs after each iteration
    // i++
    // int i = 1;
    // for loops are useful when the number of iterations is known beforehand
    // like array or a range of numbers
    int[] numbers = {10, 20, 30, 40, 50}; // arrays are ordered by their index, starting at 0
    // for (/*initialization*/; /* condition */ ; /*increment*/) {
    // for (int i = 1; i <= 5; i++) {
    for (int i = 0; i < numbers.length ; i++) {
      System.out.println("Beginning For Loop Iteration: " + i);
      // System.out.println("Inside For Loop");
      // System.out.println("Ending For Loop Iteration: " + i);
      // i++; // increment
    }

    // while loop
    int j = 1; // initialization
    while (j <= 5) { // condition
      System.out.println("While Loop Iteration: " + j);
      j++; // increment
    }
    
  }
}

