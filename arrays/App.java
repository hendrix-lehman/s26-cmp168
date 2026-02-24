// add package name here if needed
//
class App {

  public static void printStringArray(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr[" + i + "] = " + arr[i]);
    }
  }

  public static void printIntArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr[" + i + "] = " + arr[i]);
    }
  }

  public static void main(String[] args) {
    
    int[] nums = new int[7]; // we can declare an array by just providing the size using the keyword "new"
    System.out.println("nums[size] = " + nums.length);


    String[] names; // declare first, then initialize by providing the size using the "new" keyword 
    names = new String[5]; // we can also declare an array in two steps, first by declaring the variable and then by initializing it with the "new" keyword
    names[0] = "Alice"; // we can assign values to the array elements using their index
    names[1] = "Bob";
    names[2] = "Charlie";
    names[3] = "David";
    names[4] = "Eve";
    // names[5] = "Frank"; // this will throw an ArrayIndexOutOfBoundsException because the index 5 is out of bounds for an array of size 5

    String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix"}; // we can also declare and initialize an array in one step by providing the values directly
    //
    // System.out.println("cities[0] = " + cities[0]);

    for (int i = 0; i < cities.length; i++) {
      System.out.println("cities[" + i + "] = " + cities[i]);
    }

    for (String city : cities) { // we can also use a for-each loop to iterate through the array
      System.out.println("city = " + city);
    }

    System.out.println("done");

    // swap two elements in the array
    // Houston <-> New York
    String temp = cities[0]; // store the value of the first element in a temporary variable. New York is stored in temp
    cities[0] = cities[3]; // assign the value of the fourth element (Houston) to the first element
    cities[3] = temp; // assign the value stored in temp (New York) to the fourth element

    System.out.println("after swapping Houston and New York:");
    for (String city : cities) {
      System.out.println("city = " + city);
    }

    // String[] citiesCopy = cities; // this does not create a new array, it just creates a new reference to the same array in memory
    String[] citiesCopy = new String[cities.length]; // this creates a new array with the same size as the original array
    // loop to copy each element from the original array to the new array
    for (int i = 0; i < cities.length; i++) {
      citiesCopy[i] = cities[i]; // copy each element from the original array to the new array
    }

    System.out.println("citiesCopy:");
    for (String city : citiesCopy) {
      System.out.println("city = " + city);
    } 

    String[] moreCities = new String[cities.length * 2]; // create a new array with double the size of the original array
    // now, we can copy the elements from the original array to the new array, and the remaining elements will be null by default
    for (int i = 0; i < cities.length; i++) {
      moreCities[i] = cities[i]; // copy each element from the original array to the new array
    }
    cities = moreCities; // now we can assign the new array to the original array variable, effectively resizing the original array
    System.out.println("cities after resizing:");
    System.out.println("cities.length = " + cities.length);

    for (String city : cities) {
      System.out.println("city = " + city);
    }

    cities[5] = "Philadelphia"; // we can assign values to the new elements in the resized array
    cities[6] = "San Antonio";
    cities[7] = "San Diego";
    cities[8] = "Dallas";
    cities[9] = "San Jose";

    System.out.println("cities after adding more cities:");
    // for (String city : cities) {
      // System.out.println("city = " + city);
    // }
    printStringArray(cities); 
  }
}

