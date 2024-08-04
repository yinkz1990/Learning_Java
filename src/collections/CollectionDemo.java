package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<String>();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        System.out.println(collection.contains("b"));
        Collections.addAll(collection, "e","f","g");
        for(var collect : collection)
            System.out.println(collect);
        System.out.println(collection);
        collection.clear();
        System.out.println(collection);
        System.out.println(collection.isEmpty());



    }
}
