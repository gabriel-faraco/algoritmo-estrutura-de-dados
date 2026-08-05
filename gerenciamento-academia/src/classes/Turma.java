package classes;

import java.util.List;
import java.util.Scanner;

public class Turma {

    int id;
    String nome;
    Professor professor;
    List<Aluno> alunosMatriculados;

    public Turma(int id, String nome, Professor professor, List<Aluno> alunosMatriculados) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunosMatriculados = alunosMatriculados;
    }

    public Turma() {
    }

    public void inserirAluno(Aluno aluno){
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno não pode ser nulo");
        }

        if (!alunosMatriculados.contains(aluno)) {
            alunosMatriculados.add(aluno);
        } else {
            System.out.println("Aluno já matriculado");
        }
    }

    public void listarAlunos(){
        System.out.println("Lista de Alunos:");

        for(Aluno aluno : alunosMatriculados){
            System.out.println(aluno);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }
}
