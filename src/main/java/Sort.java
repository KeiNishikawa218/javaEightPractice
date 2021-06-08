import java.util.Collection;
import java.util.List;

/**
 * 受け取ったリストの中身を昇順に並べ替えます。
 */

//単一責務の原則
//TODO:設計原則について学ぶ
//TはIntegerやFloatが入る
public interface Sort<T extends Comparable<T>>{
    //implementsしたクラスにはsortが実装されている
    //仕様
    //実装は書かない
    List<T> sort(Collection<T> unsortedNumbersCollection);
}