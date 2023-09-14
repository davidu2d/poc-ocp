package lambda.builtin;

import java.util.function.Consumer;

public class ConsumerConsumidor {

    public static void main(String[] args) {
        //Recebe um Tipo como parametro e não retorna nada
        Consumer<Integer> vezesDois = num -> System.out.println(num * 2);
        vezesDois.accept(2);
    }
}
