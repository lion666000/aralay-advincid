public class Kniha {
    private String nazev;
    private int rokVydani;
    private String autor;

    public Kniha(String nazev, int rokVydani, String autor) {
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.autor = autor;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String toString(){
        return nazev+" "+rokVydani+" "+autor;
    }
}
