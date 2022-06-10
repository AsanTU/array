import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30);
            System.out.println(array[i] + " ");
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println();
        System.out.println("Min is: " + min);

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println("Max is: " + max);

        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i]/ array.length;
        }

        System.out.println("Average is: " + average);
        }
    }
