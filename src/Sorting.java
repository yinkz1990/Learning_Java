import java.util.Arrays;

public class Sorting {

    public static void show(){
        int [] unsorted = {9,7,3,5,4,7};
        int temp = 0;
        System.out.println("before sorting");
        System.out.println(Arrays.toString(unsorted));
        for(int i = 0; i < unsorted.length; i++){

            for(int j = 0; j < unsorted.length - 1; j++ ){
                 if(unsorted[i] < unsorted[j]){
                     temp = unsorted[i];
                     unsorted[i] = unsorted[j];
                     unsorted[j] = temp;
                 }
            }
        }
        System.out.println("After sorting");
        System.out.println(Arrays.toString(unsorted));
    }


}
