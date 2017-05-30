package eu.javaspecialists.performance.managedblocker;

import java.math.*;

// TODO: Code for demo?  Sign up here
// TODO: tinyurl.com/jprime17
public class Fibonacci {
    public BigInteger f(int n) {
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        return f(n - 1).add(f(n - 2));
    }
}
