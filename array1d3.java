import java.util.*;
public class array1d3 {
    public static  void subarraysum(int numbers[]){ // array ka sub array 
        int subsum =0; // finding sum of sub array
        int maxsum = Integer.MIN_VALUE; // max sum sub array

        for(int i= 0 ;i<numbers.length;i++){
          int start = i;
          for(int j= i ; j<numbers.length;j++){
            int end = j;
            subsum=0;
            for(int k=start; k<=
            end; k++){
            subsum+=numbers[k];
        }
            System.out.println(subsum);
            if(maxsum<subsum){
                maxsum = subsum;
            }
          }
        }
        System.out.println("the max sum is : " + maxsum);
    }
    public static void prefixsum(int numbers[]){
        int subsum =0;
        int maxsum = Integer.MIN_VALUE;
        int prefix []= new int[numbers.length];

        for(int i=1 ; i<prefix.length ;i++){
         prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i= 0 ;i<numbers.length;i++){
            int start = i;
            for(int j= i ; j<numbers.length;j++){
              int end = j;
            
             subsum = start==0 ? prefix[end]: prefix[end] - prefix[start-1];
          
              System.out.println(subsum);
              if(maxsum<subsum){
                  maxsum = subsum;
              }
            }
          }
          System.out.println("the max sum is " + maxsum);
        } 

        public static void kadanes(int numbers[]){
            int  ms = Integer.MIN_VALUE;
            int cs = 0;
            for(int i=0; i<numbers.length; i++){
                cs =cs + numbers[i];
                if(cs<0){
                    cs=0;
                }
              ms = Math.max(cs,ms);

            }
            System.out.println("the max of sub array is : " + ms);

        }

          public static int trappedrainwater(int height[]){ // O(n)
             int n = height.length;
            //calculate left max bound
            int leftmax[] = new int[n];
            leftmax[0] = height[0];
            for(int i =1 ; i<n;i++){
                leftmax[i] = Math.max(height[i],leftmax[i-1]);
            }
            // claculate right max bound

            int rightmax[] = new int [n];
            rightmax[n-1] = height[n-1];
            for(int i = n-2;i>=0;i--){
                rightmax[i] = Math.max(height[i], rightmax[i+ 1]);
            }
             int trappedwater = 0;
            //loop
            for(int i = 0 ; i<n;i++){
                 //water = min(leftmax , right max)
               int waterlevel = Math.min(leftmax[i],rightmax[i]);
             
              
            // trapped water = water level - hieght[i]
            trappedwater+=waterlevel-height[i];
            }
            return trappedwater;
           
          }

          public static int buysellstock(int prices[]){
            int buyprice = Integer.MAX_VALUE;
            int maxprofit = 0 ;
            for(int i=0;i<prices.length;i++){
                if(buyprice<prices[i]){
                    int profit = prices[i] - buyprice;
                    maxprofit = Math.max(maxprofit,profit);

                }else{
                    buyprice = prices[i];
                }
            }
            return maxprofit; //O(n)
          }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);

        // // subarraysum(numbers );
        // prefixsum(numbers);

    //     int height[] = {4,2,0,6,3,2,5};
    //    System.out.println(trappedrainwater(height)); 

    // int prices[] = {7,1,5,3,6,4};

    // System.out.println(buysellstock(prices));

  }
    
}
