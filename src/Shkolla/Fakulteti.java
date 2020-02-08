package Shkolla;

public class Fakulteti {
    private String emri;
    private Mesimdhensi[] mesimdhensit;
    private int index = 0;

    public Fakulteti(String emri, int nrMs) {
        this.emri = emri;
        mesimdhensit = new Mesimdhensi[nrMs];
    }

    public boolean ekziston(Mesimdhensi m) {
        for (int i = 0; i < index; i++) {
            if (mesimdhensit[i].equals(m)) {
                return true;
            }
        }
        return false;
    }

    public void shtoMesimdhenesin(Mesimdhensi m) {
        if (m == null) {
            System.out.println("Shkolla.Mesimdhensi i pa inicailizuar ");
            return;
        }
        if (mesimdhensit.length == index) {
            System.out.println("NUk ka vend ne fakultet");
            return;
        }
        if (ekziston(m)) {
            System.out.println("Shkolla.Mesimdhensi ekziston");
            return;
        }
        mesimdhensit[index++] = m;

    }

    public Profesori profesoriMeIRi() {
        if (index == 0) {
            System.out.println("Nuk ka asnje eprofesor ne fakultet!");
            return null;
        }

        Profesori meIRiu = null;

        for (int i = 0; i < index; i++) {
            if (mesimdhensit[i] instanceof Profesori) {
                Profesori aktual = (Profesori) mesimdhensit[i];
                if (meIRiu == null || aktual.getVitiLindjes() >= meIRiu.getVitiLindjes()) {
                    meIRiu = aktual;
                }
            }
        }
        if (meIRiu == null) {
            System.out.println("Nuk ka asnje mesimdhense ne fakultet!");
        }
        return meIRiu;
    }

    public void shtypLlojinEUshtrimeve(String llU) {
        if (index == 0) {
            System.out.println("NUk ka asnje profesor ne fakultet");
            return;
        }
        for (int i = 0; i < index; i++) {
            if (mesimdhensit[i] instanceof Asistenti) {
                Asistenti a = (Asistenti) mesimdhensit[i];
                if (a.getLlojiUshtrimeve().equals(llU)) {
                    System.out.println(a);
                }
            }
        }
    }

    public static void main(String[] args) {
        Fakulteti f = new Fakulteti("Shkenca Kompjuterike", 15);
        Profesori meIRiu1 = f.profesoriMeIRi();
        f.shtoMesimdhenesin(new Asistenti("Besart Pllana", 1982, "Laboratorike"));
        Profesori meIRiu2 = f.profesoriMeIRi();
        f.shtoMesimdhenesin(new Profesori("Fatos Maxhuni", 1970, "Profesor i rregullt"));
        Mesimdhensi m = new Asistenti("Besart Pllana", 1990, "Laboratorike");
        System.out.println();
        System.out.println("Mesimdhenesi: " + m + (f.ekziston(m) ? " " : " nuk ") + "ekziston.");
        System.out.println();
        Profesori meIRiu = f.profesoriMeIRi();
        if (meIRiu != null)
            System.out.println("Profesori me i ri: " + meIRiu);
        System.out.println();
        System.out.println("Asistentet me ushtrime \"Laboratorike\":");
        f.shtypLlojinEUshtrimeve("Laboratorike");
    }
}
