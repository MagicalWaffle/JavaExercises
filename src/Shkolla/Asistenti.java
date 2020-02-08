package Shkolla;

public class Asistenti extends Mesimdhensi {

    private String llojiUshtrimeve;

    public Asistenti(String emri, int vitiLindjes, String llojiUshtrimeve) {
        super(emri, vitiLindjes, "Ushtrime");
        this.llojiUshtrimeve = llojiUshtrimeve;
    }

    public String getLlojiUshtrimeve() {
        return llojiUshtrimeve;
    }

    public void setLlojiUshtrimeve(String llojiUshtrimeve) {
        this.llojiUshtrimeve = llojiUshtrimeve;
    }

    public String toString() {
        return "Asistenti " + super.toString() + " " + llojiUshtrimeve;
    }

}