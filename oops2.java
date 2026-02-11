import java.util.*;
public class oops2 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // System.out.println(a);

        // claculator calc = new claculator();
        // System.out.println(calc.sum(1,3));
        // System.out.println(calc.sum((float)1.5,(float)2.5));
        // System.out.println(calc.sum(1,2,3));

        // deer d = new deer();
        // d.eat();
        // horse h = new horse();
        // h.eat();
        // h.walks();
        // System.out.println(h.colour);
        // chicken c = new chicken();
        // c.eat();
        // c.walks();
       
        // mustang m = new mustang();
        // System.out.println(m.colour);

        // queen q = new queen();
        // q.moves();

        // bear b = new bear();
        // b.veg();
        // b.nonveg();

        // student s1 =new student();
        // s1.schoolname = "pushpa";

        // student s2 = new student();
        // System.out.println(s2.schoolname);

        horse h1 = new horse();
        System.out.println(h1.colour);



        
    }
    
}

class claculator{
    int sum(int a,int b ){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;

    }

    int sum(int a , int b, int c){
        return a+b+c;
    }
}

 abstract class animal{
    String colour ;
    animal(){
        System.out.println("animal constructor called ");
    }

    void eat(){
        System.out.println("eats anything");
    }
    abstract void walks();
}
// class deer extends animal{
//     void eat(){
//         System.out.println("eats grass!");
//     }
// }
class horse extends animal{
    horse(){
        super.colour = "brown";
        System.out.println("horse constructor called");
    }
    void changecolour(){
        colour = "dark brown";
    }
    void walks(){
        System.out.println("walks on 4 legs");
    }
}
class mustang extends horse{
   mustang(){
    System.out.println("mustang constructor is called ");
   } 
}
class chicken extends animal{
    
    void walks(){
        System.out.println("walks on 2 legs");
    }
}

 interface chessplayer  {
    void moves();
}

class queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal");
    }
}

class rook implements chessplayer{
    public void moves(){
        System.out.println("horizontal abd diagonal");
    }
}

interface herbi{
    public void veg();
}
interface carvi{
    public void nonveg();
}

class bear implements herbi , carvi{
    public void veg(){
        System.out.println("eats grass");
    }

    public void nonveg(){
        System.out.println("eats row meat");
    }
}

class  student{
    static int returnpercentage(int math,int chem,int phy){
        return (math+chem+phy)/3;
    }
    String name;
    int roll;
    static String schoolname;
    void setname(String name){
        this.name =name;

    }
    String getname(){
        return this.name;
    }
}

