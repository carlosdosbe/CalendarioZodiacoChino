package signosChinos;


public class CalendarioChino
{
    private Rata rata;
    private Buey buey;
    private Tigre tigre;
    private Liebre liebre;
    private Dragon dragon;
    private Serpiente serpiente;
    private Caballo caballo;
    private Cabra cabra;
    private Mono mono;
    private Gallo gallo;
    private Perro perro;
    private Jabali jabali;
    
    private SignoChinoUser signoChinoUser;
    
    private String signo;
        
    boolean bandera = true;

    public CalendarioChino()
    {
        rata = new Rata();
        buey = new Buey();
        tigre = new Tigre();
        liebre = new Liebre();
        dragon = new Dragon();
        serpiente = new Serpiente();
        caballo = new Caballo();
        cabra = new Cabra();
        mono = new Mono();
        gallo = new Gallo();
        perro = new Perro();
        jabali = new Jabali();
    }
    
    public String compararYear(int yearUser)
    {
        String description = null;
        for (int i = 0; i < rata.getYears().length; i++)
        {
            // Rata
            if (yearUser == rata.getYears()[i])
            {
                System.out.println("Rata");
                bandera = true;
                signo = "Rata";
                
                // Quitando referencia a objetos para liberar memoria
                buey = null;
                tigre = null;
                liebre = null;
                dragon = null;
                serpiente = null;
                caballo = null;
                cabra = null;
                mono = null;
                gallo = null;
                perro = null;
                jabali = null;
                
                description = "Características del signo de la Rata\n" +
                            "Los nacidos en el Año de la Rata tienden a ser muy sinceros y espontáneos.\n" +
                            "Se expresan con mucha sinceridad pero como tienen una gran dosis de ingenuidad, su\n"+
                            "franqueza no molesta ni ofende. Son muy simpáticos y divertidos, también sensuales,\n" +
                            "sentimentales y seductores, los hombres y mujeres de este signo suelen tener mucha\n"+
                            "energía y un gran intelecto.";
                
                break;
            }
            else
            {
                bandera = false;
            }
        }
        
        // Buey
        if (bandera == false)
        {
            for (int i = 0; i < buey.getYears().length; i++) 
            {
                if (yearUser == buey.getYears()[i])
                {
                    System.out.println("Buey");
                    bandera = true;
                    signo = "Buey";
                    
                    // Quitando referencia a objetos para liberar memoria
                    rata = null;
                    tigre = null;
                    liebre = null;
                    dragon = null;
                    serpiente = null;
                    caballo = null;
                    cabra = null;
                    mono = null;
                    gallo = null;
                    perro = null;
                    jabali = null;
                    
                    description = "Características del signo del Buey\n\n"
                            + "¡Símbolo del trabajo y la honradez! El Buey representa\n"
                            + "en la mitología china la prosperidad"
                            + "conseguida mediante el azar sino mediante el esfuerzo y el\n"
                            + "trabajo. Se les atribuye la cualidad del servicio, la laboriosidad, el trabajo.\n"
                            + "Los nativos del signo del Buey son metódicos y muy trabajadores,\n"
                            + "confiables y honestos.";
                    
                    break;
                }
                else
                {
                    bandera = false;
                }
            }
        }
        
        // Tigre
        if (bandera == false)
        {
            for (int i = 0; i < tigre.getYears().length; i++) 
            {
                if (yearUser == tigre.getYears()[i])
                {
                    System.out.println("Tigre");
                    bandera = true;
                    signo = "Tigre";                   
                    
                    // Quitando referencia a objetos para liberar memoria
                    rata = null;
                    buey = null;
                    liebre = null;
                    dragon = null;
                    serpiente = null;
                    caballo = null;
                    cabra = null;
                    mono = null;
                    gallo = null;
                    perro = null;
                    jabali = null;
                    
                    description = "Características del signo del Tigre\n\n"
                            + "Aquí tenemos el símbolo de la autoridad y el poder\n"
                            + "dentro del horóscopo chino. El Entre sus cualidades\n"
                            + "figura ser muy independiente e ingenioso.\n"
                            + "Suele decirse que los tigres nacieron para ser jefes\n"
                            + "o líderes. Son incansables, impulsivos y aventureros\n"
                            + "pero muy generosos.";
                    
                    break;
                }
                else
                {
                    bandera = false;
                }
            }
        }
        
        // Liebre
        if (bandera == false)
        {
            for (int i = 0; i < liebre.getYears().length; i++) 
            {
                if (yearUser == liebre.getYears()[i])
                {
                    System.out.println("Liebre");
                    bandera = true;
                    signo = "Liebre";
                    
                    // Quitando referencia a objetos para liberar memoria
                    rata = null;
                    buey = null;
                    tigre = null;
                    dragon = null;
                    serpiente = null;
                    caballo = null;
                    cabra = null;
                    mono = null;
                    gallo = null;
                    perro = null;
                    jabali = null;
                    
                    description = "Características del signo de la Liebre\n\n" 
                            + "Este es un signo que suele tener dos nombres,\n"
                            + "o bien la Liebre o bien el Gato. En la mitología\n"
                            + "china el Gato representa la longevidad y el encanto,\n"
                            + "tal vez por eso se le atribuyen\n"
                            + "cualidades del signo hermano.\n";
                    
                    break;
                }
                else
                {
                    bandera = false;
                }
            }
        }
        
        // Dragon
        if (bandera == false)
        {
            for (int i = 0; i < dragon.getYears().length; i++) 
            {
                if (yearUser == dragon.getYears()[i])
                {
                    System.out.println("Dragon");
                    bandera = true;
                    signo = "Dragón";
                    
                    // Quitando referencia a objetos para liberar memoria
                    rata = null;
                    buey = null;
                    tigre = null;
                    liebre = null;
                    serpiente = null;
                    caballo = null;
                    cabra = null;
                    mono = null;
                    gallo = null;
                    perro = null;
                    jabali = null;
                    
                    description = "Características del signo del Dragón\n\n"
                            + "El Dragón es el signo más admirado dentro del\n"
                            + "horóscopo y la mitología china. Suele decirse que\n"
                            + "las personas nacidas bajo este signo provocan admiración\n"
                            + "y a la vez un poco de temor. Todos quieren acercarse\n"
                            + "al Dragón porque le consideran muy afortunado y esperan\n"
                            + "recibir un poco de su buena suerte al estar junto\n"
                            + "a personas nacidas en ese signo.";
                    
                    break;
                }
                else
                {
                    bandera = false;
                }
            }
        }
        
        // Serpiente
        if (bandera == false)
        {
            for (int i = 0; i < serpiente.getYears().length; i++) 
            {
                if (yearUser == serpiente.getYears()[i])
                {
                    System.out.println("Serpiente");
                    bandera = true;
                    signo = "Serpiente";
                    
                    // Quitando referencia a objetos para liberar memoria
                    rata = null;
                    buey = null;
                    tigre = null;
                    liebre = null;
                    dragon = null;
                    caballo = null;
                    cabra = null;
                    mono = null;
                    gallo = null;
                    perro = null;
                    jabali = null;
                    
                    description = "Características del signo de la Serpiente\n\n"
                            + "A diferencia de Occidente donde a las serpientes o bien se les\n"
                            + "teme o se les tiene en mala reputación, en el Oriente no es así,\n"
                            + "al contrario,se consideran símbolo de inteligencia, habilidad,\n"
                            + "belleza, astucia.";
                    
                    break;
                }
                else
                {
                    bandera = false;
                }
            }
        }
        
        // Caballo
        if (bandera == false)
        {
            for (int i = 0; i < caballo.getYears().length; i++) 
            {
                if (yearUser == caballo.getYears()[i])
                {
                    bandera = true;
                    signo = "Caballo";
                    
                    // Quitando referencia a objetos para liberar memoria
                    rata = null;
                    buey = null;
                    tigre = null;
                    liebre = null;
                    dragon = null;
                    serpiente = null;
                    cabra = null;
                    mono = null;
                    gallo = null;
                    perro = null;
                    jabali = null;
                    
                    description = "Características del signo del Caballo\n\n"
                            + "Dentro del horóscopo chino el Caballo ocupa un lugar muy especial\n"
                            + "ya que posee una naturaleza seductora y muy agradable.\n\n"
                            + "El nativo del Caballo es alegre, comunicativo e inquieto,\n"
                            + "muy activo con una gran inclinación a la aventura y los viajes,\n"
                            + "la independencia, la libertad existencial. ¡Es difícil controlar al Caballo!";
                    
                    break;
                }
                else
                {
                    bandera = false;
                }
            }
        }
        
        // Cabra
        if (bandera == false)
        {
            for (int i = 0; i < cabra.getYears().length; i++) 
            {
                if (yearUser == cabra.getYears()[i])
                {
                    bandera = true;
                    signo = "Cabra";
                    
                    // Quitando referencia a objetos para liberar memoria
                    rata = null;
                    buey = null;
                    tigre = null;
                    liebre = null;
                    dragon = null;
                    serpiente = null;
                    caballo = null;
                    mono = null;
                    gallo = null;
                    perro = null;
                    jabali = null;
                    
                    description = "CARACTERÍSTICAS DE LA CABRA U OVEJAS\n\n"
                            + "La Cabra u Oveja representa al signo más femenino dentro del horóscopo chino.\n"
                            + "Son de suave temperamento, sinceros y amables. Es difícil no amarles, y aunque\n"
                            + "son bastante retraídos tienen muy buenos amigos gracias a su nobleza y sinceridad,\n"
                            + "su dulzura y ternura.\n\n"
                            + "Tienen gran sentido artístico y aunque no se dediquen al arte como principal\n"
                            + "ocupación, su gusto estético será muy refinado y en algún momento les dará por la pintura,\n"
                            + "la actuación, la música.";
                    
                    break;
                }
                else
                {
                    bandera = false;
                }
            }
        }
        
        // Mono
        if (bandera == false)
        {
            for (int i = 0; i < mono.getYears().length; i++) 
            {
                if (yearUser == mono.getYears()[i])
                {
                    //System.out.println("Mono");
                    bandera = true;
                    signo = "Mono";
                    
                    // Quitando referencia a objetos para liberar memoria
                    rata = null;
                    buey = null;
                    tigre = null;
                    liebre = null;
                    dragon = null;
                    serpiente = null;
                    caballo = null;
                    cabra = null;
                    gallo = null;
                    perro = null;
                    jabali = null;
                    
                    description = "Características del signo del Mono\n\n"
                            + "Los nacidos bajo este signo son muy inteligentes, activos y bromistas.\n"
                            + "Alguien que inventa, que improvisa, que crea un nuevo camino en vez de\n"
                            + "transitar uno que ya esté hecho. Les gusta ser siempre el centro de la atención.\n"
                            + "Mentalmente es muy rápido, busca la diversidad y el movimiento.\n"
                            + "Tiene un gran sentido del humor y muchas veces molesta a quienes lo rodean con\n"
                            + "su sarcasmo e ironía cuando no entienden sus chistes y bromas.";
                    
                    break;
                }
                else
                {
                    bandera = false;
                }
            }
        }
        
        // Gallo
        if (bandera == false)
        {
            for (int i = 0; i < gallo.getYears().length; i++) 
            {
                if (yearUser == gallo.getYears()[i])
                {
                    bandera = true;
                    signo = "Gallo";
                    
                    // Quitando referencia a objetos para liberar memoria
                    rata = null;
                    buey = null;
                    tigre = null;
                    liebre = null;
                    dragon = null;
                    serpiente = null;
                    caballo = null;
                    cabra = null;
                    perro = null;
                    jabali = null;
                    
                    description = "Características del signo del Gallo\n\n"
                            + "Suele decirse que este signo, el Gallo, es el menos comprendido y el más\n"
                            + "excéntrico y espectacular de todos los signos del horóscopo chino.\n"
                            + "Nunca se verá a un Gallo desarreglado, siempre mantendrá una apariencia\n"
                            + "impecable pues para el Gallo la imagen es todo: peinado, manos, ropa, detalles.";
                            
                    break;
                }
                else
                {
                    bandera = false;
                }
            }
        }
        
        // Perro
        if (bandera == false)
        {
            for (int i = 0; i < perro.getYears().length; i++) 
            {
                if (yearUser == perro.getYears()[i])
                {
                    bandera = true;
                    signo = "Perro";
                    
                    // Quitando referencia a objetos para liberar memoria
                    rata = null;
                    buey = null;
                    tigre = null;
                    liebre = null;
                    dragon = null;
                    serpiente = null;
                    caballo = null;
                    cabra = null;
                    gallo = null;
                    jabali = null;
                    
                    description = "Características del signo del Perro\n\n"
                            + "El Perro es considerado como uno de los animales más agradables\n"
                            + "dentro del horóscopo chino, con gran empatía, discreción y alto sentido del deber.\n"
                            + "La gente confía en los nativos del Perro por considerarles fieles e incondicionales\n"
                            + "con sus parientes y amigos. Manifiestan su cariño pero a la vez necesitan\n"
                            + "recibir manifestaciones de afecto, por eso disfrutan mucho\n"
                            + "de las situaciones nuevas y de las aventuras.";
                            
                    break;
                }
                else
                {
                    bandera = false;
                }
            }
        }
        
        // Jabali
        if (bandera == false)
        {
            for (int i = 0; i < jabali.getYears().length; i++) 
            {
                if (yearUser == jabali.getYears()[i])
                {
                    bandera = true;
                    signo = "Jabalí";
                    
                    // Quitando referencia a objetos para liberar memoria
                    rata = null;
                    buey = null;
                    tigre = null;
                    liebre = null;
                    dragon = null;
                    serpiente = null;
                    caballo = null;
                    cabra = null;
                    gallo = null;
                    perro = null;
                    
                    description = "Características del signo del Jabalí\n\n"
                            + "Si tu signo es el Jabalí estás dentro de ese grupo afortunado\n"
                            + "considerado uno de los más fuertes y valientes del horóscopo,\n"
                            + "pero al mismo tiempo nada arrogantes ni engreídos a pesar de su\n"
                            + "gran capacidad y fuerza.\n\n"
                            + "Poseen un gran sentido del sacrificio y recibirán estoicamente\n"
                            + "lo que la vida les depara, trabajarán con alegría y aceptación\n"
                            + "a pesar de las circunstancias adversas que puedan rodearles.";
                            
                    break;
                }
                else
                {
                    bandera = false;
                }
            }
        }
                
        signoChinoUser = new SignoChinoUser(signo, yearUser);
        return description;
    }

    public SignoChinoUser getSignoChinoUser()
    {
        return signoChinoUser;
    }
    
    public void imprimirSignoChino()
    {
        System.out.println(signoChinoUser.toString());
    }

    public Rata getRata() {
        return rata;
    }

    public Buey getBuey() {
        return buey;
    }

    public Tigre getTigre() {
        return tigre;
    }

    public Liebre getLiebre() {
        return liebre;
    }

    public Dragon getDragon() {
        return dragon;
    }

    public Serpiente getSerpiente() {
        return serpiente;
    }

    public Caballo getCaballo() {
        return caballo;
    }

    public Cabra getCabra() {
        return cabra;
    }

    public Mono getMono() {
        return mono;
    }

    public Gallo getGallo() {
        return gallo;
    }

    public Perro getPerro() {
        return perro;
    }

    public Jabali getJabali() {
        return jabali;
    }

    public String getSigno() {
        return signo;
    }
    
    
    
}
