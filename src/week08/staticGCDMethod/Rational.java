package week08.staticGCDMethod;

/**
 * This is Eric Robert's Rational class.
 * We made the gcd method static.
 */

public class Rational {
    private int num;    /* The numerator of this Rational   */
    private int den;    /* The denominator of this Rational */

    public Rational() {
        this(0);
    }

    public Rational(int n) {
        this(n, 1);
    }

    public Rational(int x, int y) {
        int g = gcd(Math.abs(x), Math.abs(y));
        num = x / g;
        den = Math.abs(y) / g;
        if (y < 0) num = -num;
    }

    public static int gcd(int x, int y) {
        int r = x % y;
        while (r != 0) {
            x = y;
            y = r;
            r = x % y;
        }
        return y;
    }

    public Rational add(Rational r) {
        return new Rational(this.num * r.den + r.num * this.den,
                this.den * r.den);
    }

    public Rational subtract(Rational r) {
        return new Rational(this.num * r.den - r.num * this.den,
                this.den * r.den);
    }

    public Rational multiply(Rational r) {
        return new Rational(this.num * r.num, this.den * r.den);
    }

    public Rational divide(Rational r) {
        return new Rational(this.num * r.den, this.den * r.num);
    }

    public String toString() {
        if (den == 1) {
            return "" + num;
        } else {
            return num + "/" + den;
        }
    }
}
