package lambda.primitiveInterfaces.binary;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorNew {
    public static void main(String[] args) {
        //Recebe dois parametros double e retorna double
        DoubleBinaryOperator soma = (num1, num2) -> num1 + num2;
        System.out.println(soma.applyAsDouble(10, 10));
    }
}
