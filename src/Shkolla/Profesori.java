package Shkolla;

public class Profesori extends Mesimdhensi {
    private String thirrjaAkademike;

    public Profesori(String emri, int vitiLindjes, String thirrjaAkademike) {
        super(emri, vitiLindjes, "Ligjerata");
        this.thirrjaAkademike = thirrjaAkademike;
    }

    public String getThirrjen() {
        return thirrjaAkademike;
    }

    public void setThirrjen(String thirrjaString) {
        thirrjaAkademike = thirrjaString;
    }

    public String toString() {
        return "Profesori" + super.toString() + ", ka thirrje " + thirrjaAkademike;
    }
}