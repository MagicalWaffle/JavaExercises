package Autosalloni;

public class SUV extends Automjeti {

    private boolean eshte4x4;

    public SUV(long nrSh,String prodh,int vitiP,boolean eshte4x4){
        super(nrSh,prodh,vitiP);
        this.eshte4x4=eshte4x4;
    }
    public String toString(){
        return "SUV "+ super.toString() + (eshte4x4 ? " : eshte " : " : nuk eshte");
    }
}
