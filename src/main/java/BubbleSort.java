import java.util.Collections;
import java.util.List;

public class BubbleSort implements Sort{
    List<Integer> originalList;

    public BubbleSort(List<Integer> originalList) {
        this.originalList = originalList;
    }

    @Override
    public List<Integer> sort(){
        for(int i = 0; i < originalList.size() - 1; i++){
            for(int j = originalList.size() - 1; j > i; j--){
                if(originalList.get(j-1) > originalList.get(j)){
                    Collections.swap(originalList, j-1, j);
                }
            }
        }

        return originalList;
    }
}
