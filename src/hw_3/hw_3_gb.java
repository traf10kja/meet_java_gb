package hw_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class hw_3_gb {
    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {

        ArrayList<Integer> new_list = new ArrayList<>();

        new_list.add(24);
        new_list.add(3);
        new_list.add(2);
        new_list.add(41);
        new_list.add(105);
        new_list.add(-20);
        new_list.add(11);
        new_list.add(1024);
        new_list.add(12);
        new_list.add(0);

        System.out.println(new_list);

        removeEvenValue(new_list);

        System.out.println(new_list);

        System.out.println(getMin(new_list));
        System.out.println(getMax(new_list));
        System.out.println(getAverage(new_list));
    }


    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(ArrayList<Integer> list) {

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {

            Integer integer = iterator.next();
            if (integer % 2 == 0) {
                iterator.remove();
            }
        }
        return new ArrayList<>();
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list) {
        return Collections.min(list);
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list){
        return Collections.max(list);
    }

    // Найти среднее значение
    public static Integer getAverage(List<Integer> list){
        double sum = 0.0;

        for (int i = 0; i < list.size(); i++) {
            sum+= list.get(i);
        }
        return (int) (sum / list.size());
    }
}

