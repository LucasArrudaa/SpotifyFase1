package entities;

public class Catalogo {

    private NomeDaPlaylist sertanejo;
    private NomeDaPlaylist rock;
    private NomeDaPlaylist forro;
    private NomeDaPlaylist jazz;
    private NomeDaPlaylist hiphop;
    private NomeDaPlaylist pop;
    private NomeDaPlaylist classica;
    private NomeDaPlaylist eletronica;
    private NomeDaPlaylist mpb;

    public Catalogo() {

        // Criando playlists

        sertanejo = new NomeDaPlaylist("Sertanejo");
        rock = new NomeDaPlaylist("Rock");
        forro = new NomeDaPlaylist("Forró");
        jazz = new NomeDaPlaylist("Jazz");
        hiphop = new NomeDaPlaylist("HipHop");
        pop = new NomeDaPlaylist("Pop");
        classica = new NomeDaPlaylist("Clássica");
        eletronica = new NomeDaPlaylist("Eletrônica");
        mpb = new NomeDaPlaylist("MPB");

        // Preenchendo playlists com músicas
        sertanejo.adicionarMusica(new Midias("Sertanejo", "Marcos & Belutti", 3.28F, "Domingo de Manhã"));
        sertanejo.adicionarMusica(new Midias("Sertanejo", "Jorge & Mateus", 3.25F, "Sosseguei"));

        rock.adicionarMusica(new Midias("Rock", "Legião Urbana", 4.21F, "Tempo Perdido"));
        rock.adicionarMusica(new Midias("Rock", "Guns N' Roses", 5.56F, "Sweet Child O' Mine"));

        forro.adicionarMusica(new Midias("Forró", "Luiz Gonzaga", 3.06F, "Asa Branca"));
        forro.adicionarMusica(new Midias("Forró", "Mastruz com Leite", 3.50F, "Meu Vaqueiro, Meu Peão"));

        jazz.adicionarMusica(new Midias("Jazz", "Miles Davis", 9.22F, "So What"));
        jazz.adicionarMusica(new Midias("Jazz", "John Coltrane", 4.47F, "Giant Steps"));

        hiphop.adicionarMusica(new Midias("HipHop", "Eminem", 5.20F, "Lose Yourself"));
        hiphop.adicionarMusica(new Midias("HipHop", "Racionais MC's", 7.07F, "Vida Loka (Parte 2)"));

        pop.adicionarMusica(new Midias("Pop", "Michael Jackson", 4.54F, "Billie Jean"));
        pop.adicionarMusica(new Midias("Pop", "Dua Lipa", 3.23F, "Levitating"));

        classica.adicionarMusica(new Midias("Clássica", "Beethoven", 7.05F, "Symphony No.5"));
        classica.adicionarMusica(new Midias("Clássica", "Mozart", 5.40F, "Eine Kleine Nachtmusik"));

        eletronica.adicionarMusica(new Midias("Eletrônica", "Avicii", 4.09F, "Wake Me Up"));
        eletronica.adicionarMusica(new Midias("Eletrônica", "David Guetta ft. Sia", 4.05F, "Titanium"));

        mpb.adicionarMusica(new Midias("MPB", "Caetano Veloso", 3.40F, "Sozinho"));
        mpb.adicionarMusica(new Midias("MPB", "Chico Buarque", 6.28F, "Construção"));
    }


    // Métodos para acessar as playlists
    public NomeDaPlaylist getSertanejo() { return sertanejo; }
    public NomeDaPlaylist getRock() { return rock; }
    public NomeDaPlaylist getForro() { return forro; }
    public NomeDaPlaylist getJazz() { return jazz; }
    public NomeDaPlaylist getHipHop() { return hiphop; }
    public NomeDaPlaylist getPop() { return pop; }
    public NomeDaPlaylist getClassica() { return classica; }
    public NomeDaPlaylist getEletronica() { return eletronica; }
    public NomeDaPlaylist getMpb() { return mpb; }

    // listatr musicas

    class ListarMusicas {
        public static void listar() {
            Catalogo catalogo = new Catalogo();
            System.out.println("Todas as Músicas Disponíveis na Plataforma:");
            System.out.println();
            catalogo.getRock().exibirPlaylist();
            catalogo.getPop().exibirPlaylist();
            catalogo.getMpb().exibirPlaylist();
            catalogo.getJazz().exibirPlaylist();
            catalogo.getClassica().exibirPlaylist();
            catalogo.getHipHop().exibirPlaylist();
            catalogo.getEletronica().exibirPlaylist();
            catalogo.getSertanejo().exibirPlaylist();
            catalogo.getForro().exibirPlaylist();
        }

    }
}