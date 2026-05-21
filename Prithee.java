import java.util.Scanner;
import java.util.Random;

public class Prithee {

    static String[] words = {
        "Two", "households", "both", "alike", "in", "dignity",
        "In", "fair", "Verona", "where", "we", "lay", "our", "scene",
        "From", "ancient", "grudge", "break", "to", "new", "mutiny",
        "Where", "civil", "blood", "makes", "civil", "hands", "unclean",
        "From", "forth", "the", "fatal", "loins", "of", "these", "two", "foes",
        "A", "pair", "of", "star-cross'd", "lovers", "take", "their", "life",
        "Whose", "misadventured", "piteous", "overthrows",
        "Do", "with", "their", "death", "bury", "their", "parents", "strife",
        "The", "fearful", "passage", "of", "their", "death-mark'd", "love",
        "And", "the", "continuance", "of", "their", "parents", "rage",
        "Which", "but", "their", "children's", "end", "nought", "could", "remove",
        "Is", "now", "the", "two", "hours", "traffic", "of", "our", "stage",
        "The", "which", "if", "you", "with", "patient", "ears", "attend",
        "What", "here", "shall", "miss", "our", "toil", "shall", "strive", "to", "mend"
    };

    static String sonnet =
        "Two households, both alike in dignity,\n" +
        "In fair Verona, where we lay our scene,\n" +
        "From ancient grudge break to new mutiny,\n" +
        "Where civil blood makes civil hands unclean.\n" +
        "From forth the fatal loins of these two foes\n" +
        "A pair of star-cross'd lovers take their life;\n" +
        "Whose misadventured piteous overthrows\n" +
        "Do with their death bury their parents' strife.\n" +
        "The fearful passage of their death-mark'd love,\n" +
        "And the continuance of their parents' rage,\n" +
        "Which, but their children's end, nought could remove,\n" +
        "Is now the two hours' traffic of our stage;\n" +
        "The which if you with patient ears attend,\n" +
        "What here shall miss, our toil shall strive to mend.";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int correct = 0;
        int incorrect = 0;

        System.out.println("Guess the missing word! First to 3 wins or loses.\n");

        while (correct < 3 && incorrect < 3) {
            // Pick a random word
            int index = random.nextInt(words.length);
            String target = words[index];

            // Print sonnet with that word replaced by underscores
            String blank = target.replaceAll("[a-zA-Z]", "_");
            String displayed = sonnet.replace(target, blank);
            System.out.println(displayed);

            // Ask user
            System.out.print("What is the missing word? > ");
            String guess = scanner.nextLine().trim();

            if (guess.equalsIgnoreCase(target)) {
                correct++;
                System.out.println("Correct! The word was: " + target);
            } else {
                incorrect++;
                System.out.println("Wrong! The word was: " + target);
            }

            System.out.println("Score: " + correct + " correct, " + incorrect + " wrong\n");
        }

        if (correct >= 3) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }

        scanner.close();
    }
}
