import java.util.*;
public class pattern2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    {
        System.out.print("Enter any no. which you want to make pattern:");
        int n = sc.nextInt();

        for(int i = 1  ; i<=n  ; i++){
            for(int j = 1; j<=n ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    {
        System.out.print("Enter any no. which you want to make pattern:");
        int n = sc.nextInt();

        for(int i = 1  ; i<=n  ; i++){
            for(int j = 1; j<=n ; j++) {
                if(i>=j){
                System.out.print(" * ");}
            }
            System.out.println();
        }
    }


    {
        System.out.print("Enter any no. which you want to make pattern:");
        int n = sc.nextInt();

        for(int i = 1  ; i<=n  ; i++){
            for(int j = 1; j<=n ; j++) {
                if(i + j <= n+ 1){
                System.out.print(" * ");}
            }
            System.out.println();
        }
    }

    
    {
        System.out.print("Enter any no. which you want to make pattern:");
        int n = sc.nextInt();

        for(int i = 1  ; i<=n  ; i++){
            for(int j = 1; j<=n ; j++) {
                if(i+j >= n+1){
                System.out.print("*");}
                else{System.out.print(" ");}
            }
            System.out.println();
        }
    }


    {
        System.out.print("Enter any no. which you want to make pattern:");
        int n = sc.nextInt();

        for(int i = 1  ; i<=n  ; i++){
            for(int j = 1; j<=n ; j++) {
                if(j-i >= 0){
                System.out.print("*");}
                else{System.out.print(" ");}
            }
            System.out.println();
        }
    }

    {
        System.out.print("Enter any no. which you want to make pattern:");
        int n = sc.nextInt();

        for(int i = 1  ; i<=n  ; i++){
            for(int j = 1; j<=n ; j++) {
                if(j-i == 0 || j+i == n+1){
                System.out.print("*");}
                else{System.out.print(" ");}
            }
            System.out.println();
        }
    }

    {
        
        int count  = 1;

        for(int i = 1  ; i<=5 ; i++){
            for(int j = 1; j<=5 ; j++){
                if(i>= j ){
                System.out.print(count + " ");
                count++ ;   
            }
            else{
                System.out.print(" ");
            }
           }
        System.out.println();
    }
 }

}

}
