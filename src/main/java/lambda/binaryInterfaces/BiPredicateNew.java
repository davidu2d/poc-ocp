package lambda.binaryInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateNew {
    public static void main(String[] args) {
        //recebe dois parametros e retorna um boolean
        BiPredicate<String, String> isAuth = (login, senha) -> login == "david" && senha == "1234";
        System.out.println("User authenticated: "+isAuth.test("david", "1234"));
    }
}
