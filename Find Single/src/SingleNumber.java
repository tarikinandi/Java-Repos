public class SingleNumber {

    public int findNumber(int[] list){
        int result = 0;
        for (int i = 0 ; i < list.length ; i++){
            result = result ^ list[i];
        }
        return result;
    }

}
