import java.util.*;

public class TestingLastMethod {
    public int TestingExecutionTime(int arr[]) {
        int last = arr[arr.length - 1];
        return last;
    }
    int steps=5000;
    public void arraySize() {
        int arraysize = steps;
        int[] array = new int[arraysize];
        steps += 5000;
        for(int i=0; i<arraysize; i++){
            array[i] = i;
        }

        //iterations(array);
        long startTime = System.nanoTime();
        TestingExecutionTime(array);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(steps + "\t" + duration);

    }


    public static void main(String args[]) {
        TestingLastMethod test_obj = new TestingLastMethod();
        for (int i = 1; i <= 100; i++) {
            test_obj.arraySize();
        }
//        int arr[] = new int[100000];
//        for(int i=0; i<100000; i++){
//            arr[i] = i;
//        }
//        long beginTime = System.currentTimeMillis();
//        int lastEle = test_obj.TestingExecutionTime(arr);
//        long finishTime = System.currentTimeMillis();
//        System.out.println("That took " + (finishTime - beginTime) + " milliseconds");

//        long startTime = System.nanoTime();
//        int lastElement = test_obj.TestingExecutionTime(arr);
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime);
//        double milliSeconds = duration / 1e6;
//        System.out.println(duration);
//        System.out.println(milliSeconds);


    }


}


