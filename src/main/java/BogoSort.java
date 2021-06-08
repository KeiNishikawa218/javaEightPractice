import java.util.List;

public class BogoSort implements Sort{
    List<Integer> originalList;
    List<String> error;

    public BogoSort(List<Integer> originalList) {
        this.originalList = originalList;
    }

    @Override
    public List<Integer> sort(){
        System.out.println("計算時間がかかりすぎるため処理を中断します。\n");
        return originalList;
    }
}
