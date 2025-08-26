package main;
import entities.*;

class ExibirDados {
    public static void mostrar(Usuario usuario, NomeDaPlaylist nomeDaPlaylist) {
        try {
            System.out.println("Dados Pessoais :");
            System.out.println("Nome do usuario : " + usuario.getNome());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Sua Senha: " + usuario.getPassword());
            System.out.println("-------------------------");
            if (nomeDaPlaylist.getnomePlaylist() == null || nomeDaPlaylist.getnomePlaylist().trim().isEmpty()) {
                System.out.println("Você não criou uma nomeDaPlaylist ainda.");
            } else {
                System.out.println("Nome da nomeDaPlaylist: " + nomeDaPlaylist.getnomePlaylist());
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao adicionar músicas: " + e.getMessage());
        }
    }
}