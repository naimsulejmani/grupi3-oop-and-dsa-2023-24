package oop.intro_class_object.summary;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal(
                "612834281746982469832649826498721649214.4174318642874324669239");
        System.out.println(decimal);
        System.out.println(
                decimal.pow(3)
                        .add(BigDecimal.valueOf(112313212313L)
                                .divide(new BigDecimal("123132131313.132132132131"),
                                        RoundingMode.CEILING)));


        BigInteger integer = new BigInteger("12313131873981768964386438217498219212");
        System.out.println(integer.pow(5));
    }
}
