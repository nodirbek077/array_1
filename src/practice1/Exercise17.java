package practice1;

public class Exercise17 {
    public static void main(String[] args) {
        /**
         * 17. n ta elementdan tashkil topgan massiv berilgan.
         * Massiv elementlari geometrik progressiyani tashkil qilsa,
         * maxrajni aks holda nolni chiqaruvchi programma tuzilsin.
         */

        int[] numbers = {2, 4, 8, 16, 32};
        int n = numbers.length;

        double expectedDifference = (double) numbers[1] / (double) numbers[0];

        for (int i = 2; i < n; i++) {
            double currentDifference = (double) numbers[i] / (double) numbers[i - 1];

            if (currentDifference != expectedDifference) {
                System.out.print(0);
                return;
            }
        }
        System.out.println(expectedDifference);
    }
}
