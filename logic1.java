class logic1{

    public static  void subarraysum(int numbers[]){
        int subsum =0;
        for(int i= 0 ;i<numbers.length;i++){
          int start = i;
          for(int j= i ; j<numbers.length;j++){
            int end = j;
            subsum+=numbers[j];
            System.out.println(subsum);
           
          }
          System.out.println();
        }
        
  
       }
       public static int setfirstindex(int numbers,int arr[]){
        int index = -1;
        int low= 0;
        int high = arr.length;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==numbers){
                index = mid;
                high = mid-1;
            }else{
                if(arr[mid]>numbers){
                    high = mid-1;

                }else{
                    low =mid+1;
                }
            }
            
        }
        return index;
       }


    public static void main(String[] args) {

        // int numbers[] = {2,4,6,8,10};
        // subarray(numbers);

        // {
        //    int arr[] = {1,1,1,2,2,2,3,3,3,4};
        //    int a = setfirstindex(3, arr);
        //    System.out.println(a);


        // }
        


        
    }
}