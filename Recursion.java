
public class Recursion {
    public static void printdec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;

        }
        System.out.print(n + " ");
        printdec(n - 1);
    }

    public static void printinc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printinc(n - 1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fn = n * factorial(n - 1);
        return fn;
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int sm1 = sum(n - 1);
        int sm = n + sm1;
        return sm;
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fm1 = fibonacci(n - 1);
        int fm2 = fibonacci(n - 2);
        int fn = fm1 + fm2;
        return fn;
    }

    public static boolean issorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;

        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issorted(arr, i + 1);
    }

    public static int firstoccur(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstoccur(arr, key, i + 1);
    }

    public static int lastoccur(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastoccur(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }

        return isfound;

    }
    public static int xn(int x,int n){
        if(n==0){
            return 1;
        }
        int ans = x * xn(x,n-1);
        return ans;
    }
    public static int optipwer(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower =optipwer(x, n/2)*optipwer(x, n/2);
        if(n%2 !=0){
            halfpower = x* halfpower;
            
        }
        return halfpower;
    }
    public static void main(String[] args) {
        // int n = 26;
        // printdec(n);
        // printinc(n);
        // System.out.println();
        // System.out.println(factorial(n));
        // System.out.println(sum(n));
        // System.out.println(fibonacci(n));

        // int arr[] = { 23, 5, 3, 5, 10, 5, 9 };
        // System.out.println(issorted(arr, 0));

        // System.out.println(firstoccur(arr, 5, 0));
        // System.out.println(lastoccur(arr, 5, 0));

        int x =2;
        int n=10;
        System.out.println(xn(x, n));
        System.out.println(optipwer(x, n));

    }

}
