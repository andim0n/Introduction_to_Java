package basics_of_software_code_development.cycle;

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        BigInteger result = new BigInteger("1");

        for (int i = 1; i <= 200; i++) {
            result = result.multiply(new BigInteger("" + i * i));
        }
        System.out.print(result);
    }
}
