package fakultet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Utills {
        
    public static <T> void stampajListu(List<T> lista){
        if(lista.isEmpty()){
            System.out.println("lista je prazna...");
        }
        
        for(T t : lista){
            System.out.println(t.toString());
        }
    }
    
    public static void simulirajIspite(int brojIspita, List<Profesor> profesori, List<Student> studenti){
        for ( int i = 0 ; i < brojIspita ; i++){
                //String nazivIspita = "ispit" + i;
                Random r = new Random();
                Predmet p = Predmet.
                Ispit nazivIspita = new Ispit("matematika", profesori.get((int)((Math.random()* (profesori.size())))),new Date(), 10);
                System.out.println(nazivIspita +  "  ' " + i);
                System.out.println("profesor je : " + profesori.get((int)(Math.random()* (profesori.size()))));
        }
    }
    

public static List<Student> kreirajListuStudenata(){
    List<Student> studenti = new ArrayList();
    List<String> imenaStudenata = new ArrayList();
    imenaStudenata.add("Djordje");
    imenaStudenata.add("Marko");
    imenaStudenata.add("Vladimir");
    imenaStudenata.add("Branko");
    imenaStudenata.add("Aleksandar");
    imenaStudenata.add("Marija");
    imenaStudenata.add("Ivana");
    List<String> prezimenaStudenata = new ArrayList();
    prezimenaStudenata.add("Djordjevic");
    prezimenaStudenata.add("Markovic");
    prezimenaStudenata.add("Petrovic");
    prezimenaStudenata.add("Milinkovic");
    prezimenaStudenata.add("Kovacevic");
    prezimenaStudenata.add("Stankovic");
    
    for(String ime: imenaStudenata){
        for (String prezime: prezimenaStudenata){
           
            studenti.add(new Student(ime + " "+prezime,Student.getSledeciBrojIndexa() , Math.random()<0.3));
        }
    }
    Collections.shuffle(studenti);
    
    return studenti;
}

public static List<Profesor> kreirajListuProfesora(){
    List<Profesor> profesori = new ArrayList();
    List<String> imenaProfesora = new ArrayList();
    imenaProfesora.add("Serif");
    imenaProfesora.add("Bojan");
    imenaProfesora.add("Igor");
    imenaProfesora.add("Zoran");
    List<String> prezimenaStudenata = new ArrayList();
    prezimenaStudenata.add("Glavonjic");
    prezimenaStudenata.add("Guzonjic");
    
    for(String ime: imenaProfesora){
        for (String prezime: prezimenaStudenata){
            profesori.add(new Profesor(ime + " " + prezime,(int)(Math.random()*1000)));
        }
    }
    Collections.shuffle(profesori);
    return profesori;
}
    
    
}
