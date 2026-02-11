import java.util.*;
public class bitmanupilation {
    public static void oddoreven(int n){
        int bitmask = 1;
        if((n&bitmask) == 0){
            System.out.println(" the number is even");
        }else{
            System.out.println(
                "theno. is odd"
            );
        }
    }
    public static int ithbit(int n , int i){

        int bitmask=(1<<i);
    

        if((n&bitmask) == 0){
            return 0;
        }else{
            return 1;
        }

    }
    public static int setith(int n,int i){
        int bit= (1<<i);
        return n|bit;
    }
    
    public static int clearith(int n,int i){
        int bit= ~(1<<i);
        return n&bit;
    }

    public static int clearlastith(int n,int i){
        int bit= (~0)<<i;
        return n&bit;
    }
    public static int updateith(int n,int i ,int newbit){
        // if(newbit==0){
        //     return clearith(n, i);
        // }else{
        //     return setith(n, i);
        // }

        n = clearith(n, i);
        int bitmask  = newbit <<i;
        return n | bitmask;
    }
    public static int clearbits(int n,int i ,int j ){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = (a|b);

        return n &bitmask;
    }
    public static boolean  ischeckpower(int n){
        return (n&(n-1)) == 0;
    }
     public static int countset(int n){
        int count = 0;
        while(n>0){
            if((n&1) != 0){
                count ++;
            }
             n =n>>1;
        }
        return count;
     }
     public static int fastexpo(int a ,int n){
     int ans = 1;
     while(n>0){
        if((n&1)!=0){
            ans =ans*a;

        }
           a =a*a; 
           n=n>>1;
    }
    return ans;
     }
    public static void main(String[] args) {
    Scanner  sc  = new Scanner(System.in);
// {
//     System.out.println(5&6);
//     System.out.println(5|6);
//     System.out.println(5^6); 
//     System.out.println(~5);
//     System.out.println(5<<2);
//     System.out.println(6>>1);
//         }

    //  oddoreven(8);


//    System.out.println( ithbit(10, 03));

//    System.out.println(setith(10, 2));
//    System.out.println(clearith(10,1));

//    System.out.println(updateith(10, 02, 01 ));

System.out.println(clearlastith(15, 2));

System.out.println(clearbits(10, 02, 04));
 System.out.println(ischeckpower(8));
 System.out.println( countset(10));

 System.out.println(fastexpo(3, 05));



    }
}
