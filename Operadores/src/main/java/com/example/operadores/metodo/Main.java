package com.example.operadores.metodo;

import com.example.operadores.metodo.Calculadora;
import com.example.operadores.metodo.Emprestimo;
import com.example.operadores.metodo.Mensagem;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercícios calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercícios mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercícios Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
