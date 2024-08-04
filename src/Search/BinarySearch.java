package Search;

public class BinarySearch {
    private static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static int target = 77;

    public static int show() {
        int rt;
        rt = binarySearch(array, target);
        return rt;
    }

    public static int binarySearch(int[] array, int target) {
        int step = 0;
        int start = 0;
        int end = array.length - 1;


        while (start <= end) {
            int mid = (start + end) / 2;
            step++;
            if (array[mid] == target) {
                System.out.println(step);
                return mid;
            } else if (array[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
                
            }
        }
        System.out.println(step);
        return -1;
    }
}
