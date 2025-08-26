package main;
import  entities.*; // importando todas as classes do pacote entities
import java.util.Scanner;

class RemoverMusica {
    public static void remover(NomeDaPlaylist nomeDaPlaylist) {
        try {
            System.out.println("Removendo músicas da nomeDaPlaylist: " + nomeDaPlaylist.getnomePlaylist());
            if (nomeDaPlaylist.getnomePlaylist() == null || nomeDaPlaylist.getnomePlaylist().trim().isEmpty()) {
                System.out.println("Você não criou uma nomeDaPlaylist ainda. Por favor, crie uma nomeDaPlaylist antes de remover músicas.");
            }
            if (nomeDaPlaylist.getMusicas().isEmpty()) {
                System.out.println("Sua nomeDaPlaylist está vazia. Não há músicas para remover.");
            }
            if ((nomeDaPlaylist.getnomePlaylist() != null && !nomeDaPlaylist.getnomePlaylist().trim().isEmpty()) && !nomeDaPlaylist.getMusicas().isEmpty())
                nomeDaPlaylist.exibirPlaylist();
            System.out.println("Digite a posição da música que deseja remover da sua nomeDaPlaylist:");
            Scanner input = new Scanner(System.in);
            int posicao = Integer.parseInt(input.nextLine()) - 1; // Ajuste para índice baseado em zero
            if (posicao < 0 || posicao >= nomeDaPlaylist.getMusicas().size()) {
                System.out.println("Posição inválida. Nenhuma música foi removida.");
                return;
            }
            Midias musicaRemovida = nomeDaPlaylist.getMusicas().get(posicao);
            nomeDaPlaylist.removerMusica(posicao);
            System.out.println("Música '" + musicaRemovida.getNomeMusica() + "' removida da nomeDaPlaylist '" + nomeDaPlaylist.getnomePlaylist() + "'.");


        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao adicionar músicas: " + e.getMessage());
        }

    }
}