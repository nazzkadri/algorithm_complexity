import java.util.*;

public class TestExecutionTimeOfMethods {

    public int TestingExecutionTime(int arr[]) {
        int last = arr[arr.length - 1];
        return last;
    }

    int steps = 5000;

    public void arraySize() {
        int arraysize = steps;
        int arr[] = new int[arraysize];
        steps += 5000;
        for (int i = 0; i < arraysize; i++) {
            arr[i] = i;
        }


        long startTime = System.nanoTime();
        TestingExecutionTime(arr);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(steps + "\t" + duration);
        //System.out.println(duration);
    }



    public static void main(String args[]) {

        TestExecutionTimeOfMethods test_obj = new TestExecutionTimeOfMethods();
        for (int i = 1; i <= 100; i++) {
            test_obj.arraySize();
        }
//        long beginTime = System.currentTimeMillis();
//        int lastEle = test_obj.TestingExecutionTime(arr);
//        long finishTime = System.currentTimeMillis();
//        System.out.println("That took " + (finishTime - beginTime) + " milliseconds");
    }

}