package practice3;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 7. n ta elementdan iborat massiv berilgan.
 * Massivning elementlari teskari tartibda joylashtirilsin.
 * (DIQQAT: Sizdan teskari tartibda chiqarish talab qilinayotgani yo'q.
 * a[0] element a[n-1] bilan almashsin, va hakazo, teskari tartibda joylashtirish talab qilinyapti)
 */
public class Exercise7 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int arrayLength = numbers.length;
        int temp;

        for (int i = 0; i < arrayLength; i++) {
            temp = numbers[i];
            numbers[i] = numbers[arrayLength - i - 1];
            numbers[arrayLength - i - 1] = temp;
            if (i == arrayLength / 2) {
                break;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
