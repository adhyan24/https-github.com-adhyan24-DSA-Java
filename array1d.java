import java.util.*;

public class array1d {

  public static void update(int marks[], int nonchangeble) {

    nonchangeble = 10;
    for (int i = 0; i < marks.length; i++) {
      marks[i] = marks[i] + 1;
    }

  }

  public static int linearsearch(int numbers[], int key) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == key) {
        return i;

      }

    }
    return -1;
  }

  public static int getlargest(int numbers[]) {
    int largest = Integer.MIN_VALUE; // -infinity
    int smallest = Integer.MAX_VALUE; // + infinity
    for (int i = 0; i < numbers.length; i++) {
      if (largest < numbers[i]) {
        largest = numbers[i];
      }
      if (smallest > numbers[i]) {
        smallest = numbers[i];
      }

    }
    System.out.println(" the smallest value is: " + smallest);
    return largest;

  }

  public static int binarysearch(int numbers[], int key) {
    int start = 0;
    int end = numbers.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (numbers[mid] == key) { // found
        return mid;
      }
      if (numbers[mid] < key) { // right
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }

  public static void reverse(int numbers[]) {
    int first = 0, last = numbers.length - 1;
    while (first < last) {
      int temp = numbers[last];
      numbers[last] = numbers[first];
      numbers[first] = temp;

      first++;
      last--;
    }
  }

  public static void printpair(int numbers[]) {
    int totalpair = 0;
    for (int i = 0; i < numbers.length; i++) {
      int current = numbers[i]; // 2,4,6,8,10
      for (int j = i + 1; j < numbers.length; j++) {
        System.out.print("(" + current + "," + numbers[j] + ")");
        totalpair++;
      }
      System.out.println();
    }
    System.out.println("total pair is: " + totalpair);
  }

  public static void subarray(int numbers[]) {
    int ts = 0;
    for (int i = 0; i < numbers.length; i++) {
      int start = i;
      for (int j = i; j < numbers.length; j++) {
        int end = j;
        for (int k = start; k <= end; k++) {
          System.out.print(numbers[k] + " "); // subarray
        }
        ts++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("total sub array :  " + ts);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int marks[] = new int [50];

    // System.out.println(" length of array : " + marks.length);

    // marks[0]=sc.nextInt();
    // marks[1] = sc.nextInt();
    // marks[2]= sc.nextInt();

    // System.out.println("phy:" + marks[0]);
    // System.out.println("math : " + marks[1]);
    // System.out.println("chem : " + marks[2]);

    // int percentage = (marks[0] + marks[1] + marks[2]) / 3 ;

    // System.out.println(" percentage : " + percentage + " %");
    // {
    // int marks []= {97,98,96};
    // int nonchangeble = 5;

    // update(marks , nonchangeble );
    // System.out.println(nonchangeble);

    // for( int i = 0 ; i<marks.length ; i++ ){
    // System.out.print(marks[i] + " ");
    // }
    // System.out.println();

    // }

    // {

    // int numbers[] = {2,4,6,8,10,12,14,16};
    // int key = 10;
    // int index = linearsearch(numbers, key);

    // if(index==-1){
    // System.err.println("not found");
    // }else{
    // System.out.println("the index is " + index);
    // }
    // }

    // {

    // int numbers[] = {2,4,6,8,10,12,14,16};
    // System.out.println("the largest value iss: "+ getlargest(numbers));

    // }

    // {
    // int numbers[] = { 2,4,6,8,10,12,14};
    // int key = 4;
    // System.out.println(" the inedex of key : " + binarysearch(numbers, key));

    // }

    // {
    // int numbers[]= { 2,4,6,8,10};
    // reverse(numbers);

    // for(int i = 0 ; i <numbers.length;i++){
    // System.out.print(numbers[i] + " ");
    // }
    // System.out.println();

    // }

    {
    int numbers[] = { 2,4,6,8,10};
    printpair(numbers);
    }

    {
      int numbers[] = { 2, 4, 6, 8, 10 };
      subarray(numbers);
    }
  }
}
