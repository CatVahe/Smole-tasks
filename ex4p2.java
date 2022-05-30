import java.util.Scanner;

/*
2.	Console  պատուհանում մուտքագրվում է կամայական
 տեքստ և երբ կսեղմվի Enter արդյունքում այս Console -ից կհեռացվեն կրկնվող բառերը
 */
public class ex4p2 {
    public static void main(String[] args) {
        //int k = 4;
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        System.out.println(noReplay(st));

    }
    private static String noReplay(String string){


       /* String [] words = string.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            for (String str :
                    words) {
                if (!word.equals(str)){
                    result.append(str);
                    result.append(" ");
                }

            }
        }
        return result.toString();*/

        }
    }

