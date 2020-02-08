package Shkolla_Abstrakte;

public abstract class Mesimdhenesi {

    private String emri;
    private int vitiLindjes;
    private String angazhimi;

    public Mesimdhenesi(String emri, int vitiLindjes, String angazhimi) {
        this.emri = emri;
        this.vitiLindjes = vitiLindjes;
        this.angazhimi = angazhimi;
    }

    public abstract boolean mentoron();

    public String getEmri() {
        return emri;
    }

    public int getVitiLindjes() {
        return vitiLindjes;
    }

    public void setVitiLindjes(int vitiLindjes) {
        this.vitiLindjes = vitiLindjes;
    }

    public String getAngazhimi() {
        return angazhimi;
    }

    public void setAngazhimi(String angazhimi) {
        this.angazhimi = angazhimi;
    }

    public String toString() {
        return emri + ": " + vitiLindjes + " mban " + angazhimi;
    }

    public boolean equals(Object object) {
        if (object instanceof Mesimdhenesi) {
            Mesimdhenesi m = (Mesimdhenesi) object;
            return emri.equals(m.getEmri()) && vitiLindjes == m.getVitiLindjes();
        }
        return false;
    }
}
