package lambda.primitiveInterfaces.binary;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionNew {
    public static void main(String[] args) {
        //Recebe dois parametros de um Tipo e retorna um double
        ToDoubleBiFunction<Integer, Integer> somaDouble = (n1, n2) -> n1.doubleValue() + n2.doubleValue();
        System.out.println(somaDouble.applyAsDouble(5, 5));
    }
}
