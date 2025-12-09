package practice2;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = num;
            num *= 2;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
