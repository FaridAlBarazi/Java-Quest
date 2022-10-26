package java06;

public class Duck {
    private String name;
    public int age;
    private boolean swimming;

    public Duck(String name) {
        this.name = name;
        this.age = 0;
        this.swimming = false;
    }
    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
        this.swimming = false;
    }

    Duck canard = new Duck("Riri");
    Duck donald1 =new Duck("Donald", 84);
    Duck donald = new Duck("Donald", 84);

    Duck mysterMask = new Duck("Myster Mask");
    Duck albertColvert = mysterMask;
    Duck fifi = new Duck("Fifi", 8);
    //    int age = fifi.age; // error: age has private access in Duck
    public int getAge() {
        return this.age;
    }
    int agedefifi = fifi.getAge(); // 8

    //Dans le cas d'un attribut de type booléen, il ne faut pas nommer l'accesseur getAttribut mais isAttribut

    public boolean isSwimming() {
        return this.swimming;
    }

    //fifi.age = 9; // error: age has private access in Duck

    public void setAge(int age) {
        this.age = age;
    }

//    fifi.setAge(9); // 9;

}
