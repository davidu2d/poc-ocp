package lambda.unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorNew {

    public static void main(String[] args) {
        //Recebe um parametro de um Tipo e retorna o mesmo Tipo
        UnaryOperator<Double> vezesDois = num -> num * 2;
        System.out.println(vezesDois.apply(2.0));
    }
}
