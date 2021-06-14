
/*
Stream API、lambda、関数型インタフェース、
宣言的、命令的

宣言的に処理を書くことが「できる」
どうやってではなく何がやりたいかを表現「できる」
 */

/*
宣言的　→　結果重視（やりたいことを端的に書く）
命令的　→　過程重視(過程も書かないといけない)
 */

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    static List randomIntList(){
        Random random = new Random();
        List<Integer> randomIntList = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            randomIntList.add(random.nextInt(1000));
        }
        return randomIntList;
    }

    public static void main(String[] args) {
        Sort[] array = new Sort[3];
        List<Integer> unsortedNumbersList = randomIntList();

        System.out.println("ソート前の配列です\n" + unsortedNumbersList + "\n");

        //防御的コピー
        //副作用を考える
        //クイックソート
        System.out.println("クイックソートを実行します");
        array[0] = new QuickSort<Integer>();
        System.out.println(array[0].sort(unsortedNumbersList) + "\n");

        //バブルソート
        System.out.println("バブルソートを実行します");
        array[1] = new BubbleSort<Integer>();
        System.out.println(array[1].sort(unsortedNumbersList) + "\n");

        //ボゴソート
        System.out.println("ボゴソートを実行します");
        array[2] = new BogoSort<Integer>();
        array[2].sort(new ArrayList<>(unsortedNumbersList));


        //ラムダ
        Sort bogo = new Sort() {
            @Override
            public List sort(Collection unsortedNumbersCollection) {
                System.out.println("bogo\n");
                return null;
            }
        };

        bogo.sort(new ArrayList<>(unsortedNumbersList));

        //Stream API
        System.out.println("Stream APIのソートを実行します");
        List<Integer> sorted = unsortedNumbersList.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer number) {
                        return Math.abs(number) >= 100;
                    }
                })
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sorted);
    }
}


