package java07;

public abstract class Vehicle {

    public String brand;
    public int kilometers;

    public Vehicle(String name) {
        this.brand = name;
        this.kilometers = 0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

     public abstract String doStuff();



}
