package lambda.primitiveInterfaces.functions;

import java.util.function.DoubleFunction;

public class DoubleFunctionNew {
    public static void main(String[] args) {
        //recebe um double como parametro e retorna um Tipo
        DoubleFunction<String> numero = num -> "O numero é: "+num;
        System.out.println(numero.apply(10));
    }
}
