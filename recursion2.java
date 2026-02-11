public class recursion2 {
    public static void linearsearch(int arr[],int i,int key){
        if(i==0){
            return;
            }
          if(arr[i] == key){
                System.out.print(i + " ");
            }
            linearsearch(arr, i-1, key);
    }
    public static int tilingproblem(int n){
        int m = 2;
        int area = m*n;
        if(area==0){
            return 0;
        }
        int vertical_area = 2;
        int horizontal_area = 4;

        int ans1 = tilingproblem(n-1);
        int ans2 = tilingproblem(n-2);
        return ans1+ans2;
    }
    public static void main(String[] args) {
        int  arr[] = {3,2,5,4,6,2,7,2,2};
        int key = 2;
        linearsearch(arr, arr.length-1, key);

        System.out.println(tilingproblem(4));
    }
    
}
