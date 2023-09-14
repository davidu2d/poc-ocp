package lambda.binaryInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorNew {
    public static void main(String[] args) {
        //Recebe dois parametros de um Tipo e retorna o mesmo Tipo
        BinaryOperator<Double> soma = (num1, num2) -> num1 + num2;
        System.out.println(soma.apply(2.0, 4.0));
    }
}
