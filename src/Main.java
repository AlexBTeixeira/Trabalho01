import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        //Creating and populating the required lists

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();

        for(int i = 0; i <= 32; i++){ list1.add(new Random().nextInt());}
        for(int i = 0; i <= 2048; i++){ list2.add(new Random().nextInt());}
        for(int i = 0; i <= 1048576; i++){ list3.add(new Random().nextInt());}


        //Testing
        // Works!!!
        List<Integer> listTest = new ArrayList<Integer>();

        listTest.add(1);
        listTest.add(23);
        listTest.add(4);
        listTest.add(-9);
        listTest.add(10);
        listTest.add(-4);

        List<Integer> sorted = MergeSort.Sort(listTest);

        System.out.println(sorted.toString());
        System.out.println(MethodBank.maxVal1(listTest));
        System.out.println(MergeSort.getSteps());
    //    MergeSort.setSteps(0);
        System.out.println(MethodBank.maxVal2(listTest,0, listTest.size()-1));
        System.out.println(MergeSort.getSteps());

    }


}