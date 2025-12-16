package practise5;

import util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

/**
 * 2. n ta elementdan tashkil topgan massiv va k, m butun sonlari berilgan (0<= k < m < n). Indeksi k dan m gacha bo'lgan elementlarni
 * o'chiruvchi programma tuzilsin. Hosil bo'lgan massiv elementlar soni va elementlari chiqarilsin.
 */
public class Exercise2 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int n = numbers.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number k (0<= k < m < n): ");
        int k = sc.nextInt();

        System.out.print("Enter the number m (0<= k < m < n): ");
        int m = sc.nextInt();

        if (k < 0){
            System.out.print(k + " cannot be negative");
            return;
        }

        if (k >= m){
            System.out.print(k + " cannot be equal or greater than " + m);
            return;
        }

        if (k >= n){
            System.out.print(k + " cannot be equal or greater than " + n + " that is the length of the array");
            return;
        }

        if (m >= n){
            System.out.print(m + " cannot be equal or greater than " + n + " that is the length of the array");
            return;
        }

        int index = 0;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++){
            if (i <= k && i <= m){
                temp[index] = numbers[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(temp));

        int[] temp1 = new int[index];
        for (int i = 0; i < index; i++){
            temp1[i] = temp[i];
        }
        System.out.println(Arrays.toString(temp1));

    }
}
