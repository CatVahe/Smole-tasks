import java.util.Scanner;

/*int[] numbers = { -4, -3, -2, -100, 0, 1, 200, 3, 4 }; գտնել և տպել զանգվածի min և max էլեմենտները

 */
public class p4ex3 {
    public static void main(String[] args) {
        try {
            final int [] array = arrayCreate();
            System.out.println(minNumber(array));
            System.out.println(maxNumber(array));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private static int [] arrayCreate (){
        final Scanner scanner = new Scanner(System.in);
        int [] array= new int[10];
        for (int i = 0; i < array.length ; i++) {
            if(scanner.hasNextInt())
            array[i] = scanner.nextInt();
            else throw new RuntimeException();
        }
        return array;
    }
    private static int maxNumber(int [] array){
        int max = array[0];
        for (int number :
                array) {
            if(number >= max)
                max = number;
        }
        return max;
    }
    private static int minNumber (int [] array){
        int min = array[0];
        for (int number:
              array) {
            if(number <= min)
                min = number;
        }
        return min;
    }
}
