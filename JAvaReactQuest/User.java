package JAvaReactQuest;

import java.util.Date;

public class User {

    public Date birthdate;
    public int size;
    public Photo[] photos;
    public Adress adress;

    public User(Date birthdate, int size, Photo[] photos, Adress adress) {
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.adress = adress;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}