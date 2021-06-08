import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BubbleSort<T extends Comparable<T>> implements Sort<T>{
    @Override
    public List<T> sort(Collection<T> unsortedNumbersCollection){
        List<T> list = new ArrayList<>(unsortedNumbersCollection);
        for(int i = 0; i < list.size() - 1; i++){
            for(int j = list.size() - 1; j > i; j--){
                if(list.get(j-1).compareTo(list.get(j)) > 0){
                    Collections.swap(list, j-1, j);
                }
            }
        }

        return list;
    }
}
