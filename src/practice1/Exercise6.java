package practice1;

public class Exercise6 {
    public static void main(String[] args) {
        int[] numbers = {1, 7, 80, 41, 6};
        int n = numbers.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 != 0) {
                count++;
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println("Toqlar soni: " + count);
    }
}
