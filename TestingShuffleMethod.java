import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestingShuffleMethod  {

    public void TestingExecutionTime(ArrayList arr) {

        Collections.shuffle(arr);

//        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        list.forEach(System.out::println);

//        valuesList.toArray(arr);
//        System.out.println(Arrays.toString(arr));
    }

    int steps = 5000;

    public void arraySize() {
        int arraysize = steps;
       ArrayList<Integer> arr = new ArrayList<Integer>();
        steps += 5000;
        for (int i = 0; i < arraysize; i++) {
            arr.add(i);
        }
        long startTime = System.nanoTime();
        TestingExecutionTime(arr);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(steps + "\t" + duration);
        //System.out.println(duration);
    }

    public static void main(String args[]) {
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        for(int i=0; i<500000; i++){
//            arr.add(i);
//        }

        TestingShuffleMethod test_obj = new TestingShuffleMethod();
        for (int i = 1; i <= 100; i++) {
            test_obj.arraySize();
        }




//        public WordStore(int n){
//            arr =new Integer[n];
//        }
//        long beginTime = System.currentTimeMillis();
//        int lastEle = test_obj.TestingExecutionTime(arr);
//        long finishTime = System.currentTimeMillis();
//        System.out.println("That took " + (finishTime - beginTime) + " milliseconds");

//        long startTime = System.nanoTime();
//        test_obj.TestingExecutionTime(arr);
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime);
//        double milliSeconds = duration / 1e6;
//        System.out.println(duration);
//        System.out.println(milliSeconds);


    }


}