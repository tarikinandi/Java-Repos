public class Main {
    public static void main(String[] args) {
        String student1 = "Mustafa";
        String student2 = "Mert";
        String student3 = "Melisa";

        String[] students = new String[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("\n");

        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("\nExample : ");


        //Example
        double[] myList = {1.2, 1.3, 3.7, 2.5,};
        double total = 0;
        double max = myList[0];

        for (double num : myList) {
            if (max < num) {
                max = num;
            }
            total = total + num;
            System.out.println(num);
        }
        System.out.println("Total : " + total);
        System.out.println("This list in max number : " + max);



    }
}