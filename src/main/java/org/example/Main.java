package org.example;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(BinarySearch.binarySearchImperative(intArray, 5));
        System.out.println(BinarySearch.binarySearchRecursive(5, intArray, 0, intArray.length - 1));
    }
}