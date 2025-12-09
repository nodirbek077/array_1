package practice2;//Amaliyot2:massivni hosil qilish

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int n = 8;
        int[] numbers = new int[n];
        int num = 1;
        for (int i = 0; i < n; i++) {
            numbers[i] = num;
            num += 2;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
