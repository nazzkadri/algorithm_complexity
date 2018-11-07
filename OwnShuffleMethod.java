import java.util.*;


public class OwnShuffleMethod {

    public void shuffle(ArrayList<Integer> array){
        Random rand = new Random();
        ArrayList<Integer> resultArray = new ArrayList<Integer>();

        while(array.size()>0 ){

                int index = rand.nextInt(array.size());

//                if(index == (array.size() - 1)){
//                    resultArray.add(array.get(index));
//                    array.remove(array.size() - 1);
//                }
//                else {
                    resultArray.add(array.get(index));
                    int last = array.get(array.size() - 1);

                    array.set(index, last);
                    array.remove(array.size() - 1);

                }
            //array.remove(index);
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

        //iterations(array);
        long startTime = System.nanoTime();
        shuffle(array);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(steps + "\t" + duration);

    }

    public void iterations(ArrayList<Integer> array){
        long[] durationarr = new long[100];
        for(int k=0; k<100; k++) {
            long startTime = System.nanoTime();
            shuffle(array);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
           // System.out.println(steps + "\t" + duration);
            durationarr[k] = duration;
        }
        average(steps, durationarr);
    }


    public void average(int steps, long[] durationarr){
        long average = 0;
        long sum = 0;
        for(int k=0; k<100; k++) {
            sum += durationarr[k];
        }
        average = (sum / 100);
        System.out.println(steps + "\t" + average);
    }

    public static void main(String args[]) {
        OwnShuffleMethod test_obj = new OwnShuffleMethod();
        for (int i = 1; i <= 100; i++) {
            test_obj.arraySize();
        }

    }
}


10000   3988169
        15000   1949204
        20000   2800228
        25000   4651524
        30000   6890258
        35000   2607421
        40000   7636772
        45000   7835633
        50000   5649153
        55000   3372332
        60000   7236174
        65000   2676054
        70000   9815189
        75000   8617463
        80000   3917749
        85000   20838864
        90000   4877502
        95000   9993388
        100000  6174254
        105000  11831465
        110000  12463224
        115000  11940699
        120000  12469055
        125000  29391370
        130000  5420982
        135000  5585873
        140000  14079971
        145000  6640920
        150000  9239317
        155000  11060754
        160000  15436302
        165000  8482751
        170000  9922829
        175000  122303875
        180000  25184031
        185000  16450811
        190000  8862743
        195000  8960834
        200000  46561655
        205000  9557895
        210000  14075301
        215000  10700517
        220000  11087885
        225000  15491708
        230000  85648142
        235000  20405323
        240000  18074116
        245000  24770751
        250000  28429455
        255000  17689122
        260000  20783541
        265000  23019822
        270000  24715221
        275000  22032538
        280000  34640473
        285000  25219000
        290000  18876915
        295000  21779498
        300000  18566247
        305000  26207951
        310000  26509152
        315000  35813984
        320000  44203881
        325000  29400113
        330000  32716386
        335000  31635413
        340000  31338004
        345000  38319350
        350000  34064729
        355000  26794645
        360000  38516375
        365000  25307299
        370000  40817731
        375000  42127385
        380000  35375432
        385000  205990154
        390000  39888508
        395000  37500720
        400000  34197357
        405000  184090949
        410000  40455123
        415000  52373112
        420000  52352742
        425000  49408485
        430000  305978596
        435000  49757763
        440000  34971102
        445000  32757305
        450000  32484590
        455000  173098074
        460000  39202578
        465000  35308173
        470000  39436994
        475000  42152425
        480000  49781965
        485000  51360518
        490000  53744639
        495000  59594021
        500000  240603776
        505000  41547223
