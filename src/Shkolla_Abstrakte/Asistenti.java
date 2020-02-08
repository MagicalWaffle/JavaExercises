package Shkolla_Abstrakte;

public class Asistenti extends Mesimdhenesi {
    private String llojiUshtrimeve;

    public Asistenti(String emri, int vitiLindejs, String llojiUshtrimeve){
        super(emri,vitiLindejs,"Ushtrime");
        this.llojiUshtrimeve=llojiUshtrimeve;
    }

    public boolean mentoron(){
        return false;
    }

    public String getLlojiUshtrimeve(){
        return llojiUshtrimeve;
    }

    public void setLlojiUshtrimeve(String llojiUshtrimeve){
        this.llojiUshtrimeve=llojiUshtrimeve;
    }

    public String toString(){
        return "Asistenti "+ super.toString()+" "+ llojiUshtrimeve;
    }


}
