public class divideandconquer {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        // last element
        int pidx = partition(arr, si, ei);

        quicksort(arr, si, pidx - 1);// left
        quicksort(arr, pidx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for element smaller thenm pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static int rotatedtareget(int arr[], int target, int si, int ei) {
        // kaam
        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // mid at l1
        if (arr[si] <= arr[mid]) {
            // case a :left
            if (arr[si] <= target && target <= arr[mid]) {
                return rotatedtareget(arr, target, si, mid);
            } else {
                // case b : right
                return rotatedtareget(arr, target, mid + 1, ei);
            }
        } // mid on l2
        else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return rotatedtareget(arr, target, mid + 1, ei);
            } else {
                // case d : left
                return rotatedtareget(arr, target, si, mid - 1);
            }

        }

    }

    public static int[] merge2sortarray(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int result[] = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;

            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }

    static int count = 0;

    public static int[] mergeTwoSortedArrays2(int[] left, int[] right) {
        int n = left.length;
        int m = right.length;

        int[] res = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (left[i] < right[j]) {
                res[k] = left[i];
                i++;
            } else {
                res[k] = right[j];
                count += (n - i);
                j++;
            }
            k++;
        }

        while (i < n) {
            res[k] = left[i];
            i++;
            k++;
        }

        while (j < m) {
            res[k] = right[j];
            j++;
            k++;
        }

        return res;
    }

    public static int[] countInversions(int[] arr, int si, int ei) {
        if (si == ei) {
            int[] ba = new int[1];
            ba[0] = arr[si];

            return ba;
        }
        int mid = (si + ei) / 2;

        int[] left = countInversions(arr, si, mid);
        int[] right = countInversions(arr, mid + 1, ei);

        int[] res = mergeTwoSortedArrays2(left, right);
        return res;
    }

    public static void main(String args[]) {
        // int arr[] = { 6, 3, 9, 5, 2, 8 };
        // mergesort(arr, 0, arr.length-1);
        // printarr(arr);

        // quicksort(arr, 0,arr.length-1);
        // printarr(arr);

        // int arr1[] = { 4,5,6,7,0,1,2};
        // int target = 0;
        // int ans = rotatedtareget(arr1, target, 0, arr1.length-1);
        // System.out.println(ans);
        // System.out.println();
        int arr12[] = {4,2,3,55,6654,567,57,6,43,5,4,666,7,885,434345355};
        // mergesort(arr12, 0, arr12.length-1);
        // printarr(arr12);

        quicksort(arr12, 0, arr12.length-1);
        printarr(arr12);

         // int arrm[] = { 1, 5, 9, 13, 17 };
        // int arrn[] = { 2, 4, 7, 10, 18, 20 };

        // int resultm[] = merge2sortarray(arrm, arrn);
        // printarr(resultm);

        // int[] arri = { 2, 4, 1, 3, 5 };
        // int[] res = countInversions(arri, 0, 4);
        // System.out.println(count);

    }

}
