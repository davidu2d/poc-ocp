package lambda.binaryInterfaces;

import java.util.function.BiFunction;

public class BiFunctionNew {
    public static void main(String[] args) {
        //Recebe dois parametros e retorna um Tipo
        BiFunction<String, Integer, String> imprimiNomeIdade = (nome, idade) -> "Nome: "+nome+ ", Idade: "+idade+ " anos";
        System.out.println(imprimiNomeIdade.apply("David", 36));
    }
}
