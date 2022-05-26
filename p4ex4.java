import java.util.Arrays;

/*
4.	ստեղծել զանգված որը ունի 20 էլեմենտ, զանգավածի առաջին 2 էլեմենտներնեն 1 և 1,
իսկ 3 էլեմենտից սկսած բոլոր էլեմենտների առժեքները հավասարեն նախորդ երկու էլեմենտների
 գումարին(Ֆիբոնաչիի հաջորդականություն)
 */
public class p4ex4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrFib()));
    }
    private static int [] arrFib (){
        int[] array = new int[20];
        array[0] = array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-2] + array[i-1];
        }
        return array;
    }
}
