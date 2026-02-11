import java.util.*;
public class pattern3 {
    public static void hollowrectangle(int totrow , int totcol){
        for(int i=1;i<=totrow;i++){
            for(int j=1 ;j<=totcol;j++){
                if(i==1||i==totrow||j==1||j==totcol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void halftriangle(int n){
        for(int i =1 ;i<=n ; i++){

            for(int j = 1 ; j <=n-i;j++){
                System.out.print(" ");
              
            }
            for(int j = 1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 }

  public static void numberpramid(int n ){
    for(int i =  1 ; i<=n;i++){
        for(int j=1 ; j<=n-i+1; j++){
            System.out.print(j + " ");
        }System.out.println();
    }
  }


  public static void floydtriangle(int n){
    int counter = 1;
    for(int i =1 ; i<=n ; i++){
        for(int j =1 ;j<=i ;j++){
            System.out.print(counter + " ");
            counter++;


        }
        System.out.println();
    }
}

    public static void zero_one_triangle(int n){
    
        for(int i =1 ; i<=n ; i++){
            for(int j =1 ;j<=i ;j++){
               if((i+j) % 2 == 0){
                System.out.print("1 ");
               } 
               else{
                System.out.print("0 ");
               }

    
            }
            System.out.println();
        }
      }


      public static void butterfly(int n){
        // first half of butter fly
        for(int i =1 ; i<=n ; i++){
            for(int j =1;j<=i ;j++){
                System.out.print("*");
                
            }
            for( int j = 1; j<= 2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j =1; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         // 2 nd half of butter fly
        for(int i =n ; i>=1; i--){
            for(int j =1;j<=i ;j++){
                System.out.print("*");
                
            }
            for( int j = 1; j<= 2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j =1; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
      }


      public static void solidrombus(int n ){
        for(int  i =1  ; i<=n ; i++){
            for(int j=1 ; j<=(n-i);j++){
            System.out.print(" ");;
        }
        for(int j = 1 ; j<= n ;j++){
            System.out.print("*");
        }
        System.out.println();
     }

       
      }

      public static void hollowwrombus(int n){
        for(int i =1 ; i<=n; i++){
            //space
            for(int j =1 ; j<=(n-i);j++){
                System.out.print(" ");
            }
            // hollow rectangle -0 star 
            for( int j  = 1 ; j<=n ; j++){
                if( i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
           
        }
      }

      public static void diamond(int n){
        // ist half
        for(int i =1 ; i<=n;i++){
            //space
            for(int j =1 ; j<=(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j = 1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half 
        for(int i =n-1 ; i>=1;i--){
            //space
            for(int j =1 ; j<=(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j = 1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

      }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        hollowrectangle(5,5);

        halftriangle(5);
      
        numberpramid(5);

        floydtriangle(5);
        zero_one_triangle(5);

        butterfly(4);
        solidrombus(5);
        hollowwrombus(5);

        diamond(5);
        
    }
    
}
