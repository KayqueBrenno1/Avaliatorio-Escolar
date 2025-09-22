package br.senai.sp.jandira.ds1t.avaliatorio;

import br.senai.sp.jandira.ds1t.avaliatorio.model.AvaliatorioDoAluno;

public class AvaliatorioApp {
    public static void main(String[] args) {

        System.out.println("Iniciando o aplicativo...");

        AvaliatorioDoAluno situcaofinal = new AvaliatorioDoAluno();

        situcaofinal.obterDados();

    }
}
