import java.util.*;

public class OwnSortAlgorithm {

    public void sortAscOrder(int[] arr){
        ArrayList<Integer> duplicateValues = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++) {
            int j = i;
            for(j=j+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] =arr[i];
                    arr[i] = temp;
                }
            }
        }

//            System.out.println(Arrays.toString(arr));
//

    }


    //    int steps = 5000;
//
    public void arraySize() {
//        int arraysize = steps;
        int[] array = new int[]{4,8,6,7,3,9};
//        steps += 5000;
//        for(int i=0; i<10; i++){
//            array[i]=i;
//        }
//        long startTime = System.nanoTime();
        sortAscOrder(array);
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime);
//        System.out.println(steps + "\t" + duration);
//        //System.out.println(duration);
    }

    public static void main(String args[]) {
        OwnSortAlgorithm test_obj = new OwnSortAlgorithm();
        test_obj.arraySize();

//        for (int i = 1; i <= 100; i++) {
//            test_obj.arraySize();
//        }




    }
}


