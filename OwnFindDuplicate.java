import java.util.*;

public class OwnFindDuplicate {

    public void findDuplicate(int[] arr){

        ArrayList<Integer> duplicateValues = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++) {
            int temp = arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] == temp){
                    duplicateValues.add(temp);
                }
            }
        }

        for (int i = 0; i < duplicateValues.size(); i++) {
            System.out.println(duplicateValues.get(i));
        }

    }


//    int steps = 5000;
//
    public void arraySize() {
//        int arraysize = steps;
        int[] array = new int[]{2,3,4,3,5,6,1,1};
//        steps += 5000;
//        for(int i=0; i<10; i++){
//            array[i]=i;
//        }
//        long startTime = System.nanoTime();
        findDuplicate(array);
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime);
//        System.out.println(steps + "\t" + duration);
//        //System.out.println(duration);
    }

    public static void main(String args[]) {
        OwnFindDuplicate test_obj = new OwnFindDuplicate();
        test_obj.arraySize();

//        for (int i = 1; i <= 100; i++) {
//            test_obj.arraySize();
//        }




    }
}


