import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        System.out.println(numbers.size());


        numbers.add(1);
        numbers.add(10);
        numbers.add("Bursa");
        System.out.println(numbers.size());
        System.out.println(numbers.get(2));


        numbers.set(0,100);
        System.out.println(numbers.get(0));


        //numbers.remove(0);
        //numbers.clear();
        System.out.println(numbers.get(0));

        for (Object i:numbers) {
            System.out.println(i);
            }


    }
}