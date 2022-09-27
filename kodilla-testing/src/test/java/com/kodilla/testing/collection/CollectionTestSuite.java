package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    int n = 1;

    @BeforeEach
    public void before(){
        System.out.println("Test starting");
    }

    @AfterEach
    public void after(){
        System.out.println("Test ends");
    }


    @DisplayName("Checking if class behave correctly if list is empty")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        List<Integer> numbers1 = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        for (Integer oddNubmers : exterminator.exterminate(numbers1)){
            Assertions.assertFalse(oddNubmers % 2 != 0);
        }
    }

    @DisplayName("Checking if all numbers are even")
    @Test
    void testOddNumbersExterminatorNormalList(){
        List<Integer> numbers1 = new ArrayList<>();
        for(int i = 0; i<100; i++){
            Integer temporaryNumber = i;
            numbers1.add(temporaryNumber);
        }

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        for (Integer oddNumbers : exterminator.exterminate(numbers1)){
            Assertions.assertFalse(oddNumbers % 2 != 0);
        }
    }

}
