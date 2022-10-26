package java07;

public class Boat extends Vehicle{
    public Boat(String name) {
        super(name);
    }

    @Override
    public String doStuff() {
        return "I am "+ brand + " and I go glug glug! ";
    }
}
