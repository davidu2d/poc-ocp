package encapsulamento;

public class Aluno extends Pessoa{

    public static void main(String[] args) {
        Aluno a = new Aluno();
        System.out.println(a.idade);
        Pessoa p = new Aluno();
        p.imprime();
        //p.imprimeAluno(); so acessa os metodos dentro de pessoa

    }

    public void imprimeAluno() {
        System.out.println("Aluno");
    }
}
