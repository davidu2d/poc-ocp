package lambda.primitiveInterfaces.functions;

import java.util.function.IntFunction;

public class IntFunctionNew {
    public static void main(String[] args) {
        //recebe um parametro do tipo int e retorna um Tipo
        IntFunction<String> numero = num -> "o numero é: "+num;
        System.out.println(numero.apply(10));
    }
}
