import java.util.Random;

public class ServerNameGenerator {

    private static String[] adjectives = {
            "Bitter",
            "Spicy",
            "Sour",
            "Sharp",
            "Deafening",
            "Quiet",
            "Loud"
    };

    private static String[] nouns = {
            "Wealth",
            "Power",
            "Trust",
            "Wisdom",
            "Keyboard",
            "Cat",
            "Dog"
    };

    static Random randomName = new Random();

    public static String randomElement(String[] words) {
        return words[randomName.nextInt(words.length)];
    }

    public static String serverName(String a, String b) {
        return "Your new server name is: " + a + "-" + b;
    }

    public static void main(String[] args) {
        System.out.println(serverName(randomElement(adjectives), randomElement(nouns)));
//        System.out.println(serverName(randomElement(adjectives), randomElement(nouns)));
    }

}
