import classes.Livraria;
import classes.Livro;

void main() {

    Livro livro1 = new Livro("Lobotomia facil rapido sem virus 2026", "Dexter", 326, true);
    Livro livro2 = new Livro("Clóvis de Barros em: Dançando com a vovó", "Maurício de Souza", 22, true);
    Livro livro3 = new Livro("Bla bla bla do Carlão", "Carlão", 6, true);



    List<Livro> livro = new ArrayList<>();

    Livraria livraria = new Livraria(livro);

    livraria.inserirLivro(livro1);
    livraria.inserirLivro(livro2);
    livraria.inserirLivro(livro3);

    livraria.listarLivros();
    livraria.listarDisponiveis();

    livro1.reservar();

    livraria.listarLivros();
    livraria.listarDisponiveis();

    livro2.reservar();

    livraria.listarLivros();
    livraria.listarDisponiveis();

    livro1.devolver();
    livro2.devolver();

    livraria.listarLivros();
    livraria.listarDisponiveis();

}
