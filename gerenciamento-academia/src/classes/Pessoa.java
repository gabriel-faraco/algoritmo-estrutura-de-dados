package classes;

public class Pessoa {
    String nome;
    String email;

    public void logar(){
        System.out.println("Usuário logado.");
    }

    public void apresentar(String apelido){
        System.out.println("Olá, meu nome é " + this.nome + ", mas pode me chamar de " + apelido + "!");
    }

    public Pessoa(){}

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
