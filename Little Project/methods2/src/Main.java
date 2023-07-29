public class Main {
    public static void main(String[] args) {
        String message = "Weather is very good today.";
        String newMessage = message.substring(0,7);
        System.out.println(newMessage);

        String city = city("Bursa");
        System.out.println(city);

        int total = sum2(1,2,5,7,9,320);
        System.out.println(total);
    }

    public static void add(){
        System.out.println("Added.");
    }
    public static void delete(){
        System.out.println("Deleted.");
    }
    public static void update(){
        System.out.println("Updated.");
    }

    public static int sum(int num1 , int num2) {
        return num1 + num2;
    }
    public static int sum2(int... nums){
        int total = 0;
        for (int num : nums){
            total += num;
        }
        return total;
    }
    public static String city(String city){
        return city;
    }

}