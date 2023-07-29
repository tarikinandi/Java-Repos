import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1 , "Tarık" , "İnandı"));
        customers.add(new Customer(2 , "Berra" , "İnandı"));
        customers.add(new Customer(3 , "Levent" , "İnandı"));
        customers.add(new Customer(4 , "Nurcan" , "İnandı"));
        customers.add(new Customer(5 , "Enes" , "İnandı"));

        for (Customer customer:customers){
            System.out.println(customer.id+": " + customer.firstName);
        }
    }
}