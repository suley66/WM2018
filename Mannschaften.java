import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Mannschaften.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mannschaften
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String mannschaftsName;
    private String trainer;
    private ArrayList<String> kader;

    /**
     * Konstruktor für Objekte der Klasse Mannschaften
     */
    public Mannschaften(String mannschaftsName, String trainer)
    {
        // Instanzvariable initialisieren
        this.mannschaftsName = mannschaftsName;
        this.trainer = trainer;
        kader = new ArrayList<String>();
    }
    
    public String gibName()
    
    {
        return mannschaftsName;
    }
    
    public String gibTrainer()
    {
        return trainer;
    }
    
    public void spielerHinzufuegen(String Spieler)
    {
        kader.add(Spieler);
    }
}
