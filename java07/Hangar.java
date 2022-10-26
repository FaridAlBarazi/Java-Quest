package java07;

public class Hangar {

    public static void main(String[] args){

        Car merco= new Car("benz");
        Boat sirène = new Boat("Vogue Mary");

        System.out.println(merco.doStuff());
        System.out.println(sirène.doStuff());

    }

}
