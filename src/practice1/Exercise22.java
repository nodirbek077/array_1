package practice1;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 22. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv elementlari orasida, o'ng qo'shnisidan katta bo'lgan elementlarining
 * indeksini o'sish tartibida chiqaruvchi va ularning sonini chiqaruvchi programma tuzilsin.
 */

public class Exercise22 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();

        /**
         * Bu yerda masalani shartini noto'g'ri tushunib qolganligim sababli juda ko'p vaqt ketib
         * qoldi ya'ni 2 soatga yaqin vaqt ketib qoldi. Shuning uchun birinchi o'rinda masalaning
         * shartini yaxshilab tushunib olishga harakat qilishim kerak bundan keyingi masalalarda
         */
        //i - 1, i
        // [1,   4,  98,  21,  2]
        //numbers[1] > numbers[i-1]
        //i=1
        //[1,   4,  98,  21,  2]
        // 0,   1

        //i=2
        //[1,   4,  98,  21,  2]
        //      1    2
        // 98 > 4 numbers[i]=98

        //i=3
        //[1,   4,  98,  21,  2]
        //      1    2    3
        // 21 > 98 -

        //step-1. har bir i ning o'ng qo'shnisini chiqarib olishimiz kerak bo'ladi
        /*for (int i = 0; i < numbers.length; i++) {
            if (i <= numbers.length - 2) {
                System.out.println(numbers[i] + " ning o'ng qo'shnisi: " + numbers[i + 1]);
            }
        }*/

        //step-2. endi o'sha har bir i ning o'ng qo'shnisidan katta bo'lgan elementlarini
        // topib chiqishimiz kerak bo'ladi
//        for (int i = 0; i < numbers.length; i++) {
//            if (i <= numbers.length - 2) {
//                System.out.print(numbers[i + 1] + " dan katta bo'lgan elemenlari: ");
//
//                for (int j = i + 1; j < numbers.length - 1; j++) {
//                    if (numbers[j + 1] > numbers[j]) {
//                        System.out.print(numbers[j + 1] + " ");
//                    }
//                }
//                System.out.println();
//            }
//        }

        int counter = 0;
        int n = numbers.length;
        System.out.print("O'ng qo'shnisidan katta bo'lgan elementlarning indekslari (o'sish tartibida): ");

        boolean firstIndex = true;
        for (int i = 0; i < n - 1; i++) {

            //o'ng qo'shnisidan katta bo'lsa shunday qilamiz
            //masalan, [5, 2, 8, 3, 9, 1, 6]
            //5 o'zining o'ng qo'shnisi 2 dan katta, demak 5 indeksini olamiz

            if (numbers[i] > numbers[i + 1]) {
                if (!firstIndex) {
                    System.out.print(", ");
                }
                System.out.print(i);
                firstIndex = false;

                counter++;
            }
        }
        if (counter == 0) {
            System.out.print("Mavjud emas.");
        }
        System.out.println();

        //ularning umumiy sonini chiqaramiz
        System.out.println("Bunday elementlarning umumiy soni: " + counter + " ta");
    }
}
