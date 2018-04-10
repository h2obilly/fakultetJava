package fakultet;

import java.util.Date;

public class Ispit {

    private String predmet;
    private Profesor profesor;
    private Date datum;
    private int ocena;

    public Ispit(String predmet, Profesor profesor, Date datum, int ocena) {
        this.predmet = predmet;
        this.profesor = profesor;
        this.datum = datum;
        this.ocena = ocena;
    }
    
    
    

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    
    
}

