package practice1;

import util.ArrayUtil;

/**
 * 21. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv toq indeksli elementlari orasidan kattasini aniqlovchi programma tuzilsin.
 * max(a1, a3, a5, ...)
 */
public class Exercise21 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();

        int n = numbers.length;
        /**
         * umumiy holatda kattasini toping deyilgan masalalarda massivning 1-elementini olib ketsak bo'ladi.
         * Lekin shart qo'yilganda masalan juft yoki toq elementlari orasidan deyilganda bu narsa ishlamay qoladi
         * U holatda juft bo'lsa o'sha birinchi juft elementi max yoki nim number qilib tanlab olinadi shunda to'g'ri bo'ladi
         */
        int max = numbers[1];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
        }
        System.out.print("Kattasi: " + max);
    }
}
