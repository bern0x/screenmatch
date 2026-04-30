public class TesteMusica {
    public static void main(String[] args) {
        Musica AbracoInfinito = new Musica();
        System.out.println(AbracoInfinito.exibeFichaTecnica());

        AbracoInfinito.AvaliaMusica(10);
        AbracoInfinito.AvaliaMusica(8);
        AbracoInfinito.AvaliaMusica(3);
        AbracoInfinito.AvaliaMusica(5);
        AbracoInfinito.AvaliaMusica(1);
        AbracoInfinito.AvaliaMusica(100);

        System.out.println(AbracoInfinito.CalculaMediaAvaliacoes());

    }
}
