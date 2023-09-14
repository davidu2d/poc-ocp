package other;

import encapsulamento.Aluno;
import encapsulamento.Pessoa;

public class Professor extends Aluno {
    public static void main(String[] args) {
        Professor p = new Professor();
        System.out.println(p.nome);
        p.imprimeIdade();
    }

    void imprimeIdade(){
        System.out.println(idade);
    }
}
