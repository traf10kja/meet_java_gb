import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = arrayFilling(20,300);
        System.out.println(Arrays.toString(arr));


        sort(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println("Minimum number in array: " + min(arr));
        System.out.println("Maximum number in array: " + max(arr));

        intervalPrime(0,100);

    }
    /**
     * Метод создающий массив нужного размера и заполняющий массив значениями от 0 до необходимого числа.
     * */
    public static int[] arrayFilling(int size,int max_val){
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max_val +1));
        }
        return arr;
    }

    /**
     * Метод определяющий минимальный элемент массива
     */
    public static int min(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

    /**
     * Метод определяющий максимальное значение в массиве
     */
    public static int max (int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }
    /**
     * Метод Пузырьковой сортировки.
     * */
    public static int[] sort(int[] array){
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i -1]) {
                    int a = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = a;
                    isSorted = false;
                }
            }
        }
        return array;
    }

    /**
     * Метод проверяющий простое это число или нет.
     * */
    public static boolean isPrime(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Метод проверяющий простые числа в заданном интервале.
     * */
    public static void intervalPrime(int min, int max){
        for(int i = min; i <= max; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }


}