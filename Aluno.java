package br.com.introducao.java.avaliacaoAluno;

public class Aluno {
    private String nome;
    private String nomeCurso;
    private int periodo;
    private float nota1;
    private float nota2;
    private int qntdFaltas;
    private float media;

    Aluno(){
    }

    Aluno(String nome, String nomeCurso, int periodo, float nota1, float nota2, int qntdFaltas, float media){
        this.nome = nome;
        this.nomeCurso = nomeCurso;
        this.periodo = periodo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.qntdFaltas = qntdFaltas;
        this.media = media;
    }
    Aluno(String nome, String nomeCurso, int periodo, float nota1, float nota2, int qntdFaltas){
        this.nome = nome;
        this.nomeCurso = nomeCurso;
        this.periodo = periodo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.qntdFaltas = qntdFaltas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public int getQntdFaltas() {
        return qntdFaltas;
    }

    public void setQntdFaltas(int qntdFaltas) {
        this.qntdFaltas = qntdFaltas;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
}
