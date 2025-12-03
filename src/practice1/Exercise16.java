package practice1;


public class Exercise16 {
    public static void main(String[] args) {
        /**
         * 16. n ta elementdan tashkil topgan massiv berilgan.
         * Massiv elementlari arifmetik progressiyani tashkil qilsa,
         * ayirmani aks holda nolni chiqaruvchi programma tuzilsin.
         */

        //arifmetik progresseiyada elementlarga qo'shiladigan sonlar bir xil bo'lishi kerak masalan
        //11, 13, 15
        //s = ((a1 + an)/2)*n
        //an = a1 + (n -1) * d
        //(n-1)*d = an - a1;
        //d = (an - a1) / (n - 1)
        //bunda agar d o'zgarmas bo'lsa u holatda massivimiz arifmetik progressiya bo'lgan bo'ladi

        int[] numbers = {11, 13, 15, 17, 19};
        int n = numbers.length;

        int expectedDifference = numbers[1] - numbers[0];

        for (int i = 2; i < n; i++) {
            //i=2, numbers[2] - numbers[1]
            //i=3, numbers[3] - numbers[2]
            int currentDifference = numbers[i] - numbers[i - 1];

            if (currentDifference != expectedDifference) {
                System.out.print(0);
                return;
            }
        }
        System.out.println(expectedDifference);
    }
}
