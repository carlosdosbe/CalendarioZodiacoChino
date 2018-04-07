package signosChinos;


public class SignoChinoUser
{
    private String signo;
    private int year;

    public SignoChinoUser()
    {
        
    }

    public SignoChinoUser(String signo, int year)
    {
        this.signo = signo;
        this.year = year;
    }    

    public String getSigno()
    {
        return signo;
    }

    public void setSigno(String signo)
    {
        this.signo = signo;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    @Override
    public String toString() {
        return "SignoChinoUser{" + "signo=" + signo + ", descripcion=" + ", year=" + year + '}';
    }
    
    
    
    
}
