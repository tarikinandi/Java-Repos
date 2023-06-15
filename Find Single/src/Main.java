public class Main {
    public static void main(String[] args) {
       int[] list = {1, 2, 2 , 3 , 3 , 1 , 5};
//        int size = list.length;
//        List<Integer> array = new ArrayList<>();
//
//        for (int i = 0; i < size; i++) {
//            boolean isUnique = true;
//            for (int j = 0; j < size; j++) {
//                if (i != j && list[i] == list[j]) {
//                    isUnique = false;
//                    break;
//                }
//            }
//            if (isUnique) {
//                array.add(list[i]);
//            }
//        }
//
//        System.out.println(array);

        int result = 0;
        for (int i = 0 ; i < list.length ; i++){
            result = result ^ list[i];
        }
        System.out.println(result);

    }
}