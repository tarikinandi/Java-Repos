public class Main {
    public static void main(String[] args) {
        numSearch();
    }

    public static void numSearch(){
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
            message("Number found: "+wanted);
        }
        else {
            message("Number is not found: "+wanted);
        }
    }

    public static void message(String msg){
        System.out.println(msg);
    }
}