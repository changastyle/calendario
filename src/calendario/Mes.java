package calendario;

import java.util.ArrayList;
import java.util.List;

public class Mes {
    private int numeroMes;
    private String nombreMes;
    private String acronimoMes;
    private List<Semana> semanas;


    
    public Mes(int numeroMes) 
    {
        this.numeroMes = numeroMes;
        nombreMes = getNombreMes();
        acronimoMes = getAcronimoMes();
        semanas = new ArrayList<Semana>();
    }

    public int getNumeroMes() {
        return numeroMes;
    }

    public void setNumeroMes(int numeroMes) {
        this.numeroMes = numeroMes;
    }

    public String getNombreMes() 
    {
        switch(numeroMes)
        {
            case 0: nombreMes = "Enero";break;
            case 1: nombreMes = "Febrero";break;
            case 2: nombreMes = "Marzo";break;
            case 3: nombreMes = "Abril";break;
            case 4: nombreMes = "Mayo";break;
            case 5: nombreMes = "Junio";break;
            case 6: nombreMes = "Julio";break;
            case 7: nombreMes = "Agosto";break;
            case 8: nombreMes = "Septiembre";break;
            case 9: nombreMes = "Octubre";break;
            case 10: nombreMes = "Noviembre";break;
            case 11: nombreMes = "Diciembre";break;
        }
        return nombreMes;
    }

    public String getAcronimoMes() 
    {
        acronimoMes = getNombreMes().substring(0,3);
        return acronimoMes;
    }

    public void setAcronimoMes(String acronimoMes) {
        this.acronimoMes = acronimoMes;
    }
    

    public List<Semana> getSemanas() {
        return semanas;
    }

    public void setSemanas(List<Semana> semanas) {
        this.semanas = semanas;
    }
    
    public void addSemanaAlMes(Semana semana)
    {
        if(semanas != null)
        {
            semanas.add(semana);
        }
    }
}
