package Autosalloni_Abstrakt;

public class SUV extends Automjeti {
    private boolean eshte4x4;

    public SUV(long nrShasis,String prodhuesi, int vitiProdhimit, boolean eshte4x4){
        super(nrShasis,prodhuesi,vitiProdhimit);
        this.eshte4x4=eshte4x4;
    }

    public boolean eshteAutomatik(){
        return false;
    }

    public String toString(){
        return "SUV "+ super.toString()+ (eshte4x4? "eshte" : " nuk eshte");
    }

    public boolean isEshte4x4() {
        return eshte4x4;
    }

    public void setEshte4x4(boolean eshte4x4) {
        this.eshte4x4 = eshte4x4;
    }
}
