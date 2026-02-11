import java.util.*;

public class oops4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {

            complex a = new complex(7, 8);
            complex b = new complex(4, 7);

            complex m = complex.add(a, b);
            System.out.print("The adition of two complex no. is : ");
            m.printcomplex();

            complex n = complex.sub(a, b);
            System.out.print("The subtraction of two complex no. is : ");
            n.printcomplex();

            complex r = complex.prod(a, b);
            System.out.print("The product of  two complex no. is : ");

            r.printcomplex();
        }
        
    }

}

class complex {
    int real;
    int imag;

    complex() { // default contructor

    }

    complex(int r, int i) { // parameter constructor
        real = r;
        imag = i;

    }

    public static complex add(complex a, complex b) {
        complex c = new complex(0, 0);
        c.real = a.real + b.real;
        c.imag = a.imag + b.imag;

        return c;

    }

    public static complex sub(complex a, complex b) {
        complex c = new complex(0, 0);
        c.real = a.real - b.real;
        c.imag = a.imag - b.imag;

        return c;
    }

    public static complex prod(complex a, complex b) {

        int x = a.real;
        int y = b.real;

        int p = a.imag;
        int q = b.imag;
        complex c = new complex(0, 0);

        c.real = x * y - p * q;
        c.imag = x * q + p * y;

        return c;

    }

    public void printcomplex() {
        if (real == 0 && imag != 0) {

            System.out.println(imag + "i");
        } else if (real != 0 && imag == 0) {

            System.out.println(real);
        } else {

            System.out.println(real + "+" + imag + "i");
        }
    }
}
