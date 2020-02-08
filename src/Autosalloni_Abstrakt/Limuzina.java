package Autosalloni_Abstrakt;

public class Limuzina extends Automjeti {

    private String ngjyra;

    public Limuzina(long nrShasise, String prodhuesi, int vitiprodhimit, String ngjyra) {
        super(nrShasise, prodhuesi, vitiprodhimit);
        this.ngjyra = ngjyra;
    }

    public boolean eshteAutomatik() {
        return true;
    }

    public String getNgjyra() {
        return ngjyra;
    }

    public void setNgjyra(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    public String toString(){
        return "Limuzina "+ super.toString()+ " : "+ ngjyra;
    }

}
