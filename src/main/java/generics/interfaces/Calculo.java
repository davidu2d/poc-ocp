package generics.interfaces;

@FunctionalInterface
public interface Calculo<T extends Number> {
    T executar(T n1, T n2);
}
