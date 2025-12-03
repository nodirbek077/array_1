package practice1;

public class Exercise8 {
    public static void main(String[] args) {
        int[] numbers = {1, 7, 80, 41, 6};
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            //juft elementlarining indexi o'sish tartibida
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        for (int i = 0; i < n; i++) {
            //toq elementlarining indexi kamayish tartibida
            int reverseIndex = n - i - 1;
            if (numbers[reverseIndex] % 2 != 0) {
                System.out.print(numbers[reverseIndex] + " ");
            }
        }
    }
}
