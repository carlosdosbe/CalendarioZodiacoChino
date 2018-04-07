
package signosZodiacales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Acuario extends SignoP
{
   //Enero 20 – Febrero 18
    
    public Acuario() throws ParseException
    {
        super();
        sdf = new SimpleDateFormat("MM-dd");
        dateI = sdf.parse("01-20");
        dateF = sdf.parse("02-18");
    }   

    @Override
    public boolean analizarSigno(Date dateUser)
    {
        return super.analizarSigno(dateUser); 
    }   
    
}
