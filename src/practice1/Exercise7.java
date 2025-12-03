package practice1;

public class Exercise7 {
    public static void main(String[] args) {
        int[] numbers = {1, 7, 80, 41, 6};
        int n = numbers.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int reverseIndex = n - i - 1;
            if (numbers[reverseIndex] % 2 == 0) {
                count++;
                System.out.print(numbers[reverseIndex] + " ");
            }
        }
        System.out.println("Juftlari soni: " + count);
    }
}
