package practice1;

public class Exercise9 {
    public static void main(String[] args) {
        int[] numbers = {1, 7, 80, 4, 6};
        int n = numbers.length;
        int k = 2;
        for (int i = 0; i < n; i++) {
            if (numbers[i] % k == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
