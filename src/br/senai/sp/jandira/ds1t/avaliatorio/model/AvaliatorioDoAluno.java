package br.senai.sp.jandira.ds1t.avaliatorio.model;

import java.awt.*;
import java.util.Scanner;

public class AvaliatorioDoAluno {

    String nome;
    String situacao;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vamos iniciar");
        System.out.println("----------------------------------------");

        System.out.println("Por favor, digite o seu nome: ");
        nome = leitor.nextLine();

        System.out.println("Ótimo, digite a sua primeira nota: ");
        nota1 = leitor.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        nota2 = leitor.nextDouble();

        System.out.println("Ok, digite sua terceira nota: ");
        nota3 = leitor.nextDouble();

        System.out.println("Perfeito, digite sua quarta nota: ");
        nota4 = leitor.nextDouble();

        calcularDados();
    }
    public void calcularDados(){
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 5){
            situacao = "Aprovado";
        }else {
            situacao = "Reprovado";
        }
        exibirResultados();

    }
    public void exibirResultados(){
        String mediaDecimal = String.format("%.2f", media);

        System.out.println("----------------------------------------");
        System.out.println("Nome do(a) aluno(a): " + nome);
        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Terceira nota: " + nota3);
        System.out.println("Quarta nota: " + nota4);
        System.out.println("Média do aluno(a): " + mediaDecimal);
        System.out.println("----------------------------------------");
        System.out.println("O(a) aluno(a) " + nome + " está " + situacao + "(a)");

    }
}
