public class recursion1 {
    public static void index(int arr[], int key, int i) {

        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        index(arr, key, i + 1);

    }

    static String[] array = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printdigit(int num) {
        if (num == 0) {
            return;
        }
        int lastdig = num % 10;
        printdigit(num / 10);
        System.out.print(array[lastdig] + " ");
    }

    public static int tillingprob(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // verticalchoice
        int fnm1 = tillingprob(n - 1);
        // horizontal chice
        int fnm2 = tillingprob(n - 2);

        int tooways = fnm1 + fnm2;
        return tooways;

    }

    public static void removestr(String str, int idx, StringBuilder newstr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            removestr(str, idx + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            removestr(str, idx + 1, newstr.append(currchar), map);
        }
    }

    public static int pairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // //choice
        // int fnm1 = pairing(n-1);

        // // pair
        // int fnm2 = pairing(n-2);
        // int pairway = (n-1) * fnm2;

        // int toatalways = fnm1 + pairway;
        // return toatalways;

        return pairing(n - 1) + (n - 1) * pairing(n - 2);
    }

    public static void printbinarystr(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        printbinarystr(n - 1, 0, str + "0");
        if (lastplace == 0) {
            printbinarystr(n - 1, 1, str + "1");
        }

    }

    public static void allindexes(int arr[],int i,int key){
         if(i==arr.length){
            return;
         }
         if(arr[i]==key){
            System.out.print(i + " ");
         }
         allindexes(arr, i+1, key);
    }
    public static void main(String[] args) {
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // int key = 2;
        // index(arr, key, 0);
        // int num = 2933;
        // printdigit(num);
        // System.out.println();

        // System.out.println(tillingprob(4));

        // String str = "appnnacollege";
        // removestr(str, 0,new StringBuilder(""), new boolean[26]);
        // System.out.println(pairing(3));

        // printbinarystr(3, 0, "");
    
        int  arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
         int key = 2;
         allindexes(arr, 0, key);

    }
}