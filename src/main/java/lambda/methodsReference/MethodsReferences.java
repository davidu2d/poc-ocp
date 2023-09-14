package lambda.methodsReference;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MethodsReferences {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        //STATIC
        //lambda
        list.stream().map(n -> multiplicaPorDois(n));
        //method reference
        list.stream().map(MethodsReferences::multiplicaPorDois);

        //CONCTRUCTOR
        //lambda
        list.stream().map(n -> new BigDecimal(n));
        //method reference
        list.stream().map(BigDecimal::new);

        //MULTIPLE INSTANCES
        //lambda
        list.stream().map(n -> n.doubleValue());
        //method reference
        list.stream().map(Integer::doubleValue);

        //UNIQUE INSTANCES
        BigDecimal dois = new BigDecimal(2);
        //lambda
        list.stream().map(BigDecimal::new).map(n -> dois.multiply(n));
        //method reference
        list.stream().map(BigDecimal::new).map(dois::multiply);
    }

    private static Integer multiplicaPorDois(int numero) {
        return numero * 2;
    }
}
