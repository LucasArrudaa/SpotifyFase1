package main;
import entities.Genero;
import entities.Midias;
import entities.Playlist;
import exceptions.PlaylistVazia;

public class VerMinhaPlaylist {
    static Genero genero;
    static Playlist playlist;
    public static void verMinhaPlaylist(Playlist getPlaylist) {
        try{
            Playlist playlist = getPlaylist;
            System.out.println("Sua Playlist '" + playlist.getnomePlaylist() + "' contém as seguintes músicas:");

            if (playlist.getMusicas().isEmpty()) {
                throw new PlaylistVazia("Sua playlist está vazia !!!");
            } else {
                for (Midias musica : playlist.getMusicas()) {
                    System.out.println(" - " + musica.getNomeMusica() + " (" + musica.getAutor() + ")");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
