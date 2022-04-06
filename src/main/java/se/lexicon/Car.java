package se.lexicon;

public class Car {
  // Fields
  private String model;
  private String brand;
  private int year;
  private Person owner;

  // constructors
  public Car(){

  }

  public Car(String model, String brand, int year, Person owner){
    this.model = model;
    this.brand = brand;
    this.year = year;
    this.owner = owner;
  }

  // Methods
  public void start (){

  }

  public void stop(){

  }

  //...

  // Getters & Setters
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public Person getOwner() {
    return owner;
  }

  public void setOwner(Person owner) {
    this.owner = owner;
  }


  public void carOwnerInformation(){
    System.out.println("Carr Model: " + model);
    owner.displayInformation();
  }

}
