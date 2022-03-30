package br.com.introducao.java.avaliacaoAluno;

import java.util.Scanner;

public class ControladorDadosAlunos {

    public float gerarMediaAluno(float nota1, float nota2){
        return (nota1+nota2)/2;

    }
    public Aluno cadastrarAluno(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o nome do Curso: ");
        String nomeCurso = scanner.nextLine();
        System.out.println("Digite o periodo que você cursa: ");
        int numeroPeriodo = scanner.nextInt();
        System.out.println("Digite o valor da primeira nota: ");
        float nota1 = scanner.nextFloat();
        System.out.println("Digite o valor da segunda nota: ");
        float nota2 = scanner.nextFloat();
        System.out.println("Digite a quantidade de faltas: ");
        int qntdFaltas = scanner.nextInt();


        //opçao 1
        Aluno aluno = new Aluno(nome,nomeCurso,numeroPeriodo,nota1,nota2,qntdFaltas);
        return aluno;

//       opcao 2
//        return new Aluno(nome,nomeCurso,numeroPeriodo,nota1,nota2,qntdFaltas);

    }
}
