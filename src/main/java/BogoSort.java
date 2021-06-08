import java.util.Collection;
import java.util.List;

public class BogoSort<T extends Comparable<T>> implements Sort<T>{
    List<Integer> originalList;
    List<String> error;


    @Override
    public List<T> sort(Collection<T> unsortedNumbersCollection){
        //TODO: 例外を設定する。タイムアウト
        System.out.println("実行に時間がかかりすぎるため処理を中断します\n");
        return null;
    }
}
