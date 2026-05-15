package br.com.alura.screenmatch.service;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class ConsultaOmdb {
    public String buscaTitulo(String busca) throws IOException, InterruptedException {
        var buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8.toString());
        String endereco = "https://www.omdbapi.com/?t=" + buscaCodificada.replace(" ", "+") + "&apikey=f9e77852";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        return json;
    }

}
