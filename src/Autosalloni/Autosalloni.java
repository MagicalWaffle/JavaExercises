package Autosalloni;

public class Autosalloni {

    private String emri;
    private Automjeti[] automjetet;
    private int index = 0;

    public Autosalloni(String emri, int nrAutomjeteve) {
        this.emri = emri;
        automjetet = new Automjeti[nrAutomjeteve];
    }

    public boolean ekziston(Automjeti a) {
        for (int i = 0; i < index; i++) {
            if (automjetet[i].equals(a)) {
                return true;
            }
        }
        return false;
    }

    public void shtoAutomjetin(Automjeti a) {
        if (a == null) {
            System.out.println("Automjeti i pa inicalizuar ");
            return;
        }
        if (index == automjetet.length) {
            System.out.println("Nuk ka vend ne autosallon");
            return;
        }
        if (ekziston(a)) {
            System.out.println("Ekziston autojmeti ne autosallon");
            return;
        }

        automjetet[index++] = a;
    }


    public void shtypNgjyrat(String ngjyra) {
        for (int i = 0; i < index; i++) {
            if (automjetet[i] instanceof Limuzina) {
                Limuzina a = (Limuzina) automjetet[i];
                if (a.getNgjyra().equals(ngjyra)) {

                    System.out.println(a);
                }
            }
        }
    }

    public SUV SUVmeIVjeter() {
        if (index == 0) {
            System.out.println("Ne autosallon nuk ka asnje automjet !");
            return null;
        }

        SUV meIVjetri = null;
        for (int i = 0; i < index; i++) {
            if (automjetet[i] instanceof SUV) {
                SUV aktual = (SUV) automjetet[i];
                if (meIVjetri == null || aktual.getVitiProdhimit() <= meIVjetri.getVitiProdhimit()) {
                    meIVjetri = aktual;
                }
            }
        }
        if (meIVjetri == null) {
            System.out.println("NUk ka asnje automejt ne autosalln");
        }
        return meIVjetri;
    }


    public static void main(String[] args) {

        Autosalloni a = new Autosalloni("Salloni ABC",50);
        Automjeti a1= new Limuzina(124125346,"BMW",2010,"Black");
        a.shtoAutomjetin(a1);
        a.shtoAutomjetin(new SUV(1231245563,"Mercedes",2005,true));
        a.shtoAutomjetin(new Limuzina(8888934,"Mercedes",2019,"Black"));
        SUV suv1= new SUV(23131241,"BMW",2019, true);
        System.out.println("Limuzinat me ngjry te e zez :");
        a.shtypNgjyrat("Black");
        SUV meIVjetri = a.SUVmeIVjeter();
        SUV meIVjetri2= a.SUVmeIVjeter();
        if (meIVjetri != null){
            System.out.println("Auto mjeti me i vjeter : "+ meIVjetri);
        }

    }
}
