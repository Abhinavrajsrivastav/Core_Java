package BigInteger;

import java.math.BigInteger;

public class bigInteger {
    

    public static void main(String[] args) {
        // Creating BigInteger objects
        BigInteger bigInt1 = new BigInteger("123456789012345678901234567890");
        BigInteger bigInt2 = new BigInteger("987654321098765432109876543210");

        // Basic arithmetic operations
        BigInteger sum = bigInt1.add(bigInt2);
        BigInteger difference = bigInt1.subtract(bigInt2);
        BigInteger product = bigInt1.multiply(bigInt2);
        BigInteger quotient = bigInt1.divide(bigInt2);
        BigInteger remainder = bigInt1.remainder(bigInt2);
        BigInteger a = new BigInteger("2");
        BigInteger b = a.add(BigInteger.valueOf(25));
        
        int v ;
        System.out.println(v);

        // Exponentiation
        BigInteger power = bigInt1.pow(2);

        // Comparison
        boolean isEqual = bigInt1.equals(bigInt2);
        int comparisonResult = bigInt1.compareTo(bigInt2);

        // Other methods
        BigInteger absValue = bigInt1.abs();
        BigInteger negateValue = bigInt1.negate();

        // Converting to and from other data types
        int intValue = bigInt1.intValue();
        long longValue = bigInt1.longValue();
        String stringValue = bigInt1.toString();

        // Printing results
        System.out.println("bigInt1: " + bigInt1);
        System.out.println("bigInt2: " + bigInt2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Power: " + power);
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Comparison Result: " + comparisonResult);
        System.out.println("Absolute Value: " + absValue);
        System.out.println("Negate Value: " + negateValue);
        System.out.println("intValue: " + intValue);
        System.out.println("longValue: " + longValue);
        System.out.println("stringValue: " + stringValue);
    }
}
