import java.util.*;
public class function {
   

    public static void swap(int a, int b){
        int temp = a;
            a = b ;
            b = temp;
            System.out.println("a="+a);
            System.out.println("b="+b);

    }
    public static int calculatesum(int num1, int num2){ // parameters or formal parameterss
        return num1 + num2;    
    }

    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }

    public static int factorial(int n){
        int f = 1;
        for(int i = 1;i<=n;i++){
            f = f * i ; 
        }
        return f;
    }

    public static int binomialcoff(int n ,int r){ // binomial coffiant fuction
       int n_fact = factorial(n);
       int r_fact = factorial(r);
       int nmr_fact= factorial(n-r);

       int binomialcoff = n_fact / (r_fact * nmr_fact);
       return binomialcoff;
    }

    public static int calculatesum(int num1, int num2,int num3){
        return num1+num2+num3;
    }

    public static float calculatesum(float num1 , float num2){
        return num1+num2;
    }

    public static boolean primecheck(int n){
        for(int i =2 ; i<= Math.sqrt(n);i++){
            if(n%i == 0){
            return false;
        }
        }
        return true;
    }

    public static void primesinrange(int n){
        for(int i = 2;i<=n;i++){
            if(primecheck(i)){
                System.out.print(i+"");

            }
            System.out.println();
        }
    }
  
    public static void bintodec(int binnum){
        int mynum = binnum;
        int pow =0;
        int decnum=0;
        while(binnum>0){
            int lastdigit =binnum%10;
            decnum = decnum + (lastdigit * (int)Math.pow(2,pow));
            pow++;
            binnum =binnum/10;
        }
        System.out.println("decimal of"+ mynum + "=" + decnum);
    }

    public static void dectobin(int n){
        int mynum =n;   
        int pow=0;
        int binnum=0;
        while(n>0){
            int rem =n%2;
            binnum= binnum + (rem*(int)Math.pow(10,pow));
            pow++;
            n =n/2;
        }
        System.out.println("binary form of"+mynum+"="+binnum);
    }
    public static void avgnum(int num1,int num2,int num3){
        int average =(num1+num2+num3)/3;
        System.out.println("the average of three number is : "  + average);
    }

    public static boolean iseven(int n){
        
        if(n%2==0)
        {
            return true;
        }else{
        return false;
       }
    }

    public static void sumofdigit(int num){
        int sum=0;
        while(num>0){
            int lastdigit = num%10;
            sum = sum + lastdigit;
            num = num/10;
        }
        System.out.println(sum);

    }

    public static void ispalimdrome(int num){
        int palimdrome = num;
        int reverse = 0;
        int rem;

        while(num>0){
            rem = num%10;
            reverse = reverse*10 + rem ;
            num/=10;
        }
        System.out.println("the palimdrome of given num is : " + reverse);
    }

   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
       { int a = sc.nextInt();
        int b  = sc.nextInt();
        calculatesum(a,b); // arguments or argument parameters
       }

        { 
            int a = 5;
            int  b = 10;
            swap(5,10);
            int prod = multiply(55,10);
            System.out.println("a*b="+prod);
        }

        {
           
           System.out.println(factorial(5));
        }
        {
           System.out.println(binomialcoff(5,2));
           System.out.println(calculatesum(5,4,6 ));
           System.out.println(calculatesum(2.5f, 6.2f));
        }

            
       System.out.println(primecheck(7));
       primesinrange(25);

    {
          bintodec(101);
          dectobin(53);
    }

    {
        // avgnum(6,12,9);

        System.out.println("enter any natural number : ");
        int number = sc.nextInt();
        if(iseven(number)){
            System.out.println("the number is even");
        }
        else {
            System.out.println("the number is odd");
        }
    }

    {
        sumofdigit(10006);
        ispalimdrome(123456);
    }
       
    }
    
}
