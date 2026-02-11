import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
  public static boolean monotonic(ArrayList<Integer> list) {
    boolean inc = true;
    boolean dec = true;
    for (int i = 0; i < list.size() - 1; i++) {
      if (list.get(i) > list.get(i + 1)) {
        inc = false;
      } else {
        dec = false;
      }
    }
    return inc || dec;
  }

  public static ArrayList<Integer> lonely(ArrayList<Integer> list) {
    ArrayList<Integer> result = new ArrayList<>();

    int n = list.size();
    Collections.sort(list);

    for (int i = 0; i < n; i++) {
      if (i != 0 && (list.get(i - 1) == list.get(i) - 1 || list.get(i - 1) == list.get(i))) {
        continue;
      }
      if (i != n - 1 && (list.get(i + 1) == list.get(i) + 1 || list.get(i + 1) == list.get(i))) {
        continue;
      }
      result.add(list.get(i));
    }
    return result;

  }

  public static int maxtarget(ArrayList<Integer> nums, int key) {
    int[] count = new int[1001];
    for (int i = 0; i < nums.size() - 1; i++) {
      if (nums.get(i) == key) {
        count[nums.get(i + 1)]++;
      }

    }
    int maxvalue = 0;
    int target = 0;
    for (int i = 0; i < count.length; i++) {
      if (count[i] > maxvalue) {
        target = i;
        maxvalue = count[i];
      }
    }
    return target;
  }

  public static ArrayList<Integer> Beutifularray(int n) {
    ArrayList<Integer> ans = new ArrayList<>();
    ans.add(1);

    while (ans.size() < n) {
      int ans_size = ans.size();
      ArrayList<Integer> temp = new ArrayList<>();
      for (int i = 0; i < ans_size; i++) {
        if (2 * ans.get(i) - 1 <= n) {
          temp.add(ans.get(i) * 2 - 1);
        }
      }
      for (int i = 0; i < ans_size; i++) {
        if (ans.get(i) * 2 <= n) {
          temp.add(ans.get(i) * 2);
        }
      }
      ans = temp;
    }
    return ans;
  }

  public static void main(String[] args) {

    ArrayList<Integer> sample1 = new ArrayList<>();
    sample1.add(3);
    sample1.add(2);
    sample1.add(1);
    System.out.println(monotonic(sample1));
    System.out.println();

    ArrayList<Integer> sample2 = new ArrayList<>();
    sample2.add(1);
    sample2.add(3);
    sample2.add(5);
    sample2.add(3);
    sample2.add(4);
    sample2.add(10);
    System.out.println(lonely(sample2));
    System.out.println();

    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(1);
    nums.add(5);
    nums.add(4);
    nums.add(1);
    nums.add(3);
    nums.add(1);
    nums.add(4);
    nums.add(1);
    nums.add(5);
    System.out.println(maxtarget(nums, 1));
    System.out.println();

    System.out.println(Beutifularray(6));

  }

}
