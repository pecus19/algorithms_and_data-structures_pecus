package ee.ttu.algoritmid.interestingstamps.fibonacci;

import java.math.BigInteger;

public class AL01A {
    /**
     * Compute the Fibonacci sequence number.
     *
     * @param n The number of the sequence to compute.
     * @return The n-th number in Fibonacci series.
     */
    public String iterativeF(int n) {
        if (n == 0) {
            return "0";
        } else {

            BigInteger a = BigInteger.valueOf(1), b = BigInteger.valueOf(1);
            for (int i = 3; i <= n; i++) {
                BigInteger c = a.add(b);
                a = b;
                b = c;
            }
            return b.toString();

        }


//        public static void main (String[]args){
//            System.out.println(iterativeF(5)); // 5
//            System.out.println(iterativeF(6)); // 8
//            System.out.println(iterativeF(8)); // 21
//        }
    }
}
