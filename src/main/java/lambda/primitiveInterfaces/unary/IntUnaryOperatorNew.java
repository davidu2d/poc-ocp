package lambda.primitiveInterfaces.unary;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorNew {
    public static void main(String[] args) {
        //Recebe um int como parametro e retorna um int
        IntUnaryOperator vezesDois = num -> num * 2;
        System.out.println(vezesDois.applyAsInt(5));
    }
}
