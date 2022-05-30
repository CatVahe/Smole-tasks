import java.util.Arrays;

/*
6.	1. Ստեղծել երկչափ զանգված լցնել այն 0-10 էլեմենտներով,
 տպել այն, այնուհետև տպել գլխավոր անկյունագծից ներքև գտնվող տարրերը,
 Ստեղծել երկչափ զանգված լցնել այն 0-10 էլեմենտներով, տպել այն, այնուհետև
 տպել երկրորդական անկյունագծից ներքև գտնվող տարրերը,
 8.	3.Ստեղծել երկչափ զանգված լցնել այն 0-10 էլեմենտներով, տպել այն այնուհետև ստեղծել
 նոր զանգված, որի մեջ կլինեն յուրաքանչուր տողի փոքրագույն էլեմենտը, տպել այդ նոր զանգվածը
 9.	4.  Ստեղծել երկչափ զանգված լցնել այն 8x8 չափանի, տպել այն այնուհետև ստեղծել հեռացնել
 գլխավոր և երկրորդական անկյունագծի վրա գտնվող տարրերը և տպել այն:
 */
public class ArraysDouUtil {
    public static void main(String[] args) {
        int [][] array = arrayCreate();
        mainDiagonalDown(array);
        System.out.println();
        secondDiagonalDown(array);
        System.out.println();
        printArray(array);
        System.out.println(Arrays.toString(minElementArray(array)));

    }
    private static int[][] arrayCreate (){
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] =(int) (Math.random()*10);
              //  array[i][j] = j;
            }
        }
        return array;
    }
    private static void mainDiagonalDown (int [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(j <= i)
                System.out.print(array[i][j] + " ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    private static void secondDiagonalDown (int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = array[i].length - 1, k = 0; j >= 0; j--, k++) {
                if(j <= i)
                    System.out.print(array[i][k] + " ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    private static void printArray (int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static int minNumber(int [] array) {
        int min = array[0];
        for (int number :
                array) {
            if (number <= min)
                min = number;
        }
        return min;
    }
    private static int[] minElementArray (int[][] array){
        int [] minElementArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            minElementArr[i] = minNumber(array[i]);
        }
        return minElementArr;
    }

}
