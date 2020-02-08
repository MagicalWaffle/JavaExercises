package Shkolla;

public class Mesimdhensi {
    private String emri;
    private int vitiLindjes;
    private String angazhimi;

    public Mesimdhensi(String emri, int vitiLindjes, String angazhimi) {
        this.emri = emri;
        this.vitiLindjes = vitiLindjes;
        this.angazhimi = angazhimi;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
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
        return emri + " : " + vitiLindjes + " mban " + angazhimi;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Mesimdhensi) {
            Mesimdhensi m = (Mesimdhensi) obj;
            return emri.equals(m.getEmri()) && vitiLindjes == m.getVitiLindjes();
        }
        return false;
    }
}