package fakultet;

public class Profesor extends Osoba{
 
    private int brojRadneKnjizice;

    public Profesor(String imeIPrezime, int brojRadneKnjizice){
        super(imeIPrezime);
        this.brojRadneKnjizice = brojRadneKnjizice;
    }
       
    public int getBrojRadneKnjizice() {
        return brojRadneKnjizice;
    }

    public void setBrojRadneKnjizice(int brojRadneKnjizice) {
        this.brojRadneKnjizice = brojRadneKnjizice;
    }

    @Override
    public String toString() {
        return "Profesor{" + imeIPrezime + ", brojRadneKnjizice=" + brojRadneKnjizice + '}';
    }

  
    
}

class noviProfesor{
    
}