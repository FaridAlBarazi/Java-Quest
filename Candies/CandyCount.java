package Candies;

public class CandyCount {
    public static void main(String[] args) {
        double money=12.4;
        double price= 1.2;
        int candies=0;
        boolean b = money > 0 && price > 0;
        if (money>0 && price>0 )
            while ((money-price)>=0){
                    candies++;
                    money=money-price;
            }
    }
}
