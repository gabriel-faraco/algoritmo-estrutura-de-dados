import classes.Aluno;
import classes.Professor;
import classes.Turma;


void main() {

    Professor p1 = new Professor("Jabuti Gordo", "jabuti.gordo123@hotmail.com");

    Aluno a1 = new Aluno("Xaulin Matador de Porco", "xaulinmatador.de.porco69@gmail.com");
    Aluno a2 = new Aluno("Flavin do Pneu", "flavindopneuuu@gmail.com");

    List<Aluno> alunos = new ArrayList<>();

    Turma t1 = new Turma(0, "Turma 1-A", p1, alunos);

    t1.inserirAluno(a1);
    t1.inserirAluno(a2);

    p1.logar();
    a1.logar();
    a2.logar();

    t1.listarAlunos();

    a1.apresentar("Jorge");

}