package datastructures;

import java.util.Scanner;


public class HackerArrays {

    //TODO : Make this look pretty
    private int[][] testCaseOne = {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}
    };

    private int[][] testCaseTwo = {
            {-1, -1, 0, -9, -2, -2},
            {-2, -1, -6, -8, -2, -5},
            {-1, -1, -1, -2, -3, -4},
            {-1, -9, -2, -4, -4, -5},
            {-7, -3, -3, -2, -9, -9},
            {-1, -3, -1, -2, -4, -5}
    };


    /**
     * So basic its almost visual basic
     * <p>
     * // * @param  url  an absolute URL giving the base location of the image
     * // * @param  name the location of the image, relative to the url argument
     * // * @return      the image at the specified URL
     * // * @see         Image
     */
    public void simpleArray() {
        Scanner scanner = new Scanner(System.in);

        // get length
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        // reverse array
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        // dispose resource
        scanner.close();
    }

    /**
     * 2D array problem
     * Problem URL : https://www.hackerrank.com/challenges/2d-array/problemf
     * Problem Description : Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
     * // * @param  name the location of the image, relative to the url argument
     * // * @return      the image at the specified URL
     * // * @see         Image
     */
    public void twoDArray() {
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[6][6];
        int maxsum = Integer.MIN_VALUE;

        // Build the 2d array
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Retrieve sum values
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = array[i][j] +
                        array[i][j + 2] +
                        array[i][j + 1] +
                        array[i + 1][j + 1] +
                        array[i + 2][j] +
                        array[i + 2][j + 1] +
                        array[i + 2][j + 2];

                // Reassign if value is higher
                maxsum = sum > maxsum ? sum : maxsum;
            }
        }
        System.out.println(maxsum);
    }

    //TODO: Reprompt on incorrect input
    /**
     * validate console inputs
     * Valid values are between -9 and 9
     * // * @param  some user input
     * // * @return      The user input or 0
     * // * @see         Image
     */
    public int userInput(String input) {
        try {
            int inputFormatted = Integer.parseInt(input);
            return inputFormatted > -9 && inputFormatted < 9 ? Integer.parseInt(input) : 0;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}