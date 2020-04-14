package ru.Otus;
import java.math.RoundingMode;
import com.google.common.math.LongMath;


public class App {
    public static void main(String... args) {
        long divisorExample = 3 ;
        long dividendumExample = 41 ;
        long result = LongMath.divide(dividendumExample, divisorExample, RoundingMode.HALF_UP);
        System.out.println("EasyExamplere" + " = " + result);

    }
}
