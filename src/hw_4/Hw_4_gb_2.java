package hw_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Hw_4_gb_2 {
    //Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(5,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        // result [6,6,0,1]
        Deque<Integer> d3 = sum(d1,d2);
        System.out.println(d3);

    }


    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        int len = d1.size() < d2.size() ? d1.size() : d2.size();
        Deque<Integer> d3 = new ArrayDeque<>();

        while (len > 0){
            int tmp = d1.pollFirst() + d2.pollFirst();
            if (tmp > 9) {
                d3.addLast(tmp % 10);
                d3.addLast(1);
            } else {
                d3.addLast(tmp);
            }
            len--;
        }
        return d3;
    }
}

