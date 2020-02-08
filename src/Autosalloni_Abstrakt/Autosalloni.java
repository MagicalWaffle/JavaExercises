package Autosalloni_Abstrakt;

public class Autosalloni {
    private String emri;
    private Automjeti [] automjetet;
    private int index=0;
    public Autosalloni(String emri, int nrAutojmeteve){
        this.emri= emri;
        automjetet= new Automjeti[nrAutojmeteve];
    }

    public boolean ekziston(Automjeti a){
        for (int i = 0; i < index; i++) {
            if (automjetet[i].equals(a)){
                return true;
            }
        }
        return false;
    }

    public void shtoAutomjetin(Automjeti a){
        if (a==null){
            System.out.println("Automjeti eshte null");
            return;
        }
        if (index==automjetet.length){
            System.out.println("Nuk ka vend ne autosllaon");
        return;
        }
        if (ekziston(a)){
            System.out.println("Ekzisotn automejti ");
            return;
        }
        automjetet[index++]=a;
    }

    public void shtypSUVProdhuesi(String prodhuesi){
        for (int i = 0; i < index; i++) {
            if (automjetet[i] instanceof SUV){
                if (automjetet[i].getProdhuesi().equals(prodhuesi)){
                    System.out.println(automjetet[i]);
                }
            }
        }
    }

    public void shtypLimuzinatViti(int viti){
        for (int i = 0; i < index; i++) {
            if (automjetet[i] instanceof Limuzina){
                if (automjetet[i].getVitiProdhimit()==viti){
                    System.out.println(automjetet[i]);
                }
            }
        }
    }



}
