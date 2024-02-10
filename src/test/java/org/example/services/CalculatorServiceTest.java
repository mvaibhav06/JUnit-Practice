//package org.example.services;
//
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
//
//    int counter = 0;
//
//    @BeforeClass
//    public static void init(){
//        System.out.println("Before all test cases");
//        System.out.println("Started Test: " + new Date());
//    }
//
//    @Before
//    public void beforeEach(){
//        System.out.println("Before each test case");
//        counter = 0;
//    }
//
//    @Test
//    public void addTwoNumbersTest(){
//        for (int i=1; i<=20; i++){
//            counter += i;
//        }
//        System.out.println("In addTwoNumbersTest");
//        int result = CalculatorService.addTwoNumbers(12, 45);
//        int expected = 57;
//
//        System.out.println("Counter value: " + counter);
//        Assert.assertEquals(expected, result);
//    }
//
//    @Test(timeout = 2000)
//    public void sumAnyNumbersTest(){
//
//        for (int i=1; i<=100; i++){
//            counter += i;
//        }
//
//
//        System.out.println("In sumAnyNumbersTest");
//        int result = CalculatorService.sumAnyNumbers(2, 7, 8, 9);
//        int expected = 26;
//
//        System.out.println("Counter value in 2nd test case: " + counter);
//        Assert.assertEquals(expected, result);
//    }
//
//    @AfterClass
//    public static void cleanUp(){
//        System.out.println("After all test cases " + new Date());
//    }
//}
