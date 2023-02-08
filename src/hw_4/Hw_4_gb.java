package hw_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Hw_4_gb {

    public static void main(String[] args) {
        /** Дан Deque состоящий из последовательности цифр.
         Необходимо проверить, что последовательность цифр является палиндромом */
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 5, 4, 4, 5, 1));
        System.out.println(checkOn(deque));
    }

    public static boolean checkOn(Deque<Integer> deque) {
        while (deque.size() > 1)
            if (deque.pollFirst() != deque.pollLast()) {
                break;
            }
        if (deque.size() > 1) {
            return false;
        } else {
            return true;
        }
    }
}

