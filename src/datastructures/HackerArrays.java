package datastructures;

import datastructures.interfaces.HackerArrayStrategy;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Returns an Image object that can then be painted on the screen.
 * argument is a specifier that is relative to the url argument.
 * <p>
 * This method always returns immediately, whether or not the
 * image exists. When this applet attempts to draw the image on
 * the screen, the data will be loaded. The graphics primitives
 * that draw the image will incrementally paint on the screen.
 *
// * @param  url  an absolute URL giving the base location of the image
// * @param  name the location of the image, relative to the url argument
// * @return      the image at the specified URL
// * @see         Image
 */
public class HackerArrays implements HackerArrayStrategy {



    private static int[] inputArray;

    /**
     * Should take in

     *
     // * @param  url  an absolute URL giving the base location of the image
     // * @param  name the location of the image, relative to the url argument
     // * @return      the image at the specified URL
     // * @see         Image
     */
    public void SimpleArray()
    {
        System.out.println("Enter simple array data");
        Scanner scan = new Scanner(System.in);

//        String[] arr_temp = scan.toString().split("");
//        System.out.println("Int: " + i);
//        return;
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
