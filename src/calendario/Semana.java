package calendario;

import java.util.List;


public class Semana 
{
    private int numeroSemana;
    private List<Dia> dias;

    public Semana() {
        dias = new java.util.ArrayList<Dia>();
    }

    
    
    public Semana(int numeroSemana, List<Dia> dias) {
        this.numeroSemana = numeroSemana;
        this.dias = dias;
    }

    public int getNumeroSemana() {
        return numeroSemana;
    }

    public void setNumeroSemana(int numeroSemana) {
        this.numeroSemana = numeroSemana;
    }

    public List<Dia> getDias() {
        return dias;
    }

    public void setDias(List<Dia> dias) {
        this.dias = dias;
    }
    public void addDiaALaSemana(Dia dia)
    {
        if(dias != null)
        {
            dias.add(dia);
        }
    }
    
}
