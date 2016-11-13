package calendario;

import com.google.gson.Gson;
import java.util.Calendar;
import java.util.Date;

public class Calendario {

    public static void main(String[] args)
    {
        System.out.println("salida: " + new Gson().toJson(calendarisame(2016, 11)));
    }
    public static Mes calendarisame(int yearParametro, int mesParametro)
    {
        Mes mesAux = new Mes(mesParametro -1);
        Date hoy = new Date((yearParametro - 1900 ),mesParametro -1 ,1);
        
        String formatoSemana[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        
        int dia = hoy.getDate();
        int mes = hoy.getMonth();
        int year = hoy.getYear();
        
        int diaFormateado = dia;
        int mesFormateado = mes + 1;
        int yearFormateado = year + 1900;
        
        System.out.println("dia: " + diaFormateado );
        System.out.println("mes: " + mesFormateado );
        System.out.println("año: " + yearFormateado );
        
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(hoy);
        int cantSemanasMes = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
        int cantDiasMes = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("cantidad Semanas mes(" + (hoy.getMonth() +1)  +"/" + (hoy.getYear() + 1900) +"): " + cantSemanasMes + " " + cantDiasMes);
        
        //LISTO LAS SEMANAS:
        for(int s = 0 ; s < cantSemanasMes ;s ++)//cantSemanasMes
        {
            System.out.println("semana " + s);
            Semana semanaAux = new Semana();
            
            for(int f = 0; f < formatoSemana.length; f++)
            {
                int resta = 0;
                
                
                Dia diaAux;
                
                do
                {
                    if(s == 0)
                    {
                        int chota =(s*f) + f - resta;
                        Date d = new Date(year,mes, chota);
                        diaAux = new Dia(d);
                        if (d.getMonth() != hoy.getMonth())
                        {
                            diaAux.setEsDelMesPasado(true);
                        }
                        
                        System.out.println("semana "+ s +" " + chota + " " + formatoSemana[f]);
                    }
                    else
                    {
                        int chota = (s*7) + f + resta;
                        Date d = new Date(year,mes, chota);
                        diaAux = new Dia(d);
                        if (d.getMonth() != hoy.getMonth())
                        {
                            diaAux.setEsDelMesPasado(true);
                        }
                        System.out.println("semana "+ s +" " + chota + " " + formatoSemana[f]);
                    }
                    
                    
                    resta++;
                    
                }
                while(!diaAux.getDiaDeLaSemana().equalsIgnoreCase(formatoSemana[f]));
                System.out.println(diaAux);
                semanaAux.addDiaALaSemana(diaAux);
            }
                
                
            mesAux.addSemanaAlMes(semanaAux);
            
        }
        
        
        
        return mesAux;
    }
}


/* //LISTO 7 DIAS DE LA SEMANA:
            for(int i = 0 ; i < formatoSemana.length ; i++)
            {
                Date aux;
                aux = new Date(year,mes,(7*s) + i); 
                
                Dia diaAux = new Dia();
                
                diaAux.setNumero(i);
                diaAux.setNumeroDentroDeSemana(aux.getDay());
                
                while(diaAux.getDiaDeLaSemana() != formatoSemana[i])
                {
                    System.out.println(" != " + diaAux.getDiaDeLaSemana() + " | " + formatoSemana[i]);
                    diaAux.setNumeroDentroDeSemana(diaAux.getNumeroDentroDeSemana() -1 );
                }
                //System.out.println(" =  " + diaAux.getDiaDeLaSemana()+ " | " + diaAux.getDiaDeLaSemana());
                /*if(diaAux.getDiaDeLaSemana() == formatoSemana[i])
                {
                    System.out.println(" =  " + diaAux.getDiaDeLaSemana());
                }
                else
                {
                    System.out.println(" != " + diaAux.getDiaDeLaSemana() + " | " + formatoSemana[i]);
                }*/