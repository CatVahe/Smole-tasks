import java.util.Arrays;

/*
5.	Հայտարարել x թվային զանգված
1.	Ստանալ նոր Y զանգված, որի մեջ ավելացնել X զանգվածի այն տարրերը, որոնք գտնվում են [10,20] հատվածում։
2.	գտնել տրված զանգվածի երկրորդ մեծագույն տարրը։
 */
public class p4ex5 {
    public static void main(String[] args) {
        int [] arrayX = arrayCreate();
        int [] arrayY = new int[arrayX.length];

        for (int i = 0, j = 0; i < arrayY.length; i++) {
            if(arrayX[i] >= 10 && arrayX[i] <= 20){
                arrayY[j] = arrayX[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(arrayX));
        System.out.println(Arrays.toString(arrayY));


    }
    private static int[] arrayCreate(){
        int [] array= new int[20];
        for (int i = 0; i < array.length ; i++) {
                array[i] = (int) (Math.random()*40-20);
        }
        return array;
    }


}
