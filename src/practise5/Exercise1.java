package practise5;
//Amaliyot5: Massivga element qo'shish va o'chirish

import util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. n ta elementdan tashkil topgan massiv va k butun soni berilgan (0<= k < n).
 * Indeksi k ga teng bo'lgan elementni o'chiruvchi programma tuzilsin.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();

        Scanner inner = new Scanner(System.in);
        System.out.print("Enter the number k: ");
        int k = inner.nextInt();
        int n = numbers.length;

        if (k < 0){
            System.out.println(k + " cannot be less than 0");
            return;
        }

        if (k >= n){
            System.out.println(k + " cannot be more than " + n);
            return;
        }

        int index = 0;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++){
            if (i != k){
                temp[index] = numbers[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(temp));
        int[] temp2 = new int[index];
        for (int i = 0; i < index; i++){
            temp2[i] = temp[i];
        }
        System.out.println(Arrays.toString(temp2));
    }
}
