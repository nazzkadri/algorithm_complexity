import java.util.*;


public class OwnShuffleMethod {

    public void shuffle(ArrayList<Integer> array){
        Random rand = new Random();
        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        while(array.isEmpty()!= true){
            int  index = rand.nextInt(array.size());
           // int element = array.get(index);
            resultArray.add(array.get(index));
            array.remove(index);
        }
        // let us print all the elements available in resultarray
//        for (Integer number : resultArray) {
//            System.out.println("Number = " + number);
//        }

    }


    int steps = 5000;

    public void arraySize() {
        int arraysize = steps;
        ArrayList<Integer> array = new ArrayList<Integer>();
        steps += 5000;
        for(int i=0; i<arraysize; i++){
            array.add(i);
        }
        long startTime = System.nanoTime();
        shuffle(array);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(steps + "\t" + duration);
        //System.out.println(duration);
    }

    public static void main(String args[]) {
        OwnShuffleMethod test_obj = new OwnShuffleMethod();
        //ArrayList<Integer> array = new ArrayList<Integer>();

//        int arr[] = new int[150000];
//        for(int i=0; i<10; i++){
//            array.add(i);
//        }

        for (int i = 1; i <= 100; i++) {
            test_obj.arraySize();
        }




    }
}
