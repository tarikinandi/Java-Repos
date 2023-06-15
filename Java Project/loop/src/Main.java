public class Main {
    public static void main(String[] args) {
        //For
        for (int i = 1 ; i < 10 ; i++){
            System.out.println(i);
        }
        System.out.println("Loop is done!");

        System.out.println("New loop : ");
        for (int i = 0 ; i < 12 ; i += 2){
            System.out.println(i);
        }
        System.out.println("Second loop is done!");
        System.out.println("For loop is end. New loop While :");

        //While
        int i = 1;

        while (i < 10){
            System.out.println(i);
            i++;
        }
        System.out.println("Loop is done!");
        System.out.println("While loop is end. New loop Do-While :");

        //Do-While

        int j = 1;
        do {
            System.out.println(j);
            j += 3;
        }while (j < 15);

        System.out.println("Loop is done!");
        System.out.println("Do-While loop is end.");
        System.out.println("The loops are over.");
    }
}