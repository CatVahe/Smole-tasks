import java.util.Scanner;

/*
1.	int[] numbers = { -4, -3, -2, -1, 0, 1, 2, 3, 4 }; Գտնել և տպել զանգվածի դրական թվերի քանակը:
 */
public class p4ex1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
                int [] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        System.out.println(pNumberCount(number));

    }
    private static int pNumberCount (int [] number){
        int count = 0;
        for (int pNumber :
                number) {
            if (pNumber > 0)
                count++;
        }
        return count;

    }

}
