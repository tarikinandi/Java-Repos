public class Main {
    public static void main(String[] args) {
        int numb = -1;
        int remainder = numb % 2;
        int counter = numb / 2;
        boolean isPrime = true;

        if (numb == 1){
            System.out.println("Number is not prime.");
            return;
        }
        if (numb < 2){
            System.out.println("False value. Please enter a greater than one.");
            return;
        }

        for (int i= 2; i < counter ; i++) {
            if (numb % i == 0){
                isPrime = false;
            }

        }

        if (isPrime){
            System.out.println("Number is prime.");
        }
        else {
            System.out.println("Number is not prime.");
        }

    }
}