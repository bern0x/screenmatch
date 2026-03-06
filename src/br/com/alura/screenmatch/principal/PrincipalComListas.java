package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoBernardo = new Filme("Vingadores", 2017);
        filmeDoBernardo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoBernardo;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoBernardo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() >2) {
                System.out.println("Classiticação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Bernardo");
        buscaPorArtista.add("Pedro");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por ano");
        System.out.println(lista);
    }
}
