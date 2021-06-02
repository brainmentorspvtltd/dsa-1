import java.math.BigDecimal;

class BigDec {
    public static void main(String[] args) {
        //without using bigdecimal
        // double a = 0.09;
        // double b = 0.05;
        // double c = b - a;
        // System.out.println(c);

        //with using bigdecimal
        BigDecimal a = new BigDecimal("0.09");
        BigDecimal b = new BigDecimal("0.05");
        //BigDecimal c = b.subtract(a);
        BigDecimal c = b.add(a);
        System.out.println(c);
    }    
}
