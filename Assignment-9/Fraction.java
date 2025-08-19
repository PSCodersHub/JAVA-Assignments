// Question-1

class Fraction {
    private int num, denum;

    // Default constructor
    Fraction() {
        this.num = 0;
        this.denum = 1;
    }

    // One-argument constructor
    Fraction(int num) {
        this.num = num;
        this.denum = 1;
    }

    // Two-argument constructor
    Fraction(int num, int denum) {
        if (denum == 0) denum = 1;
        this.num = num;
        this.denum = denum;
        reduce();
    }

    // Copy constructor
    Fraction(Fraction f) {
        this.num = f.num;
        this.denum = f.denum;
    }

    void show() {
        reduce();
        if (denum == 1) System.out.println(num);
        else System.out.println(num + "/" + denum);
    }

    void mixed() {
        reduce();
        if (Math.abs(num) > denum) {
            int whole = num / denum;
            int rem = Math.abs(num % denum);
            if (rem == 0) System.out.println(whole);
            else System.out.println(whole + " " + rem + "/" + denum);
        } else {
            show();
        }
    }

    void reduce() {
        int gcd = gcd(Math.abs(num), denum);
        num /= gcd;
        denum /= gcd;
        if (denum < 0) {
            num = -num;
            denum = -denum;
        }
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    Fraction add(Fraction f) {
        int n = this.num * f.denum + f.num * this.denum;
        int d = this.denum * f.denum;
        return new Fraction(n, d);
    }

    Fraction subtract(Fraction f) {
        int n = this.num * f.denum - f.num * this.denum;
        int d = this.denum * f.denum;
        return new Fraction(n, d);
    }

    Fraction multiply(Fraction f) {
        return new Fraction(this.num * f.num, this.denum * f.denum);
    }

    Fraction div(Fraction f) {
        return new Fraction(this.num * f.denum, this.denum * f.num);
    }

    void compare(Fraction f) {
        int lhs = this.num * f.denum;
        int rhs = f.num * this.denum;
        if (lhs > rhs) System.out.println("Current fraction is greater.");
        else if (lhs < rhs) System.out.println("Current fraction is smaller.");
        else System.out.println("Both fractions are equal.");
    }

    // Main method to test
    public static void main(String[] args) {
        Fraction f1 = new Fraction(); // 0/1
        Fraction f2 = new Fraction(3); // 3/1
        Fraction f3 = new Fraction(4, 6); // 2/3 after reduce
        Fraction f4 = new Fraction(f3); // copy of f3

        System.out.print("f1 = "); f1.show();
        System.out.print("f2 = "); f2.show();
        System.out.print("f3 = "); f3.show();
        System.out.print("f4 = "); f4.show();

        Fraction sum = f2.add(f3);
        System.out.print("f2 + f3 = "); sum.mixed();

        Fraction diff = f2.subtract(f3);
        System.out.print("f2 - f3 = "); diff.mixed();

        Fraction prod = f2.multiply(f3);
        System.out.print("f2 * f3 = "); prod.mixed();

        Fraction quotient = f2.div(f3);
        System.out.print("f2 / f3 = "); quotient.mixed();

        System.out.print("Comparing f2 and f3: ");
        f2.compare(f3);
    }
}

/*
 *FINAL OUTPUT:
 *
 *f1 = 0
 *f2 = 3
 *f3 = 2/3
 *f4 = 2/3
 *f2 + f3 = 3 2/3
 *f2 - f3 = 2 1/3
 *f2 * f3 = 2
 *f2 / f3 = 4 1/2
 *Comparing f2 and f3: Current fraction is greater.
 *
 */
