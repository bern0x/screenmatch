package br.com.alura.desafioPratico04;

import br.com.alura.desafioPratico04.modelos.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList();

        var pessoa01 = new Pessoa();
        pessoa01.setNome("Bernardo");
        pessoa01.setIdade(20);
        listaDePessoas.add(pessoa01);

        var pessoa02 = new Pessoa();
        pessoa02.setNome("Bernardino");
        pessoa02.setIdade(45);
        listaDePessoas.add(pessoa02);

        var pessoa03 = new Pessoa();
        pessoa03.setNome("Rychard");
        pessoa03.setIdade(22);
        listaDePessoas.add(pessoa03);

        System.out.println("A lista tem " + listaDePessoas.size() + " pessoas");
        System.out.println("A primeira pessoa da lista é " + listaDePessoas.get(0).toString());

        System.out.println();
        System.out.println(listaDePessoas.toString());


    }
}
