// add package name here if needed
//
class App {

  public static void main(String[] args) {
    // Create a Car object using the first constructor
    // Car car1 = new Car("Toyota", "Camry", 2020);
    Car car1 = new Car("Honda", "Civic", 2021, "Red");
    // Car car1 = new Car(); // default constructor, inherited from Object class
    
    car1.displayInfo();

    System.out.println();

    // Create a Car object using the overloaded constructor
    Car car2 = new Car("Honda", "Civic", 2021, "Red");
    // Car car2 = new Car();
    car2.displayInfo();

    System.out.println();

    System.out.println("Inherited from Object class:");
    System.out.println("String representation of car1: " + car1.toString());
    System.out.println("String representation of car2: " + car2.toString());

    System.out.println("Are car1 and car2 equal? " + car1.equals(car2));

    System.out.println("Hash code of car1: " + car1.hashCode());
    System.out.println("Hash code of car2: " + car2.hashCode());
    System.out.println("Class of car1: " + car1.getClass());
    System.out.println("Class of car1 name: " + car2.getClass().getName());

    Car car3 = new Car();
    
  }
}

