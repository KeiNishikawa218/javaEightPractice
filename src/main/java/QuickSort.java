import java.util.Collections;
import java.util.List;

public class QuickSort implements Sort {
    List<Integer> originalList;

    public QuickSort(List<Integer> originalList) {
        this.originalList = originalList;
    }

    public void partition(List<Integer> originalList, int start, int end){
        if(start < end) {
            int i = start; int j = end;
            float pivot = originalList.get(end);
            while(true) {
                while(originalList.get(i) < pivot && i < originalList.size()-1) i++;
                while(pivot < originalList.get(j) && j > 1) j--;
                if(i >= j) break;
                Collections.swap(originalList, i, j);
                i++; j--;
            }
            partition(originalList, start, i - 1);
            partition(originalList, j + 1, end);
        }
    }

    @Override
    public List<Integer> sort(){
        partition(originalList, 0, originalList.size()-1);
        return originalList;
    }
}
