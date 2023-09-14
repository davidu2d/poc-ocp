package lambda.binaryInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerNew {
    public static void main(String[] args) {
        //Recebe dois parametros e não retorna nada
        BiConsumer<String, Integer> imprimiNomeIdade = (nome, idade) -> System.out.println("Nome: "+nome+ ", Idade: "+idade+ " anos");
        imprimiNomeIdade.accept("David", 36);
    }
}
