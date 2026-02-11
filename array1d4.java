import java.util.*;

public class array1d4 {

    public static int maxarea(int height[]) {
        // int max = 0;
        // for(int i = 0 ; i<height.length;i++){
        // for(int j = i+1 ; j<height.length;j++){
        // int breadth = Math.abs(j-i); // absulute value
        // int length = Math.min(height[i],height[j]);
        // int area = breadth*length;
        // max=Math.max(area,max);

        // }
        // }
        // return max;

        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left <= right) {
            int area = 0;
            int length = Math.min(height[left], height[right]);
            int breadth = Math.abs(left - right);
            area = length * breadth;
            max = Math.max(area, max);
            if (height[left] <= height[right]) {
                left++;

            } else {
                right--;
            }
        }
        return max;
    }

    public static boolean checkrepeat(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        // int ans = maxarea(height);
        // System.out.println(ans);

        int nums[] = { 1, 2, 3 , 1 };
       System.out.println(checkrepeat(nums));
    }

}