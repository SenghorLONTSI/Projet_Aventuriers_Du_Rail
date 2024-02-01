/**
 * La classe Route représente une route dans le jeu des Aventuriers du Rail.
 * Une route dispose d'une ville de départ, d'une ville d'arrivée et d'une couleur.
 * A partir de l'incrément 3, une route pourra être possédée par un joueur.
 * @since Incrément 1
 * @ACOMPLETER
 */
class Route{
    String couleur;
    Ville villeDepart;
    Ville VilleArrivee;
    Joueur joueur;
    Route(Ville villeDepart, Ville VilleArrivee , String couleur){
        this.couleur=couleur;
        this.villeDepart=villeDepart;
        this.VilleArrivee=VilleArrivee;
    }
    String getCouleur(){
        return this.couleur;    
    }
    Ville getVilleDepart(){
        return this.villeDepart;
    }
    Ville getVilleArrivee(){
        return this.VilleArrivee;
    }
    String getNom(){
        String s;
        s=villeDepart.getNom() + " - "+ VilleArrivee.getNom();
        return s;
    }
    int getLongueur(){
        double longu,x1,y1;
        int val;
        x1= (villeDepart.getX() - VilleArrivee.getX());
        y1= (villeDepart.getY() - VilleArrivee.getY());
        longu=(Math.sqrt((x1*x1)+ (y1*y1)));
        val=(int)((longu)/33);
        if(val<6)
            return val;
        else
            return 6 ;
    }
    String versChaine(){
        String s="";
        s=s+getNom()+" /"+getCouleur()+"-"+getLongueur();
        return s;
    }
    int getNombrePoints(){
         int n  ;
         n=getLongueur();
         if(n==1)
             return 1;
         else
             if(n==2)
                 return 2;
             else
                 if(n==3)
                     return 4;
                 else
                     if(n==4)
                         return 7;
                     else
                         if(n==5)
                             return 10;
                         else
                             return 15;
         
         
         /*switch(n){
             case 1:
                 return  1;
             case 2:
                 return  2;
             case 3:
                 return  4;
             case 4:
                 return  7;
             case 5:
                 return  10;
             case 6:
                 return  15;
         }*/
          
    }
    Joueur getProprietaire(){
        return this.joueur;
    }
    void setProprietaire(Joueur proprietaire){
        proprietaire=getProprietaire();
    }
}

