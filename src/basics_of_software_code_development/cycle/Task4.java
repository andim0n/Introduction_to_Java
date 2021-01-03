package basics_of_software_code_development.cycle;

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        BigInteger result = new BigInteger("1");
        BigInteger numBig = new BigInteger();
        String numStr;

        for (int i = 1; i <= 200; i++) {
            numStr = numStr.valueOf(i);
            numBig.
            result = result.multiply(numBig);
        }
        System.out.print(result);
    }
}
