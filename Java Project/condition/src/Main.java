public class Main {
    public static void main(String[] args) {
        int num = 20;
        if (num < 20) {
            System.out.println("The number is less than 20.");
        } else if (num == 20) {
            System.out.println("The number is 20.");
        } else {
            System.out.println("The number is more than 20.");
        }

        //Example 1
        int num1 = 10;
        int num2 = 20;
        int num3 = 67;

        int biggest = num1;

        if (biggest < num2) {
            biggest = num2;
        }
        if (biggest < num3) {
            biggest = num3;
        }
        System.out.println("The biggest number : " + biggest);

        //Switch - Case

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Perfect : You passed.");
                break;
            case 'B':
                System.out.println("Great : You passed.");
                break;
            case 'C':
                System.out.println("Well Done : You passed.");
                break;
            case 'D':
                System.out.println("Not bad : You passed");
                break;
            case 'F':
                System.out.println("Bad : You couldn't pass.");
                break;
            default:
                System.out.println("Please enter valid value.");
        }
    }
}