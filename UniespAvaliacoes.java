package br.com.introducao.java.avaliacaoAluno;


import java.util.Scanner;

public class UniespAvaliacoes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a opcao desejada: ");
        System.out.println("1 - Para cadastrar Aluno: ");
        System.out.println("2 - Para gerar Média de Aluno");
        System.out.println("3 - Buscar quantidade de faltas");
        System.out.println("0 - Sair");
        int opcao = scanner.nextInt();

        ControladorDadosAlunos controladorDadosAlunos = new ControladorDadosAlunos();
        Aluno aluno = controladorDadosAlunos.cadastrarAluno();
        float media = controladorDadosAlunos.gerarMediaAluno(aluno.getNota1(),aluno.getNota2());

        aluno.setMedia(media);

        System.out.println("Sua média é: "+aluno.getMedia());
    }
}
