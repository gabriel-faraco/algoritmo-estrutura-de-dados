package classes;

import java.util.List;

public class Livraria{

    List<Livro> livros;

    public Livraria(List<Livro> livros) {
        this.livros = livros;
    }

    public void inserirLivro(Livro livro){
        if (livro == null) {
            throw new IllegalArgumentException("Livro não pode ser nulo");
        }

        if (!livros.contains(livro)) {
            livros.add(livro);
        } else {
            System.out.println("Livro já adicionado");
        }
    }

    public void listarLivros(){
        System.out.println("Listando livros...\n");
        for(Livro livro : livros){
            System.out.println(livro + "\n");
        }
    }

    public void listarDisponiveis(){
        System.out.println("Listando livros disponíveis...\n");
        for(Livro livro : livros){
            if (livro.disponibilidade){
                System.out.println(livro + "\n");
            }
        }
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return "Livraria{" +
                "livros=" + livros +
                '}';
    }
}
