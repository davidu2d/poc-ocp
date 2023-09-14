package encapsulamento;

public class Pessoa {
    public String nome;
    private String sobrenome;
    protected int idade = 36;

    public void imprime(){
        System.out.println("Pessoa");
    }
}
