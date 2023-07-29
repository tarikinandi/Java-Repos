public class Main {
    public static void main(String[] args) {
        int[] nums = {1 , 2 , 3 , 5 , 4 , 16 , 12 , 0};
        int wanted = 4;
        boolean isThere = false;

        for (int num : nums){
            if (num == wanted){
                isThere = true;
                break;
            }
        }

        if (isThere){
            System.out.println("Number found.");
        }
        else {
            System.out.println("Number is not found.");
        }
    }
}