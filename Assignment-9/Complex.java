// Question-2

class Complex {
    int real, imag;

    Complex() { this(0, 0); }
    Complex(int r, int i) { real = r; imag = i; }
    Complex(Complex c) { this(c.real, c.imag); }

    void showComplex() {
        System.out.println(real + "+" + imag + "i");
    }

    Complex addComplex(Complex c) {
		Complex x = new Complex();
		x.real=real + c.real;
		x.imag=imag + c.imag;
		return x;
        //return new Complex(real + c.real, imag + c.imag);
    }

    Complex substractComplex(Complex c) {
        return new Complex(real - c.real, imag - c.imag);
    }

    Complex multiplyComplex(Complex c) {
        return new Complex(real * c.real - imag * c.imag, real * c.imag + imag * c.real);
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(3, 4);
        Complex c3 = new Complex(c2);

        System.out.print("c1 = "); c1.showComplex();
        System.out.print("c2 = "); c2.showComplex();
        System.out.print("c3 = "); c3.showComplex();

        c1 = c2.addComplex(c3);
        System.out.print("c2 + c3 = "); c1.showComplex();

        c1 = c2.substractComplex(c3);
        System.out.print("c2 - c3 = "); c1.showComplex();

        c1 = c2.multiplyComplex(c3);
        System.out.print("c2 * c3 = "); c1.showComplex();
    }
}

/*
 *FINAL OUTPUT:
 *
 *c1 = 0+0i
 *c2 = 3+4i
 *c3 = 3+4i
 *c2 + c3 = 6+8i
 *c2 - c3 = 0+0i
 *c2 * c3 = -7+24i
 *
 */
