
/**
 * Write a description of class Joueur here.
 *
 * @author (Senghor LONTSI)
 * @version (a version number or a date)
 */
public class Joueur
{
    // instance variables - replace the example below with your own
    int numero;
    String couleur;
    int nombreWagons;
    int score;

    /**
     * Constructor for objects of class Joueur
     */
    public Joueur(int numero,String couleur)
    {
        // initialise instance variables
        this.numero=numero;
        this.couleur=couleur;
        this.nombreWagons=nombreWagons;
        this.score=score;
    }
    int getNumero()
    {
        return this.numero;
    }
    String getCouleur(){
        return this.couleur;
    }
    int getNombreWagons(){
        return this.nombreWagons;
    }
    int getScore(){
        return this.score;
    }
    

    
}
