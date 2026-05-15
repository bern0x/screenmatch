package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.service.ConsultaOmdb;
import br.com.alura.screenmatch.service.ConversorDeTitulo;
import br.com.alura.screenmatch.util.EscritorDeArquivos;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBuscas {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner in = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        while (!busca.equalsIgnoreCase("Sair")) {

            System.out.print("Digite um filme para busca: ");
            busca = in.nextLine();

            if (busca.equalsIgnoreCase("Sair")){
                break;
            }

            try {
                ConsultaOmdb consulta = new ConsultaOmdb();
                String json = consulta.buscaTitulo(busca);

                ConversorDeTitulo conversor = new ConversorDeTitulo();
                Titulo meuTitulo = conversor.converte(json);
                System.out.println(meuTitulo);
                titulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço na busca");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            } finally {
                //  System.out.println("O programa finalizou corretamente!");
            }
        }
        System.out.println(titulos);

        EscritorDeArquivos escritor = new EscritorDeArquivos();
        escritor.geradorDeArquivos(titulos);
        System.out.println("O programa finalizou corretamente!");

    }


}
