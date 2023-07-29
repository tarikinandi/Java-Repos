public class Main {
    public static void main(String[] args) {
        //reference type
        CustomerManager customerManager;
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Update();

        //value
        int numb1 = 10;
        int numb2 = 20;
        numb2 = numb1;
        numb1 = 30;
        System.out.println(numb2);

        int[] numbers1 = new int[]{1,2,3};
        int[] numbers2 = new int[]{4,5,6};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]);
    }
}

