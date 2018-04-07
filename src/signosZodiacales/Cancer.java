
package signosZodiacales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cancer extends SignoP
{
    //(Junio 21 – Julio 22)
        
    public Cancer() throws ParseException
    {
        super();
        sdf = new SimpleDateFormat("MM-dd");
        super.dateI = sdf.parse("06-21");
        super.dateF = sdf.parse("07-22");
    }

    @Override
    public boolean analizarSigno(Date dateUser)
    {
        return super.analizarSigno(dateUser);
    }
    
    
    
    
    
    
    
}
