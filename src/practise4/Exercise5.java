package practise4;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 5. n ta butun sonlardan iborat a massiv berilgan (n <= 15).
 * a massivining toq indeksdagi elementlaridan b massivni hosil qiling (a1, a3, ...).
 * b massiv elementlari soni va elementlarini chiqaruvchi programma tuzing. Shart operatori ishlatilmasin.
 */
public class Exercise5 {
    public static void main(String[] args) {
        int[] a = ArrayUtil.getArrayElements();
        int[] temp = new int[a.length];
        int index = 0;

        if (a.length > 15){
            System.out.println("Array length must less than 15 elements");
            return;
        }

        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 != 0){
                temp[index] = a[i];
                index++;
            }
        }
        System.out.println("Temporary array elements: " + Arrays.toString(temp));

        int[] b = new int[index];
        for (int i = 0; i < index; i++){
            b[i] = temp[i];
        }
        System.out.println("b array elements: " + Arrays.toString(b));
    }
}
