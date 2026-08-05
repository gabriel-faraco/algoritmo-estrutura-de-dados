package classes;

public class Professor extends Pessoa{
    public Professor() {
    }

    public Professor(String nome, String email) {
        super(nome, email);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void logar() {
        System.out.println("Professor logado.");;
    }
}
