package StafiAkademik;

public abstract class Mesimdhenesi extends StafiAkademik {
    private String angazhimi;
    public Mesimdhenesi(String emri, int vitiLindjes, boolean iRregullt,String angazhimi){
        super(emri,vitiLindjes,iRregullt);
        this.angazhimi=angazhimi;
    }

    public String getAngazhimi() {
        return angazhimi;
    }

    public void setAngazhimi(String angazhimi) {
        this.angazhimi = angazhimi;
    }

    public abstract boolean mentoron();

    public String toString(){
        return super.toString()+" mban "+angazhimi;
    }

}
