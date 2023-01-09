package org.example;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearchImperative(int[] array, int element) {
        int low = 0;
        int high = array.length - 1;
        //If the array is not sorted
        Arrays.sort(array);

        // Repeat until the pointers low and high meet each other
        while (low <= high) {

            // get index of mid element
            int mid = low + (high - low) / 2;

            // if element to be searched is the mid element
            if (array[mid] == element)
                return mid;

            // if element is less than mid element
            // search only the left side of mid
            if (array[mid] < element)
                low = mid + 1;

                // if element is greater than mid element
                // search only the right side of mid
            else
                high = mid - 1;
        }
        return -1;
    }


    public static int binarySearchRecursive(int search, int[] array, int start, int end){

        int middle = (start + end)/2;

        if(end < start){
            return -1;
        }

        if (search < array[middle]){
            return binarySearchRecursive(search, array, start, middle - 1);
        }

        if (search > array[middle]){
            return binarySearchRecursive(search, array, middle + 1, end);
        }

        if (search == array[middle]){
            return middle;
        }

        return -1;
    }



}
