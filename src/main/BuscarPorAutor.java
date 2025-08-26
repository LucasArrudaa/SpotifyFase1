package main;
import entities.*;
import java.util.Scanner;

class BuscarPorAutor {
    public static void Buscar() {
        //  juntar todas as playlist em uma só e por ela gerar um for para buscar o autor da musica

        try {
            Catalogo catalogo = new Catalogo();
            System.out.println("Digite o nome do autor que deseja buscar:");
            Scanner input = new Scanner(System.in);
            String autorBuscado = input.nextLine().trim();
            while (autorBuscado.isEmpty()) {
                System.out.println("Nome do autor inválido. Por favor, insira um nome válido:");
                autorBuscado = input.nextLine().trim();
            }
            boolean encontrado = false;
            System.out.println("Músicas do autor '" + autorBuscado + "':");
            for (Midias musica : catalogo.getRock().getMusicas()) {
                if (musica.getAutor().equalsIgnoreCase(autorBuscado)) {
                    System.out.println("- " + musica.getNomeMusica() + " (Rock)");
                    encontrado = true;
                }
            }
            for (Midias musica : catalogo.getPop().getMusicas()) {
                if (musica.getAutor().equalsIgnoreCase(autorBuscado)) {
                    System.out.println("- " + musica.getNomeMusica() + " (Pop)");
                    encontrado = true;
                }
            }
            for (Midias musica : catalogo.getMpb().getMusicas()) {
                if (musica.getAutor().equalsIgnoreCase(autorBuscado)) {
                    System.out.println("- " + musica.getNomeMusica() + " (MPB)");
                    encontrado = true;
                }
            }
            for (Midias musica : catalogo.getJazz().getMusicas()) {
                if (musica.getAutor().equalsIgnoreCase(autorBuscado)) {
                    System.out.println("- " + musica.getNomeMusica() + " (Jazz)");
                    encontrado = true;
                }
            }
            for (Midias musica : catalogo.getClassica().getMusicas()) {
                if (musica.getAutor().equalsIgnoreCase(autorBuscado)) {
                    System.out.println("- " + musica.getNomeMusica() + " (Clássica)");
                    encontrado = true;
                }
            }
            for (Midias musica : catalogo.getHipHop().getMusicas()) {
                if (musica.getAutor().equalsIgnoreCase(autorBuscado)) {
                    System.out.println("- " + musica.getNomeMusica() + " (HipHop)");
                    encontrado = true;
                }
            }
            for (Midias musica : catalogo.getEletronica().getMusicas()) {
                if (musica.getAutor().equalsIgnoreCase(autorBuscado)) {
                    System.out.println("- " + musica.getNomeMusica() + " (Eletrônica)");
                    encontrado = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao buscar o autor: " + e.getMessage());
        }
    }
}