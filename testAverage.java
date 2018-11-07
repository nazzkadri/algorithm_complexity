import java.util.*;


public class testAverage {

    public void shuffle(ArrayList<Integer> array){
        Random rand = new Random();
        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        while(array.isEmpty()!= true){
            int  index = rand.nextInt(array.size());
            resultArray.add(array.get(index));
            array.remove(index);
        }
    }


    int steps = 10;

    public void arraySize() {
        int arraysize = steps;
        ArrayList<Integer> array = new ArrayList<Integer>();
        steps += 10;
        for(int i=0; i<arraysize; i++){
            array.add(i);
        }

        iterations(array);
//        long startTime = System.nanoTime();
//        shuffle(array);
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime);
//        System.out.println(steps + "\t" + duration);

    }

    public void iterations(ArrayList<Integer> array){
        long[] durationarr = new long[5];
        for(int k=0; k<5; k++) {
            long startTime = System.nanoTime();
            shuffle(array);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
             System.out.println(duration);
            durationarr[k] = duration;
        }
        average(steps, durationarr);
    }


    public void average(int steps, long[] durationarr){
        long average = 0;
        long sum = 0;
        for(int k=0; k<5; k++) {
            sum += durationarr[k];
        }
        average = (sum / 5);
        System.out.println(steps + "\t" + average);
    }

    public static void main(String args[]) {
        testAverage test_obj = new testAverage();
        for (int i = 0; i <= 5; i++) {
            test_obj.arraySize();
        }

    }
}
