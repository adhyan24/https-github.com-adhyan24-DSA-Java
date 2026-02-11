import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int number = sc.nextInt();

        // if(number % 3 == 0) {
        //     if(number % 5 ==0){
        //         System.out.println("Fizz Buzz");
        //     }else {
        //         System.out.println("Fizz");
        //     }
        // }else {
        //     if(number % 5 == 0) {
        //         System.out.println("Buzz");
        //     }else {
        //         System.out.println("Fuck you");
        //     }
        // }

        // if(number % 3 == 0 && number % 5 == 0) {
        //     System.out.println("Fizz Buzz");
        // }else if(number % 3 == 0 ) {
        //     System.out.println("Fizz");
        // }else if (number % 5  == 0) {
        //     System.out.println("Buzz");
        // }else {
        //     System.out.println("Fuck you");
        // }
        

     int n = 5 ;
     for(int i=1 ; i<=n ; i++){
        for(int j =1 ; j<= n ; j++){
            if(i-j >=0){
                System.out.print("* ");
            }
        }
        System.out.println();
     }


               

}
}
