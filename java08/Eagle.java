package java08;


public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }



    @Override

    public void takeOff() {
            if (!this.flying && this.altitude == 0){
                this.flying = true;
                    System.out.printf("%s takeoff to th sky. %n", this.getName());
            }

    }
    @Override
    public int ascend(int meters) {
        if (this.flying){
            this.altitude =Math.min(this.altitude + meters,325);
                    System.out.printf("%s fly upward, altitude : %d%n", this.getName(), this.altitude);
        }
                return this.altitude;
    }

    @Override
    public int descend(int meters) {
        if (this.flying){
            this.altitude =Math.min(this.altitude - meters,325);
            System.out.printf("%s fly downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if(this.flying && this.altitude == 0){
            System.out.printf("%s landed from the sky.%n",this.getName());
        }else {
            System.out.printf("%s is too high, it can't land.%n", this.getName());
        }

    }

    @Override
    public void glide() {

    }
}
