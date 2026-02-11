import java.util.*;
public class class4{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      {
        System.out.println("Write any number :");
        int num1 = sc.nextInt();

        if(num1>=1){
            System.out.println("num1 is positive");
        }
        
        else{
            System.out.println("num1 is negative");
        }
       }

    {

       Double temp = sc.nextDouble();
       if(temp>= 103.5){
        System.out.println("yes");
       } 
       else{
        System.out.println("no");
       }
    }

      {
        int num2 = sc.nextInt();

        if(num2%3 == 0 && num2%5 !=0){
            System.out.println("Fizz"); // Fizz buz problem

        }
        else if(num2 % 5 == 0 && num2 %3 !=0 ){
            System.out.println("Buzz");

        }
        else if(num2 %3 == 0 && num2%5==0){
            System.out.println("FizzBuzz");
        }
        else{
            System.out.println(num2);
        }
      }

    {
// Weekday / weekend
        int day = sc.nextInt();

        switch(day){
            case 1,2,3,4,5 : {
                System.out.println("weekday");
                break ;
               }case 6,7 :{
                System.out.println("weekend");
                 break ;
                 }default: {
                     System.out.println("invalid");
                    }
        }
    }
{
   // covert gmt time into ist

     int daynumber = sc.nextInt();
     int hour = sc.nextInt();
     int minute = sc.nextInt();


     hour+=5;
     minute+=30;

     if(minute>=59){
        hour++;
        minute-=60;
     }
     if(hour>=24){
        daynumber++;
        hour-=24;

     }
     System.out.println("day:  " + daynumber  + "  hour:  " + hour +"  minute:  "+ minute );
}


     

    }
}