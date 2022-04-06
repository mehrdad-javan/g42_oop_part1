package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // create object
        Person erik = new Person("Erik", "Svensson");
        erik.setAge(40);
        //erik.displayInformation();
        //erik.myNameIs();


        Person simon = new Person();
        simon.setFirstName("Simon");
        simon.setLastName("Elbrink");
        simon.setAge(28);
        //simon.displayInformation();


        Car volvo = new Car("V60", "VOLVO", 2022, erik);
        volvo.carOwnerInformation();

        Car vw= new Car();
        vw.setOwner(simon);
        vw.setModel("VW");
        vw.setYear(2022);
        vw.setBrand("VW");

        vw.carOwnerInformation();

        /*Dog dog1 = new Dog();
        dog1.setAge(12);
        dog1.setSize(10);
        dog1.setColor("White");*/







    }
}
