public class Main {
    public static void main(String[] args) {
        String message = "       Weather is beauty today.          ";
        System.out.println(message);

        System.out.println("Character of number : "+ message.length()); //Herhangi bir yazının uzunluğunu bulur boşlukları da sayar.
        System.out.println("5. character : "+message.charAt(4));  // Indexi verilen karakteri bulur.
        System.out.println(message.concat(" It is perfect day."));  // Sonuna eklenecek yazıyı ekler.
        System.out.println(message.startsWith("W"));  // Mesajın belli bir harfle başlayıp başlamadığını kontrol eder.
        System.out.println(message.endsWith("z"));    // Mesajın belli bir harfle bitip bitmediğini kontrol eder.
        char[] characters = new char[7];
        message.getChars(0,7,characters,0); // Mesajın içinden bir yer seçip başka bir yere atamayı sağlar.
        System.out.println(characters);
        System.out.println(message.indexOf('a')); // İlk istenen harfi bulduğunda onun indexini verir.
        System.out.println(message.lastIndexOf("od")); // Aramaya sondan başlayarak  istenen ilk indexi verir.

        String newMessage = message.replace(' ' , '*');
        System.out.println(newMessage);

        System.out.println(message.substring(2));
        System.out.println(newMessage.substring(8,10));

        for (String word: message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}