package HW2;

import HW2.AfterSuite;
import HW2.BeforeSuite;
import HW2.Test;

public class Tests {

    @BeforeSuite
    public static void testTwo(){
        System.out.println("Тест @BeforeSuite");
    }

    @Test
    public static void testSix(){
        System.out.println("Тест6");
    }

    @Test
    public static void testOne(){
        System.out.println("Тест1");
    }

    @Test
    public static void testSeven(){
        System.out.println("Тест7");
    }

    @Test(priority = 3)
    public static void testThree(){
        System.out.println("Тест3 приоритет 3");
    }

    @Test(priority = 8)
    public static void testFour(){
        System.out.println("Тест 4 приоритет 8");
    }

    @AfterSuite
    public static void testFive(){
        System.out.println("Тест5 @AfterSuite");
    }

}
