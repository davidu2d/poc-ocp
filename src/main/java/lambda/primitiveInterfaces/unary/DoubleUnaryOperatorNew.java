package lambda.primitiveInterfaces.unary;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorNew {
    public static void main(String[] args) {
        //Recebe um double como parametro e retorna um double
        DoubleUnaryOperator vezesDois = num -> num * 2;
        System.out.println(vezesDois.applyAsDouble(4));
    }
}
