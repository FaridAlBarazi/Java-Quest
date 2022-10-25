package java_04_quest;

public class Movies {
    String[] film = {
            "Indiana Jones et le Royaume du Crâne de Cristal",
            "Indiana Jones et la Dernière Croisade",
            "Indiana Jones et le Temple maudit "};

    String[] cristalActor = {"Harrison Ford", "Shia LaBeouf", "Karen Allen"};
    String[] crusadeActor = {"Harrison Ford", "Sean Connery", "Denholm Elliott"};
    String[] templeActor={"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"};

    String[][] titleActor=new String[][] {
            cristalActor,
            crusadeActor,
            templeActor
    };
    public void main(String... args){
        for (int i = 0 ; i < this.film.length ; i++ ) {
            System.out.println("Dans le film"+film[i]+"les principaux acteurs sont "+titleActor[i]);

        }

    }
}



