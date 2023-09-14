package lambda.builtin;

import java.util.function.Function;

public class FunctionFuncoes {

    public static void main(String[] args) {
        //Recebe um Tipo como parametro e retorna outro Tipo
        Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "par" : "impar";
        System.out.println(parOuImpar.apply(5));
    }
}
