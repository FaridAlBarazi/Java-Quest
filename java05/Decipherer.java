package java05;

public class Decipherer {


    public static void main(String[] args){

        String[] hidenMessage = {

                "0@sn9sirppa@#?ia'jgtvryko1",
                "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
                "aopi?sedohtém@#?sedhtmg+p9l!"
        };
        int keyNumber;

        for (int i=0;i < hidenMessage.length;i++) {
            String revealedMessage;
            keyNumber = hidenMessage[i].length() / 2;

            // récupère ensuite la sous-chaîne de la longueur du chiffre-clé, en commençant à partir du 6ème caractère.
             revealedMessage=hidenMessage[i].substring(5, 5 + keyNumber);
            // remplace les chaînes '@#?' par un espace.
            revealedMessage = revealedMessage.replace("@#?", " ");
            //  inverse la chaîne de caractères.
            revealedMessage= new StringBuilder(revealedMessage).reverse().toString();
            System.out.println(revealedMessage);


        }

    }}
