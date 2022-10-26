package java06;

public class Classroom extends Wilder{
    public Classroom(String firstname, boolean aware) {
        super(firstname, aware);
    }

    public static void main(String[] args){

        Wilder farid = new Wilder("farid",true);
        Wilder ali = new Wilder ("Batman",false);
        Wilder anto = new Wilder("Robin",true);

        System.out.println(farid.whoAmI());
        System.out.println(ali.whoAmI());
        System.out.println(anto.whoAmI());

    }

}
