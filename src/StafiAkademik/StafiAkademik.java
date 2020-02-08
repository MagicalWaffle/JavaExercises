package StafiAkademik;

public abstract class StafiAkademik {
    private String emri;
    private int vitiLindjes;
    private boolean iRegullt;

    public StafiAkademik(String emri, int vitiLindjes, boolean iRegullt) {
        this.emri = emri;
        this.vitiLindjes = vitiLindjes;
        this.iRegullt = iRegullt;
    }

    public String getEmri() {
        return emri;
    }

    public int getVitiLindjes() {
        return vitiLindjes;
    }

    public void setVitiLindjes(int vitiLindjes) {
        this.vitiLindjes = vitiLindjes;
    }

    public boolean isiRegullt() {
        return iRegullt;
    }

    public void setiRegullt(boolean iRegullt) {
        this.iRegullt = iRegullt;
    }

    public String toString(){
        return emri+" : "+ vitiLindjes+" staf "+ (iRegullt? "i rregullt":"jo i rregullt");
    }

    public boolean equals(Object object) {
        if (object instanceof StafiAkademik) {
            StafiAkademik sa = (StafiAkademik) object;
            return emri.equals(sa.getEmri()) && vitiLindjes == sa.getVitiLindjes();
        }
        return false;
    }


}
