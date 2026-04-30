public class Musica {
    String titulo = "Abraço Infinito";
    String artista = "D.O.C";
    int anoDeLancamento = 2020;
    double avaliacao;
    int numAvaliacoes;

    String exibeFichaTecnica() {
        return "Nome: " + titulo +
                "\nArtista: " + artista +
                "\nAno de Lançamento: " + anoDeLancamento +
                "\nAvaliação: " + avaliacao +
                "\nNúmero de Avaliaçõees: " + numAvaliacoes;
    }

    void AvaliaMusica(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double CalculaMediaAvaliacoes() {
        double media = avaliacao/numAvaliacoes;
        return media;
    }
}
