package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise15 {
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
        int sumKL = 0;
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Count: " + n);

        int countExceptKL = 0;
        for (int i = kIndex; i < length; i++) {
            if (i <= lIndex) {
                countExceptKL++;
                sumKL += numbers[i];
            }
        }
        System.out.println("Sum KL: " + sumKL);
        System.out.println("count between K and L: " + countExceptKL);
        System.out.println(kIndex + " va " + lIndex + " indekslari orasidagi elementlardan tashqari bo'lgan elementlarining o'rta afirmetigi: " + (sum - sumKL) / (n - countExceptKL) + " ga teng");
    }
}
