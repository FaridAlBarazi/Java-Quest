package java07;

public class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public String doStuff() {
        return "i am "+brand+" and I go zoom zoom zoom! ";
    }
}
