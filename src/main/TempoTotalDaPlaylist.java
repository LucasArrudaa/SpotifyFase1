package main;
import  entities.*; // importando todas as classes do pacote entities


class TempoTotalDaPlaylist {
    public static void tempoTotalDaPlaylist(Playlist playlist) {
        try {
            float tempoTotal = 0.0F; // variável para acumular o tempo total
            for (Midias musica : playlist.getMusicas()) {
                tempoTotal += musica.getTempoMusica(); // somando o tempo de cada música
            }
            int minutos = (int) tempoTotal;
            int segundos = (int) ((tempoTotal - minutos) * 60);
            System.out.println("Tempo total da playlist '" + playlist.getnomePlaylist() + "' é de :  " + minutos + " minutos e " + segundos + " segundos.");
        } catch (Exception SemMusicaNaPlaylist){
            System.out.println();
        }
    }
}

