package main;
import entities.*;

class ExibirDados {
    public static void mostrar(Usuario usuario, Playlist playlist) {
        try {
            System.out.println("Dados Pessoais :");
            System.out.println("Nome do usuario : " + usuario.getNome());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Sua Senha: " + usuario.getPassword());
            System.out.println("Sua Playlist : " + playlist.getnomePlaylist());
        } catch (Exception e) {
            System.out.println("ERRO " + e.getMessage());
        }
    }
}