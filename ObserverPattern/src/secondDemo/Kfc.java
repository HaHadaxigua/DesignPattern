package secondDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Kfc extends Subject {
    LinkedList<Customer> customers = new LinkedList<>();

    void subscribe(Customer customer) {
        customers.add(customer);
    }

    void ok() {
        for (Customer c : customers) {
            c.get();
        }
    }
}
