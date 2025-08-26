package main;
import entities.*; // importando todas as classes do pacote entities

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Inicio do sistema e cadastro do usuário
            Scanner input = new Scanner(System.in);
            System.out.println("Seja bem-vindo ao sistema de cadastro de usuários!");
            System.out.print("Digite seu nome: ");
            String nome = input.nextLine();
            while (nome.trim().isEmpty()) // verifica se o nome está vazio
            {
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
            Usuario usuario = new Usuario(nome, email, password,nomePlaylist);
            System.out.println("Cadastro realizado com sucesso!");
            System.out.println("-------------------------");
            System.out.println("Bem-vindo, " + usuario.getNome() + "!");
            System.out.println("-------------------------");
            //  LOOP DO MENU COM WHILE
            int opcao = 0;

            while (opcao != 7) {
                System.out.println("\nMenu do Spotify:");
                System.out.println("1. Listar musicas disponíveis");
                System.out.println("2. Adicionar música à sua Playlist");
                System.out.println("3. Remover música da sua Playlist");
                System.out.println("4. Ver minha Playlist");
                System.out.println("5. Tempo total da minha Playlist");
                System.out.println("6. Ver meus dados");
                System.out.println("7. Sair");
                System.out.print("Escolha uma opção: ");

                opcao = input.nextInt();
                input.nextLine(); // limpar o buffer

                while (opcao < 1 || opcao > 7) { // validação da opção
                    System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 4:");
                    opcao = input.nextInt();
                    input.nextLine();
                }
                switch (opcao) {
                    case 1:  // Listar Todas as músicas
                        ListarTodasAsMusicas.listar();
                        break;

                    case 2: // Adicionar Musicas
                        AdicionarMusicas.adicionar(playlist, new Catalogo()); // chama o método para adicionar músicas à playlist
                        break;

                    case 3: // Remover Musicas
                        RemoverMusica.remover(playlist); // chama o método para remover músicas da playlist
                        break;

                    case 4: // Ver Minha Nome da playlist
                        VerMinhaPlaylist.verMinhaPlaylist(playlist); // chama o método para ver a playlist
                        break;

                    case 5: // Tempo Total da Nome Da Playlist
                        TempoTotalDaPlaylist.tempoTotalDaPlaylist(playlist); // chama o método para ver o tempo total da playlist
                        break;

                    case 6: // Exibir Dados do Usuário
                        ExibirDados.mostrar(usuario, playlist);  // chama o método para exibir os dados do usuário
                        break;

                    case 7: // Saindo do sistema
                        SaindoDoSistema.saindo();
                        break;

                    default: // caso a opção seja inválida
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            }
        } catch (Exception e) { // captura qualquer erro inesperado

            System.out.println("Ocorreu um erro: " + e.getMessage());

        } finally { // bloco que sempre será executado
            System.out.println("Até logo !"); // mudar frase possivelmente
        }
    }
}