package classes;

public class Aluno extends Pessoa{

    public Aluno() {
    }

    public Aluno(String nome, String email) {
        super(nome, email);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void logar() {
        System.out.println("Aluno logado.");;
    }
}
