package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Emailcomparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}
