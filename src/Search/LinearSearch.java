package Search;

public class LinearSearch {
    private static int [] array = new int[]{1,2,3,4,5,6,7,8,9,10};
    private static int target = 7;

   public static int show(){
       int rt;
       rt = binarySearch(array, target);
       return rt;
   }

    public static int binarySearch(int [] array, int target){
        int a = -1;
        int step = 0;
        for (int i = 0; i <= array.length -1; i++){
            step++;
          if(array[i] == target){
              a = i;
              System.out.println(step);
              return a;
          }
        }
        System.out.println(step);
        return a;
    }

}


