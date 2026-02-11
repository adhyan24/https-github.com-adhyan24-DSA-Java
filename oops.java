import java.util.*;
public class oops {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //     Pen p1 = new Pen() ; // created a pen object
    //     p1.setcolour("Blue");
    //     System.out.println(p1.getcolour());
    //     p1.settip(5);
    //     System.out.println(p1.gettip());
    //    // p1.setcolour("Yellow");
    //    p1.setcolour("yellow"); 
    
    //    System.out.println(p1.getcolour());


    //    Bankaccount myacc = new Bankaccount();

    //    myacc.username = "adhyantiwari";
    //    myacc.setpassword("|kjbndjh");
      
    // student s1 = new student();
    // System.out.println(s1.name);

    // student s2  =new student();
    // System.out.println(s2);

    // student s3 =new student(62);
    // System.out.println(s3.roll);
    
    // s1.name = "adhyan";
    // s1.roll = 738;
    // s1.password = "kjsbjbn";
    //  s1.marks[0] = 90;
    //    s1.marks[1] = 80;
    //    s1.marks[2] = 70;


    // student s2 = new student(s1);
    // s1.password = "xyz"  ;
    // s1.marks[2] = 30;  
    // for(int i =0;i<3;i++){
    //     System.out.println(s2.marks[i]);
    // } 

    // fish shark = new fish();
    // shark.eat();
   
     dog puppy = new dog();
     puppy.eat();
     puppy.legs = 4;
     System.out.println(puppy.legs);

    }
    
}
//   class Bankaccount{
//      public String username;
//      private String password;
//       public void setpassword(String pwd){
//         password = pwd;
//       }
 // }
class Pen {
        // properties + function 
        private  int tip;
        private String colour;

    
        String getcolour(){
            return  this.colour ;
        }
        int gettip(){
            return this.tip;

             
        }
        void setcolour(String newcolour){
            this.colour = newcolour;

        }
        void settip(int newtip){
            this.tip = newtip;
        }
    }
    // class Student{
    //     String name;
    //     int age;
    //     float percentage;

    //     void calcpercentage(int phy,int math , int chem){
    //         percentage = (phy+math+chem)/3;
    //     }

    // }

    class student {
        String name;
        int roll;
        String  password;
        int marks[];


        // shallow copy constructor
        // student(student s1){
        //     marks  = new int[3];
        //     this.name = s1.name;
        //     this.roll = s1.roll;
        //     this.marks = s1.marks;

        // }


        // deep copy constructor
        student (student s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for(int i= 0 ;i<marks.length;i++){
                this.marks[i] = s1.marks[i];
            }

        }
        student(String name){
             marks  = new int[3];
            this.name = name;
            // System.out.println();
        }
        student(){
             marks  = new int[3];
            System.out.println("gvhjṇfg");
        }
        student(int roll){
             marks  = new int[3];
            this.roll = roll;
        }
    }
 class animal{
    String colour;
    void eat(){
        System.out.println("eats");
    }

    void bresthe(){
        System.out.println("breathes");
    }
 }

 // derived class
//  class fish extends animal{
//     void swim(){
//         System.out.println("swim in water");

// }
// }

class mammal extends animal{
    int legs;
}
class dog extends mammal{
    int bread;
}
