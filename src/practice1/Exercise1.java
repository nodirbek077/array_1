package practice1;

public class Exercise1 {
    public static void main(String[] args) {
        int[] numbers = {3, 13, 80, 7, 19, 4};

        for (int i = 0; i < numbers.length; i++) {
            int reversNum = numbers.length - i - 1;
            System.out.println(numbers[reversNum]);
        }
    }
}