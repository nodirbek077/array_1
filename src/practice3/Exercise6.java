package practice3;

import util.ArrayUtil;
/*
6. n ta elementdan iborat massiv berilgan (n juft son).
   Massivning birinchi yarmi va ikkinchi yarmi qiymatlari almashtirilsin.
 */
public class Exercise6 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int arrayLength = numbers.length;

        if (arrayLength % 2 != 0) {
            System.out.println("You must enter even number of array length!");
            return;
        }


    }
}
