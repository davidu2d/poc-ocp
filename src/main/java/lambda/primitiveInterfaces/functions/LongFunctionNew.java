package lambda.primitiveInterfaces.functions;

import java.util.function.LongFunction;

public class LongFunctionNew {
    public static void main(String[] args) {
        //recebe um long como parametro e retorna um Tipo
        LongFunction<String> numero = num -> "o numero é: "+num;
        System.out.println(numero.apply(10L));
    }
}
