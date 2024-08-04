public class mountainBike extends Bicycle implements Bicycles{

    int height;

    public mountainBike(int gear, int brake, int accelerate, int height){
        super(gear, brake,accelerate);
        this.height = height ;
    }

    public int setheight (int height){
       return this.height = height;
    }

    public void run(){
        System.out.println("Mountain bike runs");
    }



@Override
    public void repairBrake() {
         height = 20;
    }
@Override
    public String lastRepairDate(){
        return "Saturday";
    }
}
