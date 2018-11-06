import java.util.*;

public class OwnReverseMethod {

    public void reverseMethod(int[] arr){
        for(int i=0; i<arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

    }


    int steps = 5000;

    public void arraySize() {
        int arraysize = steps;
        int[] array = new int[arraysize];
        steps += 5000;
        for(int i=0; i<arraysize; i++){
            array[i]=i;
        }
        long startTime = System.nanoTime();
        reverseMethod(array);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(steps + "\t" + duration);
        //System.out.println(duration);
    }

    public static void main(String args[]) {
        OwnReverseMethod test_obj = new OwnReverseMethod();

        for (int i = 1; i <= 100; i++) {
            test_obj.arraySize();
        }




    }
}


