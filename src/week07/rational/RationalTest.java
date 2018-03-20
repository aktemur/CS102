package week07.rational;

/**
 * This class tests the Rational class by performing
 * rational number operations.
 *
 * @author: Eric Roberts
 */

public class RationalTest {
    public static void main(String[] args) {
        Rational a = new Rational(1, 2);
        Rational b = new Rational(1, 3);
        Rational c = new Rational(1, 6);
        Rational sum1 = a.add(b);
        Rational sum = sum1.add(c);
        System.out.println(a + " + " + b + " + " + c + " = " + sum);
    }
}
