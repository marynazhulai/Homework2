package task9;

import java.util.Arrays;
import java.util.Random;

public class NinthExercise {
    public static void main(String[] args) {

        Random r = new Random(2);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt();
        }
        System.out.println(Arrays.toString(array));


        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(array));


        }
    }
