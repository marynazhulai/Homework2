package task3;

import java.util.Arrays;
import java.util.Random;

public class ThirdExercise {
    public static void main(String[] args) {
        Random r = new Random(2);
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt();
        }
        for (int a : array) {
            System.out.println(a);
        }

    }
}
