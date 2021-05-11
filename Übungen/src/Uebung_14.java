import java.util.Random;

import static java.lang.Math.random;

public class Uebung_14 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : arr) {
            System.out.println(i);
        }
        
        for (int i = 0; i < arr.length; i++) {
            int j = (int) (arr.length * Math.random());
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        System.out.println();
        for (int i : arr) {
            System.out.println(i);
        }
    }
}