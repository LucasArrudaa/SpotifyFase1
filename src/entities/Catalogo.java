package entities;

public class Catalogo {

    private Playlist sertanejo;
    private Playlist rock;
    private Playlist forro;
    private Playlist jazz;
    private Playlist hiphop;
    private Playlist pop;
    private Playlist classica;
    private Playlist eletronica;
    private Playlist mpb;

    public Catalogo() {

        // Criando playlists

        sertanejo = new Playlist("Sertanejo");
        rock = new Playlist("Rock");
        forro = new Playlist("Forró");
        jazz = new Playlist("Jazz");
        hiphop = new Playlist("HipHop");
        pop = new Playlist("Pop");
        classica = new Playlist("Clássica");
        eletronica = new Playlist("Eletrônica");
        mpb = new Playlist("MPB");

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
    public Playlist getSertanejo() { return sertanejo; }
    public Playlist getRock() { return rock; }
    public Playlist getForro() { return forro; }
    public Playlist getJazz() { return jazz; }
    public Playlist getHipHop() { return hiphop; }
    public Playlist getPop() { return pop; }
    public Playlist getClassica() { return classica; }
    public Playlist getEletronica() { return eletronica; }
    public Playlist getMpb() { return mpb; }

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