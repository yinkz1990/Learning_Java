package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ListDemo {
    public static void show (){
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        Collections.addAll(arrayList, 2,3,4,5,6,7,9,10);
        System.out.println(arrayList.get(4));
        System.out.println(arrayList.size());
        arrayList.set(0, -2);
        System.out.println(arrayList);
        var sublist = arrayList.subList(0,5);
        System.out.println(sublist);
        System.out.println(arrayList.contains(8));
        System.out.println(arrayList.lastIndexOf(2));



    }

}
