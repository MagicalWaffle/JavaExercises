package Autosalloni_Abstrakt;

public abstract class Automjeti {

    private long nrShasie; //read only
    private String prodhuesi;
    private int vitiProdhimit;


    public Automjeti(long nrShasie, String prodhuesi, int vitiProdhimit) {
        this.nrShasie = nrShasie;
        this.prodhuesi = prodhuesi;
        this.vitiProdhimit = vitiProdhimit;
    }

    public abstract boolean eshteAutomatik();

    public long getNrShasie() {
        return nrShasie;
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
        return nrShasie + " : " + prodhuesi + " - " + vitiProdhimit;
    }

    public boolean equals(Object object) {
        if (object instanceof Automjeti) {
            Automjeti automjeti = (Automjeti) object;
            return nrShasie == automjeti.getNrShasie();
        }
        return false;
    }
}
