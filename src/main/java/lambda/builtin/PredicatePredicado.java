package lambda.builtin;

import java.util.function.Predicate;

public class PredicatePredicado {

    public static void main(String[] args) {
        //Recebe um Tipo como parametro e retorna um boolean
        Predicate<Integer> isPar = num -> num % 2 == 0;
        System.out.println(isPar.test(3));

        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
        System.out.println(isTresDigitos.test(500));

        System.out.println(isPar.and(isTresDigitos).test(100));
    }
}
