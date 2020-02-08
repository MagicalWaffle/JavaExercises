package Autosalloni;

public class Automjeti {

    private long nrShasise;
    private String prodhuesi;
    private int vitiProdhimit;

    public  Automjeti(long nrShasise, String prodhuesi, int vitiProdhimit){
        this.nrShasise=nrShasise;
        this.prodhuesi=prodhuesi;
        this.vitiProdhimit=vitiProdhimit;
    }

    public long getNrShasise() {
        return nrShasise;
    }

    public void setNrShasise(long nrShasise) {
        this.nrShasise = nrShasise;
    }

    public String getProdhuesi() {
        return prodhuesi;
    }

    public void setProdhuesi(String prodhuesi) {
        this.prodhuesi = prodhuesi;
    }

    public int getVitiProdhimit() {
        return vitiProdhimit;
    }

    public void setVitiProdhimit(int vitiProdhimit) {
        this.vitiProdhimit = vitiProdhimit;
    }

    public String toString() {
        return nrShasise + " : " + prodhuesi + " - " + vitiProdhimit;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Automjeti) {
            Automjeti a = (Automjeti) obj;
            return getNrShasise() == a.getNrShasise();
        }
        return false;
    }

}
