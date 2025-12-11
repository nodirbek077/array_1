package practice3;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 9. n ta butun sonlardan iborat a massiv berilgan.
 * Massivning eng kichik va eng katta elementlari orasidagilarini nolga almashtiruvchi programma tuzilsin.
 * Eng kichik va eng katta elementlari o'zgarishsiz qoldirilsin.
 */
public class Exercise9 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int n = numbers.length;

        //1, 6, -3
        int min = numbers[0];
        int max = numbers[0];
        int minIndex = 0;
        int maxIndex = 0;

        //1. find minimum and maximum numbers
        for (int i = 0; i < n; i++) {
            if (numbers[i] < min){
                min = numbers[i];
                minIndex = i;
            }

            if (numbers[i] > max){
                max = numbers[i];
                maxIndex = i;
            }

            for (int j = minIndex; j < maxIndex; j++) {
                System.out.print(numbers[j] + " ");
            }
        }
//        System.out.println(min + " " + max);
//        System.out.println(Arrays.toString(numbers));
        //2. get array elements
    }
}
