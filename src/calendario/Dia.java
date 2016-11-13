package calendario;

import java.util.Date;

public class Dia 
{
    private Date date;
    private String diaDeLaSemana;           // NO SE USA:
    private boolean esDelMesPasado;
    public Dia(Date date)
    {
        this.date = date;
        esDelMesPasado = false;
    }

    public int getNumeroMes()
    {
        return date.getDate();
    }

    public int getNumeroDentroDeSemana() {
        return date.getDay();
    }

    public String getDiaDeLaSemana() 
    {
        diaDeLaSemana = "";
        switch(date.getDay() )
        {
            case 1 : diaDeLaSemana = "Lunes";break;
            case 2 : diaDeLaSemana = "Martes";break;
            case 3 : diaDeLaSemana = "Miercoles";break;
            case 4 : diaDeLaSemana = "Jueves";break;
            case 5 : diaDeLaSemana = "Viernes";break;
            case 6 : diaDeLaSemana = "Sabado";break;
            default : diaDeLaSemana = "Domingo";break;
        }  
        return diaDeLaSemana;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isEsDelMesPasado() {
        return esDelMesPasado;
    }

    public void setEsDelMesPasado(boolean esDelMesPasado) {
        this.esDelMesPasado = esDelMesPasado;
    }

    
    @Override
    public String toString() {
        return "Dia{" + "date=" + date + '}';
    }
    
}
