package datastructures;

import java.util.Scanner;


public class HackerArrays {

    //TODO : Make this look pretty

    /**
     * So basic its almost visual basic
     *
     // * @param  url  an absolute URL giving the base location of the image
     // * @param  name the location of the image, relative to the url argument
     // * @return      the image at the specified URL
     // * @see         Image
     */
    public void SimpleArray()
    {
        Scanner scanner = new Scanner(System.in);

        // get length
        int length = scanner.nextInt();
        int[] array = new int[length];
        for(int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
       // reverse array
        for(int i = length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        // dispose resource
        scanner.close();
    }

    /**
     * 2D array problem
     * Problem URL : https://www.hackerrank.com/challenges/2d-array/problemf
     * Problem Description : Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
     // * @param  name the location of the image, relative to the url argument
     // * @return      the image at the specified URL
     // * @see         Image
     */
    public void TwoDArray()
    {
        System.out.println("Enter TwoDArray data");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.
        System.out.println("Int: " + i);
        return;
    }


}
