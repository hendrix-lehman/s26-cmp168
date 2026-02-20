// add package name here if needed
//
class App {

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
  }
}

