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
    // for (/*initialization*/; /* condition */ ; /*increment or decrement*/) {
    // for (int i = 1; i <= 5; i++) {
    for (int i = 0; i < numbers.length ; i++) {
      System.out.println("Beginning For Loop Iteration: " + i);
      // System.out.println("Inside For Loop");
      // System.out.println("Ending For Loop Iteration: " + i);
      // i++; // increment
    }

    String[] names = {/*index 0*/"Alice", /*index 1*/"Bob", /*index 2*/"Charlie", /*index 3*/"Diana"};
    for (int i = 3; i >= 0; i = i - 2) {
      String name = names[i];
      System.out.println("Name at index " + i + ": " + name);
    }

    // for-each loop
    for (String name : names) {
      System.out.println("For-Each Loop Name: " + name);
    }

    // while loop
    int j = 1; // initialization
    while (j <= 5) { // condition
      System.out.println("While Loop Iteration: " + j);
      j++; // increment
    }

    // do-while loop
    // 
    // the condition is checked after the loop body, so the loop body is executed at least once.
    int k = 1; // initialization
    do {
      System.out.println("Do-While Loop Iteration: " + k);
      k++; // increment
    } while (k <= 5); // condition
    //
    //
    String fruit = "Apple";
    for(int i = 0; i < fruit.length(); i++) {
      char letter = fruit.charAt(i);
      System.out.println("Letter at index " + i + ": " + letter);
    }

    for (int i = 1; i <= 10; i++) {
      // every statement inside this block is part of the loop body
      // and it is executed once per iteration. A iteration is, in this case, when i is 1, when i is 2, etc.
      if (i % 2 == 0) {
        if (i == 6) {
          System.out.println("Skipping number 6");
          continue; // skip the rest of the loop body and go to the next iteration
        }
        if (i == 8) {
          System.out.println("Breaking the loop at number 8");
          break; // exit the loop entirely
        }
        System.out.println(i + " is even.");
        // this nested loop runs for each iteration of the outer loop when i is even
        for (int m = 1; m <= 3; m++) {
          System.out.println("  Nested Loop m: " + m);
        }
      }

      // this line is outside the if block, so it runs every iteration of the outer loop
      for (int n = 1; n <= 2; n++) {
        System.out.println("  Outer Loop i: " + i + ", Inner Loop n: " + n);
      }
    }
    
  }
}

