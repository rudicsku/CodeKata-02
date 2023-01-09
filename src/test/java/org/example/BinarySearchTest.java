package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void binarySearchImperative() {
        //Arrange
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Act
        int result = BinarySearch.binarySearchImperative(intArray, 5);

        //Assert
        assertEquals(4, result);
    }

    @Test
    void binarySearchRecursive() {
        //Arrange
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Act
        int result = BinarySearch.binarySearchRecursive(5, intArray, 0, intArray.length - 1);

        //Assert
        assertEquals(4, result);
    }
}