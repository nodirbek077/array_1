package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Massiv elementlari sonini kiriting: ");
        int n = scanner.nextInt();

        int countElement = 0;
        int element = 0;

        int[] numbers = new int[n];
        while (n != countElement) {
            countElement++;

            System.out.print("Massivning " + countElement + " - elementini kiriting: ");
            element = scanner.nextInt();

            numbers[countElement - 1] = element;
        }

        System.out.println("Siz kiritgan massiv elementlari: " + Arrays.toString(numbers));
        System.out.println();

        System.out.print("1-butun sonni kiriting: ");
        int kIndex = scanner.nextInt();

        System.out.print("2-butun sonni kiriting: ");
        int lIndex = scanner.nextInt();

        if (kIndex >= lIndex) {
            System.out.println("2-butun son 1-sidan katta bo'lishi kerak!");
            return;
        }

        int length = numbers.length;//length = 5

        if (kIndex > length) {
            System.out.println("1-butun son massivning o'lchamidan katta bo'lmasligi kerak!");
            return;
        }

        if (lIndex > length) {
            System.out.println("2-butun son massivning o'lchamidan katta bo'lmasligi kerak!");
            return;
        }
        double sum = 0.0;
        //k = 0    l = 4

        int specialCount = 0;
        for (int i = kIndex; i < length; i++) {
            if (i <= lIndex) {
                specialCount++;
                sum += numbers[i];
            }
        }
        System.out.println(kIndex +"-indeksdan "+ lIndex + "-indeksgacha bo'lgan elementlarning o'rta arifmetigi: " + sum / specialCount + " ga teng");
    }
}
