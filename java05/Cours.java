package java05;

public class Cours {

    public static void main(String[] args){

        String[] moviesArray = {
                "Raiders of the Lost Ark",
                "Indiana Jones and the Temple of Doom",
                "Indiana Jones and the Last Crusade",
                "Indiana Jones and the Kingdom of he Crystal Skulls",

        };
        for (String movie : moviesArray) {
            System.out.println(movie);
        }
        String[] moviesArray2 = new String[moviesArray.length + 2];

        for(int i = 0; i < moviesArray.length; i++) {
            moviesArray2[i] = moviesArray[i];
        }

        int lastPreviousIndex = moviesArray.length - 1;

        moviesArray2[lastPreviousIndex + 1] = "Indiana Jones and the Fate of Atlantis";
        moviesArray2[lastPreviousIndex + 2] = "Indiana Jones and Facebook's Personal Data";
    }}
