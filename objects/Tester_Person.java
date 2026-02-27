// add package name here if needed
//
class Tester_Person {

  public static void main(String[] args) {

    System.out.println("Dogs created: " + Dog.getNumDogsCreated());

    Dog d1 = new Dog();
    System.out.println("Dogs created: " + Dog.getNumDogsCreated());
    Dog fido = new Dog();
    System.out.println("Dogs created: " + Dog.getNumDogsCreated());
    Dog scooby = new Dog("Scooby", true, 3);
    System.out.println("Dogs created: " + Dog.getNumDogsCreated());

    d1.setName("Cookie");

    Person p = new Person();
    Person p2 = new Person();
    p.adoptDog(d1);
    p.adoptDog(fido);
    p2.adoptDog(scooby);

    
  }
}

