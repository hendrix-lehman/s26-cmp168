// add package name here if needed
//
class App {

  private String name;
  private int version;
  private String author;

  public static void main(String[] args) {

    // declare variable
    int x;
    // and then assign value
    x = 42; // assign value to x
    //
    // x = "Hello, World!"; // This will cause a compile-time error because x is declared as int

    // we declare variables and assign values
    int a = 5;
    int b = 10;
    System.out.println("Sum: " + (a + b));

    // primitive types in Java
    // byte, short, int, long, float, double, char, boolean
    // they are stored directly in stack memory. The size is known at compile time.
    //

    // reference types in Java
    // String, Arrays, Classes, Interfaces
    // they are stored in heap memory. The size can be dynamic and is determined at runtime.

    // create an object of App class
    // myApp is a reference variable that holds the address of the App object in heap memory
    App myApp = new App();


    // dealing with bytes
    // 0000 0000  -> 0
    // 0000 0001  -> 1
    // 0000 0010  -> 2
    // ...
    // 0111 1110  -> 126
    // 0111 1111  -> 127
    // 1000 0000  -> -127
    // ...
    // 1111 1111  -> -128
    // a byte is 8 bits and can hold values from -128 to 127
    byte byteValue = 100;
    System.out.println("Byte Value: " + byteValue);

    byte anotherByteValue = 100;
    System.out.println("Another Byte Value: " + anotherByteValue);

    // 200 in bytes will cause overflow
    // 200 = 1100 1000
    // in two's complement, it will be interpreted as -56
    byte sum = (byte) (byteValue + anotherByteValue); // need to cast to byte
    System.out.println("Sum of Bytes: " + sum);

    // an overflow example
    int intMax = Integer.MAX_VALUE; // 2,147,483,647
    System.out.println("Integer Max Value: " + intMax);
    int overflowedValue = intMax + 55;
    System.out.println("Overflowed Value: " + overflowedValue);

    // 0111 1111 1111 1111 1111 1111 1111 1111  -> 2,147,483,647
    // 0000 0000 0000 0000 0000 0000 0011 0111  -> 55
    // ---------------------------------------
    // 1000 0000 0000 0000 0000 0000 0011 0110  -> -2,147,483,594 (overflowed value)
    
   
    // constants in Java
    final double PI = 3.14159;
    // PI = 2.215; // This will cause a compile-time error because PI is declared as final
    //
    //
    byte b1 = 50;
    System.out.println("Byte b1: " + b1);
    int i1 = 200;
    System.out.println("Int i1: " + i1);
    b1 = (byte) i1; // This will cause a compile-time error because of possible lossy conversion from int to byte
    System.out.println("Byte b1 after assignment from int i1: " + b1); // b1 will hold the value of 200 % 256 = -56 due to overflow
  }
}

