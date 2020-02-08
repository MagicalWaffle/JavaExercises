package StafiAkademik;

public class Dekani extends StafiAkademik {

    private String gradaAkademike;

    public Dekani(String emri,int vitiLindesj, String gradaAkademike){
        super(emri,vitiLindesj,true);
        this.gradaAkademike=gradaAkademike;
    }

    public String getGradaAkademike(){ return gradaAkademike;}
    public void setGradaAkademike(String gradaAkademike){
        this.gradaAkademike=gradaAkademike;
    }

    public String toString(){
        return "Dekani "+gradaAkademike+". " + super.toString() ;
    }
}
