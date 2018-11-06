import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestingSortMethod  {

    public void TestingExecutionTime(List<Integer> newArr) {
        Collections.sort(newArr);
    }

    public List<Integer> shuffle(List<Integer> list){
        Collections.shuffle(list);
        return list;
    }

    int steps = 5000;

    public void arraySize() {
        int arraysize = steps;
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < arraysize; i++) {
            arr.add(i);
        }

        List<Integer> list = shuffle(arr);
       // System.out.println(list.getClass());
        steps += 5000;

        long startTime = System.nanoTime();


       TestingExecutionTime(list);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(steps + "\t" + duration);
        //System.out.println(duration);
    }

    public static void main(String args[]) {

        TestingSortMethod test_obj = new TestingSortMethod();
        for (int i = 1; i <= 100; i++) {
            test_obj.arraySize();
        }
//        public WordStore(int n){
//            arr =new Integer[n];
//        }
//
//        long startTime = System.nanoTime();
//        test_obj.TestingExecutionTime(arr);
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime);
//        double milliSeconds = duration / 1e6;
//        System.out.println(duration);
//        System.out.println(milliSeconds);


    }


}



