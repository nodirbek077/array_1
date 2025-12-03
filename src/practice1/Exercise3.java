package practice1;

public class Exercise3 {
    public static void main(String[] args) {
        int[] numbers = {3, 13, 80, 7, 19, 4};

        int n = numbers.length;
        for (int i = 0; i < n; i += 2) {
            System.out.println(numbers[n - i - 1]);
        }
    }
}
