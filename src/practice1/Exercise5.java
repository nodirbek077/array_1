package practice1;

public class Exercise5 {
    public static void main(String[] args) {
        /**
         * 5. n ta elementdan tashkil topgan massiv va R butun soni berilgan.
         * Massiv elementlari orasidan R soniga eng yaqin sonni topuvchi programma tuzilsin.
         * (la[k] - R❘ ayirma eng kichik bo'luvchi a[k] topilsin)
         */

        int[] numbers = {1, 7, 80, 41, 6};
        int r = 8;
        int n = numbers.length;

        int[] resNumbers = new int[n];

        //explanation of this problem
        //12 - 1 = 11
        //12 - 7 = 5
        //12 - 80 = 68
        //12 - 41 = 29
        //12 - 6 = 6

        //yangi arrayga qiymatlarni set qilamiz
        for (int i = 0; i < n; i++) {
            int difference = r - numbers[i];
            int absoluteDiff = Math.abs(difference);
            resNumbers[i] = absoluteDiff;
        }

        //yangi array elementlaridan eng kichigini topamiz
        int min = resNumbers[0];
        for (int j = 0; j < resNumbers.length; j++) {
            if (resNumbers[j] < min) {
                min = resNumbers[j];
            }
        }

        for (int k = 0; k < numbers.length; k++) {
            if (r == numbers[k] + min){
                System.out.println(r + " ga eng yaqin bo'lgan son: " + numbers[k]);
                break;
            }
        }
    }
}
