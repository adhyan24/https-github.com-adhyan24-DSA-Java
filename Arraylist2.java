import java.util.ArrayList;
import java.util.Collections;

public class Arraylist2 {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static int waterincontainer(ArrayList<Integer> container) {
        int max_water = 0;
        
       // brute force - O(n^2)
        // for(int i = 0;i<container.size();i++){
        //     for(int j= i+1;j< container.size();j++){
        //       int  height  =Math.min(container.get(i), container.get(j));
        //        int width = j- i;
        //        int curr_water = height*width;
        //        max_water = Math.max(max_water, curr_water);
        //     }
        // }

        // optimized approach - O(n) ( two pointer)
        int lp = 0;
        int rp = container.size()-1;
        while(lp<rp){
            int curr_water = (rp-lp)* Math.min(container.get(lp), container.get(rp));
            max_water = Math.max(max_water, curr_water);

            if(lp<rp){
                lp++;
            }else{
                rp--;
            }

        }

        return max_water;
    }

    public static boolean psirsum1(ArrayList<Integer> list,int target){
       
        // brute force - O (n^2)
        // for(int i = 0 ; i<list.size();i++){
        //     for(int j =  i+1 ; j<list.size();j++){
        //         if(list.get(i) + list.get(j) == target){
        //             return true;
        //         }
        //     }
        // }

        // optimized approch for sorted list
        int lp= 0;
        int rp= list.size()-1;
        while(lp<rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }else if(list.get(lp) + list.get(rp) < target){
                lp++;
            }else{
                rp--;
            }
        }

        return false;
    }
    public static boolean pairsum2(ArrayList<Integer> list,int target){
      int bp = -1;
      for(int i = 0 ;i<list.size();i++){
        if(list.get(i)>list.get(i+1)){
            bp = i;
            break;
        }
      }
      int lp = bp+1;
      int rp = bp;
      int n = list.size();
      while(lp!=rp){
        if(list.get(lp)+list.get(rp) == target){
            return true;
        }else if (list.get(lp)+ list.get(rp) < target){
            lp = (lp+1) % n;

        }else{
            rp = (n+rp-1)%n;
        }
      }
      return false;
    }
    public static void main(String[] args) {

        // { ArrayList<Integer> list = new ArrayList<>();

        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);

        // { int idx1 = 1,idx2=3;
        // System.out.println(list);
        // swap(list,idx1,idx2);
        // System.out.println(list);
        // }

        // Collections.sort(list);
        // System.out.println(list);
        // System.out.println();

        // //decending order sort
        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);
        // System.out.println();
        // }

        {
            ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            ArrayList<Integer> list3 = new ArrayList<>();

            for (int i = 1; i <= 5; i++) {
                list1.add(i);
                list2.add(i * 2);
                list3.add(i * 3);
            }

            mainlist.add(list1);
            mainlist.add(list2);
            mainlist.add(list3);

            System.out.println(mainlist);

            for (int i = 0; i < mainlist.size(); i++) {
                ArrayList<Integer> currlist = mainlist.get(i);

                for (int j = 0; j < currlist.size(); j++) {
                    System.out.print(currlist.get(j) + " ");
                }
                System.out.println();
            }
        }

        ArrayList<Integer> container = new ArrayList<>();
        container.add(1);
        container.add(8);
        container.add(6);
        container.add(2);
        container.add(5);
        container.add(4);
        container.add(8);
        container.add(3);
        container.add(7);

        System.out.println(waterincontainer(container));
        

        ArrayList<Integer> list_1 = new ArrayList<>();
        list_1.add(1); 
        list_1.add(2);
        list_1.add(3);
        list_1.add(4);
        list_1.add(5);
        list_1.add(6);

        System.out.println(psirsum1(list_1, 5));
      
        ArrayList<Integer> list_2 = new ArrayList<>();
        list_2.add(11);
        list_2.add(15);
        list_2.add(6);
        list_2.add(8);
        list_2.add(9);
        list_2.add(10);
             
        System.out.println(pairsum2(list_2, 16                                                                                                  ));
 
    }

}
