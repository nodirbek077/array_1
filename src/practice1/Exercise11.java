package practice1;

public class Exercise11 {
    public static void main(String[] args) {
        int[] numbers = {1, 7, 80, 4, 6};
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            if (numbers[n - 1] > numbers[i]) {
                System.out.print(numbers[i]);
                break;
            }
        }
    }
}
