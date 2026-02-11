import java.util.ArrayList;

public class Arraylist {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<Boolean> list3 = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    System.out.println(list);

    // get operation
    System.out.println(list.get(2));

    // delete
    list.remove(2);
    System.out.println(list);

    // set element at index
    list.set(2, 20);
    System.out.println(list);

    // contains

    System.out.println(list.contains(1));

    System.out.println(list.contains(3));

    list.add(1, 9);
    System.out.println(list);

    System.out.println(list.size());

    // print element
    for (int i = 0; i < list.size(); i++) {
      System.err.print(list.get(i) + " ");
    }
    System.out.println();

    // reverse element
    for (int j = list.size() - 1; j >= 0; j--) {
      System.out.print(list.get(j) + " ");

    }
    System.out.println();

    int max = Integer.MIN_VALUE;
    for(int k=0;k<list.size();k++){
        max = Math.max(max, list.get(k));
    }
    System.out.println(max);


  }
}
