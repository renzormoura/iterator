package padroescomportamentais.iterator;

import java.util.Iterator;

public class Estatistica {

    public static Integer contarFavoritas(Playlist playlist) {
        int quantidade = 0;
        for (Musica musica : playlist) {
            if (musica.isFavorita()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalMusicas(Playlist playlist) {
        int quantidade = 0;
        for (Iterator<Musica> it = playlist.iterator(); it.hasNext(); ) {
            it.next();
            quantidade++;
        }
        return quantidade;
    }

    public static Integer calcularDuracaoTotal(Playlist playlist) {
        int total = 0;
        for (Musica musica : playlist) {
            total += musica.getDuracaoSegundos();
        }
        return total;
    }
}
