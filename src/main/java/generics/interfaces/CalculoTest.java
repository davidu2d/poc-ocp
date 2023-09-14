package generics.interfaces;

public class CalculoTest {
    public static void main(String[] args) {
        Calculo<Integer> soma = (n1, n2) -> n1 + n2;
        System.out.println(soma.executar(5, 5));

        Calculo<Double> somaDouble = (n1, n2) -> n1 + n2;
        System.out.println(somaDouble.executar(5.0, 5.0));
    }
}
