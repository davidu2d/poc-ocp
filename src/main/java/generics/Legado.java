package generics;

import java.util.ArrayList;
import java.util.List;

public class Legado {
    public static void main(String[] args) {
        //o Generics só funciona em tempo de compilação
        //em tempo de execução um arrayList permite qualquer Object
        //por isso em tempo de execução um arrayList é não seguro
        List<Integer> ints = new ArrayList<>();
        ints.add(10);
        List listReturn = Legado.add(ints);
        System.out.println(listReturn.get(0));
    }

    private static List add(List list){
        list.add("Stringzona");
        return list;
    }
}
