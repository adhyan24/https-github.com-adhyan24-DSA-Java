import java.util.*;
public class class5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        for(int line = 1 ; line <= 4;line++){
            for( int star = 1 ; star<=line;star++){
                System.out.print(" * ");
            }
             System.out.println();

        }


        {

            int n = 7 ;
            char ch = 'A';

            for(int line= 1 ; line<=n;line++){
                for(int chart = 1 ; chart <=line; chart++){
                    System.out.print(ch);
                    ch++;
                }System.out.println();
            }


        }

        {
            for(int line1 = 1 ; line1 <=4;line1++){
                for(int star1 = 1 ; star1<=4-line1+1 ; star1++ ){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }

        { 
            for(int line2 = 1 ;line2<=4;line2++){
                for(int pat =1 ; pat<=line2;pat++){
                    System.out.print(pat);
                    
                }
                System.out.println();
            }
        }

        {
            for(int  cam = 1 ; cam<=5 ; cam++){
                for(int nam = 5; nam<=cam;nam++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        




    }
    
}
