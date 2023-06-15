public class Main {
    public static void main(String[] args) {
        String[][] citys = new String[3][2];


        citys[0][0] = "İstanbul";
        citys[0][1] = "Bursa";
        citys[1][0] = "İzmir";
        citys[1][1] = "Aydın";
        citys[2][0] = "Adıyaman";
        citys[2][1] = "Gaziantep";

        for (int i = 0 ; i < 3 ; i++){
            if (i == 0 ){
                System.out.println("-------------Marmara Region-------------");
            } else if (i == 1) {
                System.out.println("-------------Ege Region-------------");
            }else{
                System.out.println("-------------Southeastern Anatolia Region-------------");
            }
            for (int j = 0 ; j < 2 ; j++){
                System.out.println(citys[i][j]);
            }
        }
        

    }
}