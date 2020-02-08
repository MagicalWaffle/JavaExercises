package Autosalloni;

public class Limuzina extends Automjeti {

    private  String ngjyra;


    public Limuzina(long nrShasise, String prodhuesi, int vitiProdhimit,String ngjyra) {
        super(nrShasise, prodhuesi, vitiProdhimit);
        this.ngjyra=ngjyra;
    }

    public String getNgjyra(){return ngjyra;}

    public void setNgjyra(String ngjyra){this.ngjyra=ngjyra;}

    public String toString(){
        return  "Limuzina" +super.toString()+ ": "+ ngjyra;
    }


}
