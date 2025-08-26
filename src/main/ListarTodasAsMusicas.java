package main;
import entities.*;
import java.util.Scanner;

class ListarTodasAsMusicas {
    public static void listar() {
        try {
            // PERGUNTAR SE VAI QUERER VER POR GENERO OU VER TODAS AS MUSICAS
            System.out.println("Digite 1 para ver todas as músicas");
            System.out.println("Digite 2 para ver por gênero");
            Scanner input = new Scanner(System.in);
            int escolha = Integer.parseInt(input.nextLine());

            while (escolha != 1 && escolha != 2) {
                System.out.println("Opção inválida. Digite 1 para ver todas as músicas ou 2 para ver por gênero:");
                escolha = Integer.parseInt(input.nextLine());
            }

            Catalogo catalogo = new Catalogo();
            // Exibir todas as músicas ou por gênero
            if (escolha == 1) {
                System.out.println(" Todas as Músicas Disponíveis na Plataforma:\n");

                catalogo.getRock().exibirPlaylist();
                System.out.println("-------------------------");
                catalogo.getPop().exibirPlaylist();
                System.out.println("-------------------------");
                catalogo.getMpb().exibirPlaylist();
                System.out.println("-------------------------");
                catalogo.getJazz().exibirPlaylist();
                System.out.println("-------------------------");
                catalogo.getClassica().exibirPlaylist();
                System.out.println("-------------------------");
                catalogo.getHipHop().exibirPlaylist();
                System.out.println("-------------------------");
                catalogo.getEletronica().exibirPlaylist();
                System.out.println("-------------------------");
                catalogo.getSertanejo().exibirPlaylist();
                System.out.println("-------------------------");
                catalogo.getForro().exibirPlaylist();

            } else { // escolha == 2 por gênero
                System.out.println("Escolha um gênero para visualizar:");
                System.out.println("1 - Rock");
                System.out.println("2 - Pop");
                System.out.println("3 - MPB");
                System.out.println("4 - Jazz");
                System.out.println("5 - Clássica");
                System.out.println("6 - HipHop");
                System.out.println("7 - Eletrônica");
                System.out.println("8 - Sertanejo");
                System.out.println("9 - Forró");

                int generoEscolhido = Integer.parseInt(input.nextLine());

                switch (generoEscolhido) {
                    case 1 -> catalogo.getRock().exibirPlaylist(); //
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
            }
        } catch (Exception InputMismatchException) {
            System.out.println("Ocorreu um erro ao listar  músicas: " );
        }
    }
}