import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;

public class ArraysMethods  {
    public int[] myMethodOne(int[] array) {
        if(!ArrayUtils.contains(array,4)){
            throw new RuntimeException();
        }
        int[] newArray = ArrayUtils.subarray(array, ArrayUtils.lastIndexOf(array, 4) + 1, ArrayUtils.getLength(array)+1);
        return newArray;
    }
    public boolean myMethodTwo(int[] array) {
        return  (ArrayUtils.contains(array, 1) && ArrayUtils.contains(array, 4));
    }
}

