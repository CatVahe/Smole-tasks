import java.util.Scanner;

/*
1.	Console  պատուհանում մուտքագրվում է կամայական տեքստ և երբ կսեղմվի Enter արդյունքում կասվի
 թե Console -ի մեջ ամենաերկար բառը որն էր։
 */
public class ex4p1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String string = scanner.nextLine();
        System.out.println(longWord(string));
    }
    private static String longWord(String string){
        String [] words = string.split(" ");
        int lengthWord = words[0].length();
        String longWord = words[0];
        for (String word : words) {
            if (word.length() > lengthWord)
                longWord = word;
        }
        return longWord;
    }
}
