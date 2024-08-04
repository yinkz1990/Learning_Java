package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void show(){
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("Olayinka","e1"));
        customers.add(new Customer("Tolulope", "e2"));
        customers.add(new Customer("Oluwasegun","e3"));
        System.out.println(customers.size());
        customers.add(0,new Customer("Saida", "e4"));
        customers.add(customers.size(),new Customer("mariam","e5"));
        System.out.println(customers);
        System.out.println(customers.get(0).compareTo(customers.get(2)));
        Collections.sort(customers, new Emailcomparator());
        System.out.println(customers);
    }
}
