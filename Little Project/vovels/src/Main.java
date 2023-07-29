public class Main {
    public static void main(String[] args) {
//        String vowel = "E";
//        String x = vowel.toLowerCase();
//        System.out.println(x);
//
//        if (x == "a" | x == "ı" | x == "o" | x == "u" ){
//            System.out.println(vowel +" : bold vowel");
//        }
//        else if (x == "e" | x == "i" | x == "ö" | x == "ü") {
//            System.out.println(vowel +" : thin vowel");
//        }
//        else {
//            System.out.println("Wrong character.");
//        }

        char vowels = 'A';

        switch (vowels){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(vowels + " = Bold Vowel");
                break;
            default:
                System.out.println(vowels + " = Thin Vowel");
        }

    }
}