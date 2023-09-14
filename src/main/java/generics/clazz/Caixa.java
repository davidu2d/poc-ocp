package generics.clazz;

public class Caixa<T> {

    private T coisa;

    public T pegar() {
        return this.coisa;
    }

    public void colocar(T coisa){
        this.coisa = coisa;
    }
}
