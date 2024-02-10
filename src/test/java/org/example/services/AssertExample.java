package org.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertExample {

    @Test
    public void test1(){
        System.out.println("Testing some assertion methods");

        double actual = 12;
        double expected = 12;

//        Assertions.assertEquals(expected, actual);
        int[] actualArr = {1,2,3,4,5};
        int[] expectedArr = {1,2,3,4,5};

//        Assertions.assertArrayEquals(expectedArr, actualArr);

        String name = new String("Rahul");
        String expectedName = new String("Rahul");

//        Assertions.assertSame(name, expectedName);
        Assertions.assertEquals(name, expectedName);
    }

}
