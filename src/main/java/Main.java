import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[] = {1, 5, 3, 2, 3, 3, 5, 3, 7};
        ArraysMethods method = new ArraysMethods();
        System.out.println(Arrays.toString(method.myMethodOne(array)));
        System.out.println(method.myMethodTwo(array));
    }
}