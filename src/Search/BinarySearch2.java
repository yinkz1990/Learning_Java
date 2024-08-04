package Search;

public class BinarySearch2 {
   public int binarySearch(int arr[], int l, int r, int x)
    {
        var step = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            step++;
            // If the element is present at the
            // middle itself
            if (arr[mid] == x) {
                System.out.println(step);
                return mid;

                // If element is smaller than mid, then
                // it can only be present in left subarray
                // so we decrease our r pointer to mid - 1
            } else if (arr[mid] > x) {
                r = mid - 1;

                // Else the element can only be present
                // in right subarray
                // so we increase our l pointer to mid + 1
            } else {
                l = mid + 1;
            }
        }

        // We reach here when element is not present
        System.out.println(step);
        return -1;
    }


}
