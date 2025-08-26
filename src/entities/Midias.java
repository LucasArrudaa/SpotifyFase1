package entities;


public class Midias {
    private String genero;
    private String autor;
    private float tempoMusica;
    private String nomeMusica;


    public Midias(String genero, String autor, float tempoMusica, String nomeMusica) {
        this.genero = genero;
        this.autor = autor;
        this.tempoMusica = tempoMusica;
        this.nomeMusica = nomeMusica;
    }

    // Getter e Setter

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getTempoMusica() {
        return tempoMusica;
    }

    public void setTempoMusica(float tempoMusica) {
        this.tempoMusica = tempoMusica;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
}