//Zadatak 4. Fakultet (Nasledjivanje)
//Kreirati biblioteku klasa i u njoj klase:
//
//·       Osoba – ime i prezime.
//
//·       Profesor – nasleđuje klasu Osoba. Takođe ima i polje brojRadneKnjižice.
//
//·       Ispit - predmet, profesor, datum i ocena. (Polje profesor je tipa Profesor).
//
//·       Student – nasleđuje klasu Osoba. Takođe ima i polja broj indeksa i spisak položenih 
//ispita, diplomirao (boolean).
//
//          Kreirati konzolnu aplikaciju i u njoj klasu:
//
//·       Fakultet – naziv, spisak studenata i broj desetki. Ova klasa sadrži Main metodu.
//
//          U svim klasama neophodno je odrediti odgovarajuće modifikatore pristupa za polja 
//i obezbediti konstruktore (spisak položenih ispita i spisak studenata su na početku prazni).
//
//          Obezbediti mogućnost (preko odgovarajućih metoda) pretraživanja studenata po 
//sledećim kriterijumima (voditi računa da rezultati pretrage ne sadrže ponavljanja):
//
//1.     Studenti koji nisu diplomirali, a položili su više od 5 ispita.
//
//2.     Prosečna ocena na određenom predmetu kod određenog profesora.
//
//3.     Da li je određeni student dobio više od 9 na svakom od predmeta iz skupa predmeta
//koji je zadat.
//
//4.     Predmet (ili predmeti) sa najvećim brojem desetki.
//
//5.     Studenti koji nemaju nijednu šesticu.
//
//6.     Poslednji ispit koji je unesen u sistem.
//
//7.     Studenti čije prezime sadrži zadata slova.
//
//8.     Predmeti iz kojih su položeni ispiti u poslednjih mesec dana.
//
//9.  Za svaku od ocena, broj predmeta koje je određeni student položio sa datom ocenom.
package fakultet;

import java.util.ArrayList;
import java.util.List;

public class Fakultet {

    private String naziv;
    private List<Student> spisakStudenata;
    private List<Predmet> spisakPredmeta;
    private int brojDesetki;

    public Fakultet(String naziv) {
        this.naziv = naziv;
        spisakStudenata = new ArrayList();

    }

//    1.     Studenti koji nisu diplomirali, a položili su više od 5 ispita.
    public List<Student> nisuDiplViseOd5Ispita() {
        List<Student> lista = new ArrayList();
        for (Student s : spisakStudenata) {
            if (s.isDiplomirao() && s.getSpisakPolozenihIspita().size() > 5) {
                lista.add(s);
            }
        }
        return lista;
    }

    //      2.     Prosečna ocena na određenom predmetu kod određenog profesora.
    public double prosecnaOcena(Ispit i) {

        return 0;
    }

//     Da li je određeni student dobio više od 9 na svakom od predmeta iz skupa predmeta
//koji je zadat.
    public boolean daLiJeDobioViseOd9NaSvakomOdPredmeta(List<Ispit> i) {
        return false;
    }

    public static void main(String[] args) {
//     Date datum = new GregorianCalendar(2001,11,11).getTime();

        //novi fakultet
        Fakultet f1 = new Fakultet("fona");
        //noviStudenti i profesori
        List<Student> listaStudenata = Utills.kreirajListuStudenata();
        List<Profesor> listaProfesora = Utills.kreirajListuProfesora();
        f1.setSpisakStudenata(listaStudenata);
        Utills.stampajListu(f1.getSpisakStudenata());
        Utills.stampajListu(listaProfesora);
        Utills.simulirajIspite(10, listaProfesora, listaStudenata);
        
        Utills.stampajListu(f1.nisuDiplViseOd5Ispita());
       // Ispit i1 = new Ispit("matematika", prof1,)
    

    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Student> getSpisakStudenata() {
        return spisakStudenata;
    }

    public void setSpisakStudenata(List<Student> spisakStudenata) {
        this.spisakStudenata = spisakStudenata;
    }

    public int getBrojDesetki() {
        return brojDesetki;
    }

    public void setBrojDesetki(int brojDesetki) {
        this.brojDesetki = brojDesetki;
    }

}
