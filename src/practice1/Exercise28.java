package practice1;

import util.ArrayUtil;

/**
 * 28. n ta elementdan tashkil topgan massiv berilgan. Massiv elementlari orasida aniq 2 ta bir xil qiymatli element
 * bor. Shu bir xil qiymatli elementlar indeksini chiqaruvchi programma tuzilsin.
 */
public class Exercise28 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int arrayLength = numbers.length;

        //[10, 2, 30, 2]
        int counter = 0;//if counter equals 2, so this array has 2 number as considered
        int indexI = 0;
        int indexJ = 0;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if (numbers[i] == numbers[j] && i != j) {
                    counter++;
                    if (counter == 1) {
                        indexI = i;
                        indexJ = j;
                    }
                }
            }
            if (counter == 1) {
                break;
            }
        }
        if (counter == 0) {
            System.out.println("Massivda 2 ta bir xil qiymatli elementlar mavjud emas!");
            return;
        }

        if (counter > 1) {
            System.out.println("Massivda bir xil bo'lgan elementlar soni 2 tadan ko'p!");
            return;
        }

        System.out.print("Bir xil qiymatli elementlar indekslari: " + "(" + indexI + ", " + indexJ + ")");
    }
}
