package classes;

public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean disponibilidade = true;

    public Livro(String titulo, String autor, int numeroPaginas, boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponibilidade = disponibilidade;
    }

    public Livro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", disponibilidade=" + disponibilidade +
                '}';
    }

    public void exibirDetalhes(){
        System.out.println(toString());
    }

    public void reservar(){
        if (disponibilidade){
            System.out.println("Livro reservado com sucesso! =)");
            disponibilidade = false;
        } else {
            System.out.println("Este livro já foi reservado! =(");
        }
    }

    public void devolver(){
        disponibilidade = true;
        System.out.println("Livro devolvido com sucesso! =)");
    }

}
