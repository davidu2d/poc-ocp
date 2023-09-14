package lambda.custom;

@FunctionalInterface
public interface Calculo {
    //@FunctionalInterface obriga ter apenas um metodo abstrato
    double executar(double num1, double num2);
}
