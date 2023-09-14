package lambda.primitiveInterfaces.unary;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorNew {
    public static void main(String[] args) {
        //Recebe um long como parametro e retorna um long
        LongUnaryOperator vezesDois = num -> num * 2;
        System.out.println(vezesDois.applyAsLong(10L));
    }
}
