import java.util.Arrays;

/*
	Ստեղծում ենք կլասս ArrayUtil անունով, իրա մեջ էլ main-մեթոդը։
Ստեղծում ենք int-երի 10 էլեմենտանի միաչափ մասիվ, մեջը լցնելով պատահական թվեր։
•	Անմիջապես տակը, օգտագործելով մեր ցիկլերի(for) ու պայմանի(if) օպերատորների կիրառմամբ գրում ենք կոդ,
որը կգտնի մեր մասիվի ամենամեծ թիվը:
•	Էլի նույն մասիվը թող մնա հայտարարած, տպեք մասիվի բոլոր զույգ էլեմենտները, հետո առանձին for-ով կտպեք
միայն կենտերը։
•	Հետո գտեք զույգերի քանակը, և տպեք։

o	տպեք զանգվածի բոլոր զույգ թվերի արտադրյալը։
 Հետո գտեք մասիվի բոլոր թվերի միջին թվաբանականը
(բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
•	Զաբգվածի բոլոր բացասական թվերը դարձնել 0
•

o	օրինակ՝ [2,4,-5,1,-3,4]-ի դեպքում կստանանք  [2,4,0,1,0,4]։
•	Սկսում եք մտածել մասիվի էլեմենտները մեծից փոքր դասավորելու վրա:

 */
public class ArrayUtil {
    public static void main(String[] args) {
        int [] array = arrayCreate();
        System.out.println(Arrays.toString(array));
        System.out.println(maxNumber(array));
        printEvenNumber(array);
        printOddNumber(array);
        System.out.println(evenCount(array));
        System.out.println(oddCount(array));
        System.out.println(multiplyEvenNumber(array));
        System.out.println(averageArr(array));
        System.out.println(Arrays.toString(asc(array)));
        notNegative(array);
    }
    private static int[] arrayCreate(){
        int [] array= new int[10];
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) (Math.random()*40-20);
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
    private static void printEvenNumber(int [] array){
        for (int number :
                array) {
            if (number % 2 == 0)
                System.out.print(number + " ");
        }
        System.out.println();
    }
    private static int evenCount(int[] array){
        int count = 0;
        for (int number :
                array) {
            if (number % 2 == 0)
                count++;
        }
        return count;
    }
    private static int multiplyEvenNumber(int[] array){
        int result = 1;
        for (int number :
                array) {
            if (number % 2 == 0)
                result = result * number;
        }
        return result;
    }
    private static void printOddNumber(int [] array){
        for (int number :
                array) {
            if (number % 2 != 0)
                System.out.print(number + " ");
        }
        System.out.println();
    }
    private static int oddCount(int[] array){
        int count = 0;
        for (int number :
                array) {
            if (number % 2 != 0)
                count++;
        }
        return count;
    }
    private static double averageArr (int [] array){
        int sum = 0;
        for (int number :
                array) {
            sum = sum + number;
        }
        return (double) sum/array.length;
    }
    private static void notNegative (int [] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0)
                array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
    private static int [] asc (int [] array){

        for (int j = array.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}
