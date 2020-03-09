package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] integers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        //System.out.println(BinarySearchAlg.binarySearchRecursive(integers, 50));
        System.out.println(BinarySearchAlg.binarySearchIterative(integers, 2));
    }
}
