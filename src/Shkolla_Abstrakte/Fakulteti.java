package Shkolla_Abstrakte;

public class Fakulteti {
    
    private String emri;
    private Mesimdhenesi [] mesimdhenesit;
    private int index=0;
    
    public Fakulteti(String emri, int nrM){
        this.emri= emri;
        mesimdhenesit= new Mesimdhenesi[nrM];
    }
    
    public boolean ekzison(Mesimdhenesi m){
        for (int i = 0; i < index; i++) {
            if (mesimdhenesit[i].equals(m)){
                return true;
            }
        }
        return false;
    }

    public void shtoMesimdhenesin(Mesimdhenesi m ){
        if (m==null){
            System.out.println("Mesimdhensi i pa inicalizuar");
            return;
        }
        if (index==mesimdhenesit.length){
            System.out.println("Nuk ka vend ne fakultet per mesimdhens te ri");
            return;
        }
        if (ekzison(m)){
            System.out.println("Mesimdhenesi ekziston ne fakultet");
            return;
        }
        mesimdhenesit[index++]=m;
    }

    public Profesori thirrjaMeEVjeter(String thirrjaAkademike){
        if (index==0){
            System.out.println("Nuk ka anje profesor ne varg");
            return null;
        }
        Profesori meIVjeter =null;

        for (int i = 0; i < index; i++) {
            if (mesimdhenesit[i] instanceof Profesori){
                Profesori aktual = (Profesori) mesimdhenesit[i];
                if (aktual.getThirrjaAkademike().equals(thirrjaAkademike)&& meIVjeter==null || aktual.getVitiLindjes()<=meIVjeter.getVitiLindjes() ){
                    meIVjeter=aktual;
                }
            }
        }
        if (meIVjeter == null) {
            System.out.println("Nuk ka asnje profesor ne fakultet!");
        }
        return meIVjeter;
    }
    public void shypMentoret(boolean mentoron){
        if (index==0){
            System.out.println("Nuk ka asnje profesor ne fk");
            return;
        }
        for (int i = 0; i < index; i++) {
            if (mesimdhenesit[i] instanceof Asistenti){
                Asistenti asistenti= (Asistenti)mesimdhenesit[i];
                if (asistenti.mentoron()==mentoron){
                    System.out.println(asistenti);
                }
            }
        }
    }

    public static void main(String[] args) {
        Fakulteti fk= new Fakulteti("Shkenca kompjuteike",15);

        Profesori profesori1= new Profesori("Ardit Daku",1998,"Profesor i rregullt");
        Profesori profesori2= new Profesori("Fato Maxhuni",1960,"Profesor i rregullt");

        fk.shtoMesimdhenesin(profesori1);
        fk.shtoMesimdhenesin(profesori2);
        fk.shtoMesimdhenesin(new Profesori("Filan Fisteku", 1980, "Profesor asistent"));
        fk.shtoMesimdhenesin(new Asistenti("Besart Pllana", 1982, "Laboratorike"));
        fk.shtoMesimdhenesin(new Asistenti("Fistek Filani", 1978, "Numerike"));
        fk.shtoMesimdhenesin(new Asistenti("Bleerim Hasani",1995,"Laboratorike"));
        System.out.println();
        Mesimdhenesi m = new Asistenti("Besart Pllana", 1990, "Laboratorike");
        System.out.println("Mesimdhenesi: " + m + (fk.ekzison(m) ? " " : " nuk ") + "ekziston.");


//        Profesori meIVjeter=

    }



    
}
