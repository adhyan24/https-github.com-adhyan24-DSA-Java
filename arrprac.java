public class arrprac {
    public static int[] searchRange(int[] nums, int target) {
        int arr[] = { -1, -1 };
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[0] = i;
                break;
            }
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                arr[1] = j;
                break;
            }
        }

        return arr;

    }

    public static int reverse(int x) {
        int count = 0;
        while (x > 0) {
            int y = x % 10;
            count = count * 10 + y;

            if (x > Integer.MAX_VALUE / 10 || y > 7) {
                return 0;
            }
            if (x < Integer.MIN_VALUE || y < -8) {
                return 0;
            }

            count /= 10;

        }
        return count;

    }
    
    public static void main(String[] args) {
        // int nums[] = {5,7,7,8,8,10};
        // int target = 8 ;
        // int[] result = searchRange(nums, target);
        // System.out.println("[" + result[0] + ", " + result[1] + "]");

        int x = 1;
        int ans = reverse(x);
        System.out.println(ans);

    }
}
