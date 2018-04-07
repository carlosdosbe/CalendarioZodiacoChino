
package signosZodiacales;


import java.text.SimpleDateFormat;
import java.util.Date;
import signosChinos.*;
import signosZodiacales.*;
import swing.*;

public class SignoP
{
    SimpleDateFormat sdf;
    Date dateI;
    Date dateF;

    public SignoP()
    {
       
    }

    public SignoP(SimpleDateFormat sdf, Date dateI, Date dateF) {
        this.sdf = sdf;
        this.dateI = dateI;
        this.dateF = dateF;
    }
    

    public void setDateI(Date dateI)
    {
        this.dateI = dateI;
    }

    public void setDateF(Date dateF)
    {
        this.dateF = dateF;
    }    

    public boolean analizarSigno(Date dateUser) {
        boolean bandera = false;
        //Menor
        int a = dateUser.compareTo(dateI);
        
        //Mayor
        int b = dateUser.compareTo(dateF);
        
        if(a >= 0 && b <= 0)
        {
            //Se ha enconrado el signo
            bandera = true;
        }
        else
        {
            //No es el signo buscadp
            bandera = false;
        }   
        
        return bandera; 
    }
}
