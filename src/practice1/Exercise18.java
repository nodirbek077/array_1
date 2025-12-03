package practice1;

public class Exercise18 {
    public static void main(String[] args) {
        /**
         18. n ta elementdan tashkil topgan massiv berilgan.
         Massivda juft va toq elementlar ketma-ket kelishini tekshiruvchi programma tuzilsin.
         Ketma-ketlik bajarilsa nol chiqarilsin.
         Aks holda ketma- ketlikni buzgan birinchi element indeksi chiqarilsin.
         */

        int[] numbers = {2, 3, 8, 16, 32};
        int n = numbers.length;

        if (n <= 1) {
            System.out.print(0);
            return;
        }

        for (int i = 1; i < n; i++) {
            if ((numbers[i] % 2) == (numbers[i - 1] % 2)) {
                System.out.print(i);
                return;
            }
        }
        System.out.print(0);

    }
}
