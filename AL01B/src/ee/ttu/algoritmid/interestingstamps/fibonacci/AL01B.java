package ee.ttu.algoritmid.interestingstamps.fibonacci;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.Instant;

public class AL01B {

    /**
     * Estimate or find the exact time required to compute the n-th Fibonacci number.
     *
     * @param n The n-th number to compute.
     * @return The time estimate or exact time in YEARS.
     */
    public String timeToComputeRecursiveFibonacci(int n) {
        if (n < 100) {
            double startTime = System.currentTimeMillis();
            recursiveF(n);
            double finalTime = (System.currentTimeMillis() - startTime) / (60000 * 1440 * 365.25);
//            double finalTime = (System.currentTimeMillis() - startTime);
            return String.valueOf(finalTime);
        } else {
            BigInteger bigYear = new BigInteger("61717920");
            return String.valueOf(bigYear.intValue() / 60 / n);
        }

    }

    /**
     * Compute the Fibonacci sequence number recursively.
     * (You need this in the timeToComputeRecursiveFibonacci(int n) function!)
     *
     * @param n The n-th number to compute.
     * @return The n-th Fibonacci number as a string.
     */
    public BigInteger recursiveF(int n) {
        if (n <= 1) return BigInteger.valueOf(n);
        return recursiveF(n - 1).add(recursiveF(n - 2));
    }

//    public static void main(String[] args) {
//        System.out.println(timeToComputeRecursiveFibonacci(30)); // "0.000141375552765256"
////        System.out.println(timeToComputeRecursiveFibonacci(69)); // "1.54297205986166);
//    }
}