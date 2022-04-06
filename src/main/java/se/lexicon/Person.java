package se.lexicon;

public class Person {

  // Fields or States
  private String firstName; // null
  private String lastName; // null
  private int age; // 0
  private boolean sleeping;  // default value for boolean is false


  // constructors are used to initialize the instance variables of a class
  public Person() {
  }

  public Person(String firstName, String lastName, int age, boolean sleeping) {
    this(firstName, lastName);
    this.age = age;
    this.sleeping = sleeping;
  }

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  // setters and getters
  // setters and getters are used to assign the value and retrieve from the class variables
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public String getLastName(){
    return lastName;
  }

  public void setAge(int age){
    this.age = age;
  }

  public int getAge(){
    return age;
  }


  public void setSleeping(boolean sleeping){
    this.sleeping = sleeping;
  }

  public boolean isSleeping(){
    return sleeping;
  }

  public void displayInformation(){
    System.out.println("FirstName: " + firstName + " LastName: " + lastName + " Age: " + age + " Sleeping: " + sleeping);
  }


  public void myNameIs(){
    System.out.println("My Name is " + firstName + " " + lastName);
  }

}
