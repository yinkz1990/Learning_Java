public class smallMountainBike extends mountainBike{
    public smallMountainBike(int gear, int brake, int accelerate, int height){
       super(gear,brake,accelerate,height);
    }

    static {
        System.out.println("We are in the child class");
    }


}
