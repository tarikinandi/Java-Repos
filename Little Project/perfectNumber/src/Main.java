public class Main {
    public static void main(String[] args) {
        int num = 12;
        int total = 0;

        for (int i = 1 ; i < num ; i++){

            if (num % i == 0){
                total = total + i;
                }
            }



        if (total == num){
            System.out.println(num + " : Perfect Number.");
        }
        else {
            System.out.println(num + " : Not Perfect Number.");
        }
    }
}