package practice1;

public class Exercise4 {
    public static void main(String[] args) {
        int[] numbers = {3, 13, 80, 7, 19, 4};
        int n = numbers.length;

        System.out.print("Massivning juft indexlari: ");
        for (int i = 0; i < n; i += 2) {
            System.out.print(numbers[i]);

            if (i < n - 2) {
                System.out.print(", ");
            }
        }

        System.out.println();

        System.out.print("Massivning toq indexlari: ");
        for (int i = 0; i < n; i += 2) {
            System.out.print(numbers[i + 1]);

            if (i + 1 < n - 2) {
                System.out.print(", ");
            }
        }
    }
}
