package main;
import  entities.*; // importando todas as classes do pacote entities
import exceptions.PlaylistVazia;

import java.util.Scanner;

class RemoverMusica {
    public static void remover(Playlist playlist) {
        try {
            if (playlist.getnomePlaylist() == null || playlist.getnomePlaylist().trim().isEmpty()) {
                System.out.println("Você não criou uma playlist ainda. Por favor, crie uma playlist antes de remover músicas.");
            }
            if (playlist.getMusicas().isEmpty()) {
                System.out.println("Sua playlist está vazia. Não há músicas para remover.");
            }
            if ((playlist.getnomePlaylist() != null && !playlist.getnomePlaylist().trim().isEmpty()) && !playlist.getMusicas().isEmpty())
                playlist.exibirPlaylist();
            System.out.println("Digite a posição da música que deseja remover da sua playlist:");
            Scanner input = new Scanner(System.in);
            int posicao = Integer.parseInt(input.nextLine()) - 1; // Ajuste para índice baseado em zero
            if (posicao < 0 || posicao >= playlist.getMusicas().size()) {
                throw new PlaylistVazia("Sua opção está inválida  !!!");
            }
            Midias musicaRemovida = playlist.getMusicas().get(posicao);
            playlist.removerMusica(posicao);
            System.out.println("Música '" + musicaRemovida.getNomeMusica() + "' removida da playlist '" + playlist.getnomePlaylist() + "'.");


        } catch (Exception e) {
            System.out.println( e.getMessage());
        }

    }
}