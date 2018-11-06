import java.util.*;

public class TestingReverseMethod {


    public void TestingReverseExecutionTime(Integer arr[]){

        List list = Arrays.asList(arr);
        // reverse the list
        Collections.reverse(list);
        // convert to array again
        Object[] objectArray = list.toArray();
         //System.out.println(Arrays.toString(arr));


//        for(int i=0; i<arr.length/2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - i - 1];
//            arr[arr.length - i - 1] = temp;
//        }
//        return arr;

    }

    public static void main(String args[]) {
        TestingReverseMethod test_obj = new TestingReverseMethod();
        Integer[] arr = new Integer[10];

//        int arr[] = new int[150000];
        for(int i=0; i<10; i++){
            arr[i] = i;
        }

        long startTime = System.nanoTime();
        test_obj.TestingReverseExecutionTime(arr);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        double milliSeconds = duration / 1e6;
        System.out.println(duration);
        System.out.println(milliSeconds);

    }


}