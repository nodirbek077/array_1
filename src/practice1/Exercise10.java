package practice1;

public class Exercise10 {
    public static void main(String[] args) {
        //0, 4,  1, 3,  2, 2,  3, 1,  4, 0
        //numbers[0],numbers[n - 1],
        int[] numbers = {1, 7, 80, 4, 6};
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            int reverseIndex = n - i - 1;
            System.out.print(numbers[i] + "," + numbers[reverseIndex] + ",");
        }
    }
}
