package lambda.primitiveInterfaces.binary;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorNew {
    public static void main(String[] args) {
        //recebe dois parametros int e retorna int
        IntBinaryOperator soma = (n1, n2) -> n1 + n2;
        System.out.println(soma.applyAsInt(10, 10));
    }
}
