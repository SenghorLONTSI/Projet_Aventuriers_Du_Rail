/**
 * La classe Ville représente une ville du jeu des Aventuriers du Rail.
 * Une ville dispose d'un nom, d'une abscisse et d'une ordonnée pour l'affichage
 * sur la carte.
 * @since Incrément 1
 * @ACOMPLETER
 */
class Ville{
    String nom;
    double x,y;
    Ville(String nom,double x,double y){
        this.x=x;
        this.y=y;
        this.nom=nom;
    }
    double getX(){
        return this.x;
    }
    double getY(){
        return this.y;
    }
    String getNom(){
        return this.nom;
    }
    String versChaine(){
        String s=" ";
        s= this.nom + "("+ this.x + ","+ this.y + ")";
        return s;
    }
}

