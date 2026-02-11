import java.util.*;
public class practica {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

     int n = 10;
     int o = 0;
     int e = 0;
     
      for(int i = 0 ; i<=n;i++){
        int a = sc.nextInt();
        if(a%2==0){
            e+=a;
            System.out.print(e);
            
            
        }
        else{
            o+=a;
            System.out.println(o);

        }

      }

    }
    
}

