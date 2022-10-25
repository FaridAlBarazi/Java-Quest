class HelloWorld {
    public static void main(String[] args) {
        // display Hello World! in the terminal
        int hours =Integer.parseInt(args[0]);
        if (6 < hours && hours < 20){
            System.out.println("Hello World!");
        }
        else {
            System.out.println("Goodnight World!");
        }
    }




}