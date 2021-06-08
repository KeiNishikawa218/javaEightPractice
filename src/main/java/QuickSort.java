import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class QuickSort<T extends Comparable<T>> implements Sort<T> {
    //副作用がある
    private void partition(List<T> unsortedNumbersList, int start, int end){
        if(start < end) {
            int i = start; int j = end;
            T pivot = unsortedNumbersList.get(end);
            while(true) {
                while(unsortedNumbersList.get(i).compareTo(pivot) < 0 && i < unsortedNumbersList.size()-1) i++;
                while(pivot.compareTo(unsortedNumbersList.get(j)) < 0 && j > 0) j--;
                if(i >= j) break;
                Collections.swap(unsortedNumbersList, i, j);
                i++; j--;
            }
            partition(unsortedNumbersList, start, i - 1);
            partition(unsortedNumbersList, j + 1, end);
        }
    }

    @Override
    public List<T> sort(Collection<T> unsortedNumbersCollection){
        List<T> list = new ArrayList<>(unsortedNumbersCollection);
        partition(list, 0, list.size()-1);
        return list;
    }
}
