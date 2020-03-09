package org.example;

public class BinarySearchAlg {
    // recursive
    public static boolean binarySearchRecursive(int array[], int x, int left, int right){
        if (left > right)
            return false;

        int mid = left + ((right - left) / 2);
        if (array[mid] == x){
            return true;
        }else if (x < array[mid]){
            return binarySearchRecursive(array, x, left, mid - 1);
        }else {
            return binarySearchRecursive(array, x, mid + 1, right);
        }
    }

    public static boolean binarySearchRecursive(int[] array, int x){
        return binarySearchRecursive(array, x, 0, array.length -1);
    }

    public static boolean binarySearchIterative(int[] array, int x){
        int left = 0, right = array.length - 1;
        int count = 1;
        while (left <= right){
            System.out.println("num of iteration " + count);
            int mid = left + ((right - left) / 2);
            if (array[mid] == x){
                return true;
            }else if (x < array[mid]){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
            count++;
        }
        return false;
    }
}
