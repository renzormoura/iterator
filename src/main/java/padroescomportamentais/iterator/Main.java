package padroescomportamentais.iterator;

public class Main {

    public static void main(String[] args) {
        Playlist playlist = new Playlist(
                new Musica("Música A", 180, true),
                new Musica("Música B", 240, false),
                new Musica("Música C", 200, true)
        );
        for (Musica musica : playlist) {
            System.out.println("Tocando: " + musica.getTitulo());
        }
        System.out.println("Total: " + Estatistica.contarTotalMusicas(playlist));
        System.out.println("Favoritas: " + Estatistica.contarFavoritas(playlist));
        System.out.println("Duração total (s): " + Estatistica.calcularDuracaoTotal(playlist));
    }
}
