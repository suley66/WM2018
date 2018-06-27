import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Gruppe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Gruppe
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private ArrayList<Mannschaften> mannschaften;
    private Spiel spiele;

    /**
     * Konstruktor für Objekte der Klasse Gruppe
     */
    public Gruppe(String name)
    {
        this.name = name;
        mannschaften = new ArrayList<Mannschaften>();
    }

    public void mannschaftHinzufuegen(Mannschaften mannschaft)
    {
        mannschaften.add(mannschaft);
    }
    
    
}
