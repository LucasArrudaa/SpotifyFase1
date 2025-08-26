package main;
import entities.*; // importando todas as classes do pacote entities
import exceptions.OpcaoInvalida;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Inicio do sistema e cadastro do usuário
            System.out.println("Seja bem-vindo ao sistema de cadastro de usuários!");
            System.out.print("Digite seu nome: ");
            String nome = input.nextLine();
            while (nome.trim().isEmpty()) {
                System.out.println("Nome inválido. Por favor, insira um nome válido:");
                nome = input.nextLine();
            }

            // cadastro do email
            System.out.println("Olá, " + nome + "! Vamos prosseguir com o cadastro.");
            System.out.println("Me informe seu email:");
            String email = input.nextLine();
            while (!email.contains("@") || !email.contains(".")) {
                System.out.println("Email inválido. Por favor, insira um email válido:");
                email = input.nextLine();
            }

            // cadastro da senha
            System.out.println("Agora, por favor, crie uma senha:");
            String password = input.nextLine();
            while (password.length() < 6) {
                System.out.println("Senha muito curta. A senha deve ter pelo menos 6 caracteres. Tente novamente:");
                password = input.nextLine();
            }

            // criação da playlist
            System.out.println("Vamos criar sua Playlist.");
            System.out.print("Digite o nome da sua Playlist: ");
            String nomePlaylist = input.nextLine();
            Playlist playlist = new Playlist(nomePlaylist);
            while (playlist.getnomePlaylist().trim().isEmpty()) {
                System.out.println("Nome da playlist inválido. Por favor, insira um nome válido:");
                nomePlaylist = input.nextLine();
                playlist = new Playlist(nomePlaylist);
            }

            System.out.println("'" + playlist.getnomePlaylist() + "' criada com sucesso!");

            // feito o cadastro e criado o objeto usuario
            Usuario usuario = new Usuario(nome, email, password, nomePlaylist);
            System.out.println("Cadastro realizado com sucesso!");
            System.out.println("-------------------------");
            System.out.println("Bem-vindo, " + usuario.getNome() + "!");
            System.out.println("-------------------------");

            // LOOP DO MENU
            int opcao = 0;
            while (opcao != 7) {
                System.out.println("\nMenu do Spotify:");
                System.out.println("1. Listar músicas disponíveis");
                System.out.println("2. Adicionar música à sua Playlist");
                System.out.println("3. Remover música da sua Playlist");
                System.out.println("4. Ver minha Playlist");
                System.out.println("5. Tempo total da minha Playlist");
                System.out.println("6. Ver meus dados");
                System.out.println("7. Sair");
                System.out.print("Escolha uma opção: ");

                try {
                    opcao = input.nextInt();
                    input.nextLine(); // limpar buffer

                    if (opcao < 1 || opcao > 7) {
                        throw new OpcaoInvalida("Opção inválida! Escolha um número entre 1 e 7.");
                    }

                    switch (opcao) {
                        case 1:
                            ListarTodasAsMusicas.listar();
                            break;
                        case 2:
                            AdicionarMusicas.adicionar(playlist, new Catalogo());
                            break;
                        case 3:
                            RemoverMusica.remover(playlist);
                            break;
                        case 4:
                            VerMinhaPlaylist.verMinhaPlaylist(playlist);
                            break;
                        case 5:
                            TempoTotalDaPlaylist.tempoTotalDaPlaylist(playlist);
                            break;
                        case 6:
                            ExibirDados.mostrar(usuario, playlist);
                            break;
                        case 7:
                            SaindoDoSistema.saindo();
                            break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Digite apenas números.");
                    input.nextLine(); // limpar buffer
                } catch (OpcaoInvalida e) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
