package lambda.custom;

public class Test {
    public static void main(String[] args) {
        Calculo calc = (n1, n2) -> n1 + n2;
        System.out.println(calc.executar(10, 5));
    }
}
