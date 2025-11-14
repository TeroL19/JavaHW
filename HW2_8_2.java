import java.util.Arrays;

public class HW2_8_2 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 4};

        System.out.println(Arrays.toString(arr));
        // вывод: [5, 3, 9, 1, 4]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // вывод: [1, 3, 4, 5, 9]

        int idx = Arrays.binarySearch(arr, 4);
        System.out.println(idx);
        // вывод: 2 (индекс элемента 4 в отсортированном массиве)

        int[] arr2 = {1, 3, 4, 5, 9};
        System.out.println(Arrays.equals(arr, arr2));
        // вывод: true

        int cmp = Arrays.compare(arr, new int[]{1,3,4,5,8});
        System.out.println(cmp);
        // вывод положительный (т.к. 9 > 8)
    }
}
