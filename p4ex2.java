/*
2.	int[] numbers = { -4, -3, -2, -1, 0, 1, 2, 3, 4 };  array inversion,այսինքն,
տպել այն հակառակ հերթականությամբ: */
import java.util.Scanner;

public class p4ex2 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        arrayInversion(numbers);
    }
    private static void arrayInversion(int [] numbers){
        int [] inversionArr= new int[numbers.length];
        int i = numbers.length-1;
        for (int number:
             numbers    ) {
            inversionArr[i] = number;
            i--;
        }
        for (int number :
                inversionArr) {
            System.out.print(number + " ");
        }
    }
}
