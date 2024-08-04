public class Bicycle {

    int speed;
    int brake;
    int accelerate;

    public Bicycle (int gear, int brake, int accelerate){
        this.speed = gear;
        this.brake = brake;
        this.accelerate = accelerate;
    }

    public int getAccelerate() {
        return accelerate;
    }

    public int getSpeed(){
        return speed;
    }

    public int getBrake(){
        return brake;
    }

    public void setAccelerate(int accelerate) {
        this.accelerate = accelerate;
    }

    public void setBrake(int brake) {
        this.brake = brake;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }


    int appliedBrake(int decrease){
        return speed -= decrease;
    }

    int pressAccelerator(int increase){
        return speed += increase;
    }

    public void run(){
        System.out.println("The bicycle runs");
    }
}
