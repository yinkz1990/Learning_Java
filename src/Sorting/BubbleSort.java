package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void show(){

        int [] arr = {6,5,2,4,1,3};
        int temp = 0;

        for(var i = 0; i < arr.length; i++){
            System.out.println(i);
            for (var j = 0; j < arr.length-1; j++){
                System.out.println(j);
                if(arr[i] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
