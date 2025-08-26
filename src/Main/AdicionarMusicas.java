package main;
import entities.*;
import java.util.Scanner;

class AdicionarMusicas {
    public static void adicionar(NomeDaPlaylist nomeDaPlaylist, Catalogo catalogo) {
        try {
            System.out.println("Adicionando músicas à nomeDaPlaylist: " + nomeDaPlaylist.getnomePlaylist());
            if (nomeDaPlaylist.getnomePlaylist() == null || nomeDaPlaylist.getnomePlaylist().trim().isEmpty()) {
                System.out.println("Você não criou uma nomeDaPlaylist ainda. Por favor, crie uma nomeDaPlaylist antes de adicionar músicas.");
                return;
            }
            System.out.println("Escolha um gênero para adicionar músicas:");
            System.out.println("1 - Rock");
            System.out.println("2 - Pop");
            System.out.println("3 - MPB");
            System.out.println("4 - Jazz");
            System.out.println("5 - Clássica");
            System.out.println("6 - HipHop");
            System.out.println("7 - Eletrônica");
            System.out.println("8 - Sertanejo");
            System.out.println("9 - Forró");
            Scanner input = new Scanner(System.in);
            int escolha = Integer.parseInt(input.nextLine());

            switch (escolha) {
                case 1 -> catalogo.getRock().exibirPlaylist();
                case 2 -> catalogo.getPop().exibirPlaylist();
                case 3 -> catalogo.getMpb().exibirPlaylist();
                case 4 -> catalogo.getJazz().exibirPlaylist();
                case 5 -> catalogo.getClassica().exibirPlaylist();
                case 6 -> catalogo.getHipHop().exibirPlaylist();
                case 7 -> catalogo.getEletronica().exibirPlaylist();
                case 8 -> catalogo.getSertanejo().exibirPlaylist();
                case 9 -> catalogo.getForro().exibirPlaylist();
                default -> System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 9.");


            }
            System.out.println("Digite a posição da música que deseja adicionar à sua nomeDaPlaylist:");
            int posicao = Integer.parseInt(input.nextLine()) - 1; // Ajuste para índice baseado em zero
            Midias musicaEscolhida = null;
            switch (escolha) {
                case 1 -> musicaEscolhida = catalogo.getRock().getMusicas().get(posicao);
                case 2 -> musicaEscolhida = catalogo.getPop().getMusicas().get(posicao);
                case 3 -> musicaEscolhida = catalogo.getMpb().getMusicas().get(posicao);
                case 4 -> musicaEscolhida = catalogo.getJazz().getMusicas().get(posicao);
                case 5 -> musicaEscolhida = catalogo.getClassica().getMusicas().get(posicao);
                case 6 -> musicaEscolhida = catalogo.getHipHop().getMusicas().get(posicao);
                case 7 -> musicaEscolhida = catalogo.getEletronica().getMusicas().get(posicao);
                case 8 -> musicaEscolhida = catalogo.getSertanejo().getMusicas().get(posicao);
                case 9 -> musicaEscolhida = catalogo.getForro().getMusicas().get(posicao);
            }
            if (musicaEscolhida != null) {
                nomeDaPlaylist.adicionarMusica(musicaEscolhida);
                System.out.println("Música '" + musicaEscolhida.getNomeMusica() + "' adicionada à nomeDaPlaylist '" + nomeDaPlaylist.getnomePlaylist() + "'.");
            } else {
                System.out.println("Posição inválida. Nenhuma música foi adicionada.");
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao adicionar músicas: " + e.getMessage());
        }
    }
}