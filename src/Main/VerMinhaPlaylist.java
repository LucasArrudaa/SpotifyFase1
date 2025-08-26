package main;
import entities.Genero;
import entities.Midias;
import entities.NomeDaPlaylist;

public class VerMinhaPlaylist {
    static Genero genero;
    static NomeDaPlaylist nomeDaPlaylist;
    public static void verMinhaPlaylist(NomeDaPlaylist getNomeDaPlaylist) {
        try{
            NomeDaPlaylist nomeDaPlaylist = getNomeDaPlaylist;
            System.out.println("Sua NomeDaPlaylist '" + nomeDaPlaylist.getnomePlaylist() + "' contém as seguintes músicas:");

            if (nomeDaPlaylist.getMusicas().isEmpty()) {
                System.out.println("Sua nomeDaPlaylist está vazia.");
            } else {
                for (Midias musica : nomeDaPlaylist.getMusicas()) {
                    System.out.println(" - " + musica.getNomeMusica() + " (" + musica.getAutor() + ")");
                }
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao exibir a nomeDaPlaylist: " + e.getMessage());
        }
    }
}
