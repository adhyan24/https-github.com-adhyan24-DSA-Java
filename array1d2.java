
import java.util.*;

public class array1d2 {

    public static void change(int arr[]) {
        arr[0] = 63;
        arr[1] = 47;

    }

    public static boolean checkrepeat(int numbers[]) {
        int key = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != key) {
                key = numbers[i];
                for (i = 0; i < numbers.length; i++) {
                    if (numbers[i] != key) {
                        return false;
                    }
                }

            }
        }
        return true;
    }

    // HashSet<Integer> set = new HashSet<>();
    // for (int i = 0; i < numbers.length; i++) {
    // if (set.contains(numbers[i]))
    // return true;
    // set.add(numbers[i]);
    // }
    // return false;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = 5;
        // int marks[] = new int[n];
        // marks[0] = 7;
        // marks[1] = 6 ;
        // marks[2] = 10;
        // marks[3] = 15;
        // marks[4] = 2;
        // int i = 0;
        // int j = n-1;

        // while(i<=j){
        // int temp = marks[i];
        // marks[i] = marks[j];
        // marks[j]=temp;
        // i++;
        // j--;
        // }
        // for( i= 0 ; i <n ; i++){
        // System.out.println(marks[i]);
        // }

        // {
        // int x []= {20,37};
        // System.out.println(x[0]);
        // System.out.println(x[1]);
        // change(x);
        // System.out.println(x[0]);
        // System.out.println(x[1]);
        // }

        {
            int numbers[] = { 1, 2, 3, 1 };

            System.out.println(checkrepeat(numbers));

        }
    }

}
