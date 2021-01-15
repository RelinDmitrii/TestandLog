import org.junit.*;

public class TestArrays {
    ArraysMethods ArraysMethods;

    

    @Before
    public void init(){
        ArraysMethods = new ArraysMethods();
    }


    @Test
    public void testAdd2(){
        int[] array = {1, 5, 3, 2, 4, 6, 7};
        int[] array2 = {6,7};
        Assert.assertArrayEquals(array2, ArraysMethods.myMethodOne(array));
    }

   @Test
   public void testAdd3(){
       int[] array = {1, 5, 3, 2, 4, 6, 4};
       int[] array2 = {};
       Assert.assertArrayEquals(array2, ArraysMethods.myMethodOne(array));
  }


    @Test(expected = RuntimeException.class)
    public void testRuntimeException() {
        int[] array = {};
        ArraysMethods.myMethodOne(array);
    }

    @Test
    public void testAdd4(){
        int[] array = {5, 3, 2, 4, 6, 4};
        Assert.assertEquals(false ,ArraysMethods.myMethodTwo(array));
    }

    @Test
    public void testAdd5(){
        int[] array = {1, 5, 3, 2, 6};
        Assert.assertEquals(false ,ArraysMethods.myMethodTwo(array));
    }

    @Test
    public void testAdd6(){
        int[] array = {1, 5, 3, 2, 4, 6};
        Assert.assertEquals(true ,ArraysMethods.myMethodTwo(array));
    }


    }

