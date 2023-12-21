package br.ufpb.dcx.ayla.quiz;

import javax.swing.JOptionPane;

public class ProgramaSistemaQuiz {

    public static void main (String[] args) {
        SistemaQuiz sistema = new SistemaQuizAyla();

        String opcao = JOptionPane.showInputDialog("Digite uma opção:\n1. Cadastrar\n2. Listar perguntas\n3. Sortear perguntas\n4. Sair")
        while (!opcao.equals("4")){
            if (opcao.startsWith("1")){
                //TODO: FAZER OUTROS TIPOS DE PERGUNTAS
                PerguntaME pergunta = new PerguntaME();
                pergunta.setEnunciado(JOptionPane.showInputDialog("Digite o enunciado"));
                int quantAlternativas = 4;
                String [] alternativas = new String[quantAlternativas];
                for (int k=0; k< quantAlternativas; k++) {
                    alternativas[k] = JOptionPane.showInputDialog("Digite a alternativa "+(k+1));
                }
                pergunta.setAlternativas(alternativas);
                pergunta.setRespostaCorreta();
            }
        }

    }

}
