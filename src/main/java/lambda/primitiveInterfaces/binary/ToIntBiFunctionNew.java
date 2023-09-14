package lambda.primitiveInterfaces.binary;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionNew {
    public static void main(String[] args) {
        //Recebe dois parametros de um Tipo e retorna um int
        ToIntBiFunction<Double, Double> soma = (n1, n2) -> n1.intValue() + n2.intValue();
        System.out.println(soma.applyAsInt(5.0, 5.0));
    }
}
