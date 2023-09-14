package lambda.primitiveInterfaces.binary;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionNew {
    public static void main(String[] args) {
        //recebe dois parametros de um Tipo e retorna um long
        ToLongBiFunction<Double, Double> soma = (n1, n2) -> n1.longValue() + n2.longValue();
        System.out.println(soma.applyAsLong(5.0, 5.0));
    }
}
