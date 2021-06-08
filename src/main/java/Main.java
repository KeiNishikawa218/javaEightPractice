
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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static List randomIntList(){
        Random random = new Random();
        List<Integer> randomIntList = new ArrayList<>();

        for(int i = 0; i < 100; i++) {
            randomIntList.add(random.nextInt(1000));
        }
        return randomIntList;
    }

    public static void main(String[] args) {
        Sort[] array = new Sort[3];
        List<Integer> originalList = randomIntList();

        System.out.println("ソート前の配列です\n" + originalList + "\n");

        //クイックソート
        {
            System.out.println("クイックソートを実行します");
            array[0] = new QuickSort(new ArrayList<Integer>(originalList));
            System.out.println(array[0].sort() + "\n");
        }

        //バブルソート
        {
            System.out.println("バブルソートを実行します");
            array[1] = new BubbleSort(new ArrayList<Integer>(originalList));
            System.out.println(array[1].sort() + "\n");
        }

        //ボゴソート
        {
            System.out.println("ボゴソートを実行します");
            array[2] = new BogoSort(new ArrayList<Integer>(originalList));
            array[2].sort();
        }

        //Stream API
        {
            System.out.println("Stream APIのソートを実行します");
            List<Integer> sorted = originalList.stream()
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println(sorted);
        }

    }
}


