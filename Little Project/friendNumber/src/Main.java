public class Main {
    public static void main(String[] args) {
        int num1 = 220;
        int num2 = 284;

        int total1 = 0;
        int total2 = 0;

        for (int i = 1 ; i <= num1 / 2 ; i++){
            if (num1 % i == 0){
                total1 = total1 + i;
            }
        }
        for (int j = 1; j <= num2 / 2 ; j++){
            if (num2 % j == 0){
                total2 = total2 + j;
            }
        }

        if (total1 == num2 && total2 == num1){
            System.out.println(num1+"-"+num2+" : Friend Number");
        }
        else {
            System.out.println(num1+"-"+num2+" : Not Friend Number");
        }
    }
}