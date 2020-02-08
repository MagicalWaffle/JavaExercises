package StafiAkademik;

public class Asistenti extends Mesimdhenesi {

    private String llojiUshtrimeve;

    public Asistenti(String emri,int vitiLindjes,boolean iRregullt,String llojiUshtrimeve){
        super(emri,vitiLindjes,iRregullt,"Ushtrime");
        this.llojiUshtrimeve=llojiUshtrimeve;
    }


    public boolean mentoron(){
        return false;
    }

    public String getLlojiUshtrimeve() {
        return llojiUshtrimeve;
    }

    public void setLlojiUshtrimeve(String llojiUshtrimeve) {
        this.llojiUshtrimeve = llojiUshtrimeve;
    }
}
