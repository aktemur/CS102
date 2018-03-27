package week08.staticGCDMethod;

public class RationalTest {
    public static void main(String[] args) {
        // Because gcd is a public static method,
        // we can call it directly through the class.
        // We do not need to instantiate the Rational class first.
        int n = Rational.gcd(42, 28);
        System.out.println(n);

        // Fields can be declared static, too.
        // PI is a public static field defined in the Math class.
        System.out.println("Pi: " + Math.PI);

        // PI is also defined as final.
        // This means it's constant; it's value cannot be changed.
        // The following line gives a compiler error.
        // Math.PI = 3.0;
    }
}
