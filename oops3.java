public class oops3 {
    public static void main(String[] args) {

        // vehicle v = new car();
        // v.print();
        // vehicle c = new vehicle();
        // c.print();

        // test t = new test();
        // t.set_marks(98); // line2
        // System.out.println(test.marks); // line3

        

    }
    
}

class vehicle{
    void print(){
        System.out.println("base class vehivle");
    }
}
class car extends vehicle{

    void print1(){
        System.out.println("derived class car");

}}

class test{

    static int marks;
    void set_marks(int marks){
        this.marks = marks; //line1
    }
}

