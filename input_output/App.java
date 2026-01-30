import java.util.Scanner;

class App {

  public static void main(String[] args) {
    
    // if I want to capture input from the user's keyboard, I can use the Scanner class
    Scanner scanner = new Scanner(System.in);
    System.out.print("Give me a lucky number between 1 and 10: ");
    int luckyNumber = scanner.nextInt();
    String message = "That's awesome.";
    int x = 5;
    System.out.println("Your lucky number is: " + (luckyNumber + x));
    System.out.printf("Your lucky number is: %d%d\n", luckyNumber, x);
    
  }
}

