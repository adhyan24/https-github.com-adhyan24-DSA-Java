class SearchInRotatedArray {
    public int search(int[] arr, int key) {
      // time complexity is O(log n)
       
        int lo = 0, hi = arr.length - 1;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(key == arr[mid]){
                return mid;
            }

            if(arr[mid] >= arr[lo]){
                  // when key is greater then low and mid is greter then key
                if (key >= arr[lo] && key < arr[mid]){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
            }else{
                if(arr[mid] < key && key <= arr[hi]){
                    lo = mid + 1;
                }else{
                    hi = mid-1;
                }

            }
        }
        return -1;
    }
}
