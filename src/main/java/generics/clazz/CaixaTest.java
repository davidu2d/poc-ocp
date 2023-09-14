package generics.clazz;

public class CaixaTest {
    public static void main(String[] args) {
        Caixa<String> caixa = new Caixa();
        caixa.colocar("Sapato");
        System.out.println(caixa.pegar());

        Caixa<Integer> numero = new Caixa();
        numero.colocar(100);
        System.out.println(numero.pegar());

        CaixaNumber<Double> num = new CaixaNumber<>();
        num.colocar(150.0);
        System.out.println(num.pegar());

        CaixaInt numInt = new CaixaInt();
        numInt.colocar(200);
        System.out.println(numInt.pegar());
    }
}
