package HW2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStart {

    public static void start(Class a) {
        List<Method> methodsList = new ArrayList<Method>();
        Method[] methodsClass = a.getDeclaredMethods();
        for (Method m: methodsClass) {
            if(m.isAnnotationPresent(Test.class)){
                methodsList.add(m);
            }
        }

        methodsList.sort(Comparator
                .comparingInt((Method i) -> i.getAnnotation(Test.class).priority())
                .reversed());

        for (Method i : methodsClass) {
            if(i.isAnnotationPresent(BeforeSuite.class)) {
                if(methodsList.size() > 0 && methodsList.get(0).isAnnotationPresent(BeforeSuite.class)) {
                    throw new RuntimeException("@BeforSuite annotation method > 0");
                }
                methodsList.add(0,i);
            }
        }

        for (Method g : methodsClass){
            if(g.isAnnotationPresent(AfterSuite.class)) {
                if(methodsList.size() > 0 && methodsList.get(methodsList.size()-1).isAnnotationPresent(AfterSuite.class)) {
                    throw new RuntimeException("@AfterSuite annotation method > 1");
                }
                methodsList.add(g);
            }
        }

        for (Method k : methodsList){
            try {
                k.invoke(null);
            } catch (IllegalAccessException e ) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }



    }
    }

