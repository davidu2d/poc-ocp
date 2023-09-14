package lambda.builtin;

import java.util.function.Supplier;

public class SupplierFornecedor {

    public static void main(String[] args) {
        //Não recebe parametro e Retorna um Tipo
        Supplier<String> textoQualquer = () -> "Texto qualquer";
        System.out.println(textoQualquer.get());
    }
}
