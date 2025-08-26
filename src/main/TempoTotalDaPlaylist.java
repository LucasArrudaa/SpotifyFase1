package main;
import  entities.*; // importando todas as classes do pacote entities


class TempoTotalDaPlaylist {
    public static void tempoTotalDaPlaylist(NomeDaPlaylist nomeDaPlaylist) {
        try {
            float total = 0;
            for (Midias musica : nomeDaPlaylist.getMusicas()) {
                total += musica.getTempoMusica();
            }
            System.out.printf("Tempo total da nomeDaPlaylist '%s': %.2f minutos%n", nomeDaPlaylist.getnomePlaylist(), total);
        }catch (Exception e) {
            System.out.println("Ocorreu um erro ao calcular o tempo total da nomeDaPlaylist: " + e.getMessage());
        }
    }
}