package org.example.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJUnit5 {

    @BeforeAll
    public static void init(){
        System.out.println("This is single time logic");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After all test case logic");
    }

    @BeforeEach
    public void beforeEachTestCase(){
        System.out.println("Before each test case");
    }

    @AfterEach
    public void afterEachTestCase(){
        System.out.println("After each test case");
    }

    @Test
    @DisplayName("Add Test case")
    public void addTwoNumbersTest(){
        System.out.println("In test case");
        int actualResult = CalculatorService.addTwoNumbers(12, 12);
        int expectedResult = 24;

        Assertions.assertEquals(expectedResult, actualResult, "Test failed");
    }

    @Test
    @Disabled
    public void addAnyNumbersTest(){
        System.out.println("In test case");
        int result = CalculatorService.sumAnyNumbers(12, 1, 2, 3);
        int expected = 18;

        Assertions.assertEquals(expected, result);
    }

    //Tag
}
