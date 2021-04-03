import java.util.ArrayList;
import java.util.List;

public class MergeSort{

    public static int steps = 0;

    public static List<Integer> Sort(List<Integer> list){

        if(list.size() == 1) return list;

        List<Integer> listA = Sort(list.subList(0, list.size()/2));
        List<Integer> listB = Sort(list.subList(list.size()/2, list.size()));
        list = merge(listA,listB);

        steps++;

        return list;
    }

    public static List<Integer> merge(List<Integer> ListA, List<Integer> ListB){

        List<Integer> returnList = new ArrayList<Integer>();
        int indexA =0;
        int indexB = 0;

        for (int i = 0; i < ListA.size() + ListB.size(); i++) {
            if(indexA == ListA.size()){
                returnList.addAll(ListB.subList(indexB, ListB.size()));
                break;
            }
            if(indexB == ListB.size()){
                returnList.addAll(ListA.subList(indexA, ListA.size()));
                break;
            }
            int valueA = ListA.get(indexA);
            int ValueB = ListB.get(indexB);
            if(valueA < ValueB){
                returnList.add(valueA);
                indexA++;
            }else{
                returnList.add(ValueB);
                indexB++;
            }
            steps++;
        }
        steps++;
        return returnList;
    }

    public static int getSteps() {
        return steps;
    }

    public static void setSteps(int steps) {
        MergeSort.steps = steps;
    }
}
