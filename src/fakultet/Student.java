package fakultet;

import java.util.ArrayList;
import java.util.List;

public class Student extends Osoba{

    public static int getSledeciBrojIndexa() {
        return sledeciBrojIndexa;
    }

    public static void setSledeciBrojIndexa(int aSledeciBrojIndexa) {
        sledeciBrojIndexa = aSledeciBrojIndexa;
    }
    private int brojIndeksa;
    private List<Ispit> spisakPolozenihIspita;
    private boolean diplomirao;
    private static int sledeciBrojIndexa = 0;
    
    public Student(String imeIPrezime, int brojIndeksa, boolean diplomirao) {
        super(imeIPrezime);
        this.brojIndeksa = brojIndeksa;
        this.diplomirao = diplomirao;
        spisakPolozenihIspita = new ArrayList();
        sledeciBrojIndexa++;
    }

    @Override
    public String toString() {
        return "Student{" + imeIPrezime + ", brojIndeksa=" + brojIndeksa + ", spisakPolozenihIspita=" + spisakPolozenihIspita + ", diplomirao=" + diplomirao + '}';
    }
    
    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public List<Ispit> getSpisakPolozenihIspita() {
        return spisakPolozenihIspita;
    }

    public void setSpisakPolozenihIspita(List<Ispit> spisakPolozenihIspita) {
        this.spisakPolozenihIspita = spisakPolozenihIspita;
    }

    public boolean isDiplomirao() {
        return diplomirao;
    }

    public void setDiplomirao(boolean diplomirao) {
        this.diplomirao = diplomirao;
    }
    
}
