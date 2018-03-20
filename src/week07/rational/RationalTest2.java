package week07.rational;

/**
 * This class tests the Rational class by performing
 * rational number operations.
 *
 * @author: Eric Roberts
 */

public class RationalTest2 {
    public static void main(String[] args) {
        Rational a = new Rational(); // 0
        Rational b = new Rational(3); // 3/1
        Rational c = new Rational(2); // 2/1
        Rational div = a.subtract(b).divide(c);
        System.out.println("(" + a + "-" + b + ")/" + c + " = " + div);
    }
}
