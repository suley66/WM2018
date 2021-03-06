
/**
 * Beschreiben Sie hier die Klasse Spiel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spiel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Mannschaften heimmannschaft;
    private Mannschaften gastmannschaft;
    private String datum;
    private String ort;
    private int heimtore;
    private int gasttore;

    /**
     * Konstruktor für Objekte der Klasse Spiel
     */
    public Spiel(Mannschaften heimmannschaft,Mannschaften gastmannschaft,String datum,String ort)
    {
        this.heimmannschaft = heimmannschaft;
        this.gastmannschaft = gastmannschaft;
        this.datum = datum;
        this.ort = ort;
    }
    
    public void setzeTore(int heim, int gast)
    {
        this.heimtore = heim;
        this.gasttore = gast;
    }
    
    public Mannschaften gewinner()
    {
        if(heimtore > gasttore)
        {
            return heimmannschaft;
        }
        else if(heimtore < gasttore)
        {
            return gastmannschaft;
        }
        else if(heimtore == gasttore)
        {
            return null;
        }
        return null;
    }

    public Mannschaften gibHeimMannschaft()
    {
        return heimmannschaft;
    }
    
    public Mannschaften gibGastMannschaft()
    {
        return gastmannschaft;
    }
    
    public String gibDatum()
    {
        return datum;
    }
    
    public String gibOrt()
    {
        return ort;
    }
}
