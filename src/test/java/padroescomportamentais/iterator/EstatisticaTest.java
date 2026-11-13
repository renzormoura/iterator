package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstatisticaTest {

    Playlist criarPlaylist() {
        return new Playlist(
                new Musica("Música A", 180, true),
                new Musica("Música B", 240, false),
                new Musica("Música C", 200, true),
                new Musica("Música D", 100, false)
        );
    }

    @Test
    void deveContarFavoritas() {
        assertEquals(2, Estatistica.contarFavoritas(criarPlaylist()));
    }

    @Test
    void deveContarTotalMusicas() {
        assertEquals(4, Estatistica.contarTotalMusicas(criarPlaylist()));
    }

    @Test
    void deveCalcularDuracaoTotal() {
        assertEquals(720, Estatistica.calcularDuracaoTotal(criarPlaylist()));
    }
}
