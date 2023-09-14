package lambda.primitiveInterfaces.binary;

import java.util.function.LongBinaryOperator;

public class LongBinaryOperatorNew {
    public static void main(String[] args) {
        //Recebe dois parametros long e retorna long
        LongBinaryOperator soma = (n1, n2) -> n1 + n2;
        System.out.println(soma.applyAsLong(10L, 10L));
    }
}
