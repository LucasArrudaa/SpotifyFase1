package entities;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nomePlaylist;
    private List<Midias> musicas;

    public Playlist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
        this.musicas = new ArrayList<>();
    }

    public String getnomePlaylist() {
        return nomePlaylist;
    }

    public List<Midias> getMusicas() {
        return musicas;
    }

    public void adicionarMusica(Midias midias) {
        musicas.add(midias);

    }
    public void removerMusica(int index) {
        if (index >= 0 && index < musicas.size()) {
            musicas.remove(index);
        } else {
            System.out.println("Índice inválido. Nenhuma música foi removida.");
        }
    }

    public void exibirPlaylist() {
        System.out.println(" Playlist de " + nomePlaylist + ":");
        int i = 1; // contador para numerar
        for (Midias musica : musicas) {
            System.out.println(i + ". " + musica.getNomeMusica() + " (" + musica.getAutor() + ")");
            i++;
        }
    }
}