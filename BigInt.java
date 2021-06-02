import java.math.BigInteger;

class BigInt {
    public static void main(String[] args) {
        //with using biginteger
        BigInteger a = new BigInteger("985926");
        BigInteger b = new BigInteger("5948482");
        //BigInteger c = b.subtract(a);
        BigInteger c = b.add(a);
        System.out.println(c);
    }    
}
