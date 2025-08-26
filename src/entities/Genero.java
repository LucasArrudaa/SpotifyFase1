package entities;//4. Gêneros musicais
//
//○ Criar uma enumeração entities.Genero com valores como: ROCK, POP, MPB, JAZZ, CLASSICA etc.

import java.util.Scanner;

public enum Genero {
    ROCK("Rock", "Energia e rebeldia"),
    POP("Pop", "Animado e popular"),
    MPB("Música Popular Brasileira", "Cultura e brasilidade"),
    JAZZ("Jazz", "Improviso e sofisticação"),
    CLASSICA("Música Clássica", "Calma e concentração"),
    HIPHOP("Hip Hop", "Ritmo urbano e poesia"),
    ELETRONICA("Eletrônica", "Festas e baladas"),
    SERTANEJO("Sertanejo", "Tradição e romance"),
    FORRO("Forró", "Ritmo nordestino com sanfona");

    private final String descricao;
    private final String caracterista;

    Genero(String descricao, String caracteristica) {
        this.descricao = descricao;
        this.caracterista = caracteristica;
    }

    public String getDescricao() {
        return descricao;
    }



    public static void exibirOpcoes(){
        int i = 1;
        for (Genero g : Genero.values()){
            System.out.println(i + "-" + g.getDescricao());
            i++;
        }
    }

    public static Genero escolherGenero(Scanner sc){
        while (true) {
            try {
                System.out.println("\nEscolha um genêro: ");
                exibirOpcoes();
                System.out.println("Digite um número: ");
                int opcao = Integer.parseInt(sc.nextLine());

                if (opcao >= 1 && opcao <= Genero.values().length) {
                    return Genero.values()[opcao - 1];
                } else {
                    System.out.println("Opção Inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada Inválida! Digite apenas números.");
            }
        }
    }

    public static Genero fromString(String texto) {
        for (Genero g : Genero.values()) {
            if (g.getDescricao().equalsIgnoreCase(texto)) {
                return g;
            }
        }
        throw new IllegalArgumentException("Gênero não encontrado: " + new IllegalArgumentException());
    }
}