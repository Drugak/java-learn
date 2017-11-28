package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    static public void main(String[] args) {
        int counter = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("What number you want to calculate? ");
        int FIBONACCI_NUMBER = in.nextInt();
        int[] result = new int[FIBONACCI_NUMBER];

        do {
            if (counter < 3) {
                result[counter] = counter;
            } else {
                result[counter] = (result[counter - 1] + result[counter - 2]);
            }
            counter++;

        } while (FIBONACCI_NUMBER > counter);


        /*for (int i = 0; i < FIBONACCI_NUMBER; i++) {
            if (i < 3) {
                result[i] = i;
            } else {
                result[i] = (result[i - 1] + result[i - 2]);
            }
        }*/

        for (int number : result)
            System.out.print(number + " " + " ");
    }
}
