public class bitmanupulation {
     public static int singleNumber(int[] arr) {
        int result = 0;
        for(int i = 0;i<arr.length;i++){
            result^=arr[i];
            // result = result^arr[i];
        }

        return result;
       
        
    }
     public static int minBitFlips(int start, int goal) {
        int count = 0;
        int n = start^goal;
        while(n>0){
            n= n&(n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,4,3,2};
        System.out.println(singleNumber(arr));

        int start = 10,goal=7;
        System.out.println(minBitFlips(start, goal));

        


        
    }
    
}
