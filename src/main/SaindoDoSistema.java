package main;
import entities.*; // importando todas as classes do pacote entities
class SaindoDoSistema {
    public static void saindo() {
        try {
            System.out.println("Obrigado por usar o nosso programa. ");
            System.out.println("-------------------------");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao adicionar músicas: " + e.getMessage());
        }
    }
}