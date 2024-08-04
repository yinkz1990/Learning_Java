public class fortest {
    public static void fortest(){
        int[] test = {2,5,3,1};

        for(var i = 0; i < test.length; i++){

            for(var j = 0; j < test.length-1; j++){
                System.out.println("first loop");
                System.out.println(test[i]);
                System.out.println("second loop");
                System.out.println(test[j]);
            }
        }
    }
}
