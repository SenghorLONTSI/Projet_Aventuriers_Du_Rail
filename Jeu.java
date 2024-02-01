
 /**
 * La classe Jeu intègre les classes du jeu des Aventuriers du Rail et implémente la
 * mécanique de jeu détaillée dans les règles du jeu original.
 * Les différentes versions de cette classe permet de réaliser les objectifs fixés
 * par les huit incréments du Projet.
 * @ACOMPLETER
 */
import java.util.Random;
class Jeu {
    /**
     * Le plateau de jeu
     * @since Incrément 1
     * @FOURNI
     */
    Plateau plateau;
    int indiceJoueurCourant;
    Joueur joueur;
    Joueur[] joueurs;
    boolean dernierTour ;
    Route route;

    /**
     * L'interface graphique du jeu
     * @since Incrément 1
     * @FOURNI
     */
    IHM ihm;

    // ACCESSEURS
    /**
     * @return le plateau de jeu
     * @since Incrément 1
     * @FOURNI
     */
    Plateau getPlateau(){
        return this.plateau;
    }

    /**
     * Crée le jeu des Aventuriers du Rail.
     * Initialise le plateau de jeu et l'interface homme-machine (IHM)
     * @since Incrément 1
     * @FOURNI
     */
    Jeu(){
        plateau = new Plateau();
        ihm = new IHM();
        this.indiceJoueurCourant=indiceJoueurCourant;
        this.dernierTour = false;
    }
    void affichePlateau(){
        // FOURNI
        this.ihm.afficheFenetre("Les Aventuriers du Rail",1366,768,"lightGray");
        for(Etat e : plateau.getEtats()){
            this.ihm.dessineEtat(e);
        }
        // TODO Afficher les villes et les routes
        for(Route r : plateau.getRoutes()){
            this.ihm.dessineRoute(r);
        }
        
            for(Ville v : plateau.getVilles()){
            this.ihm.dessineVille(v);
        }
        
        
}
Joueur getJoueurCourant(){
   if(joueur.getNumero()==(indiceJoueurCourant)){
        return this.joueur;
    }
    return null;
}
void creeJoueurs(int NombreJoueur){
    this.joueurs= new Joueur[NombreJoueur];
    Random rand = new Random();
    int j=rand.nextInt(NombreJoueur);
    /*int j=0;
    while(j<NombreJoueur){
        this.joueurs[(i+1)%NombreJoueur]=new Joueur((i+1)%NombreJoueur,Donnees.COULEURS_JOUEUR[i]);
        j++;
    }*/
    
    for(int i=0;i<NombreJoueur;i++){
        this.joueurs[i]=new Joueur(i,Donnees.COULEURS_JOUEUR[i]);
        
    }
    indiceJoueurCourant=j;
}
Joueur[] getJoueurs(){
    return this.joueurs;
    
}
void changerJoueur(){
    indiceJoueurCourant=(indiceJoueurCourant+1)%this.getJoueurs().length;
}
void afficheJoueurCourant(){
    //IHM t=new IHM;
    ihm.afficheInformation("joueur  " + this.indiceJoueurCourant,100,480,true,Donnees.COULEURS_JOUEUR[this.indiceJoueurCourant]);
    //ihm.afficheInformation("Score "+0/*+joueur.getScore()*/ ,100,490,true,"Blue");
    //ihm.afficheInformation("NombreWagon "+45/*joueur.getNombreWagons()*/ ,100,500,true,"Blue");
}
void tourDeJeu(){
    afficheJoueurCourant();
    demandeAction();
    this.ihm.effaceInformation();
    
}
void demandeAction(){
    this.ihm.effaceBoutons();
    this.ihm.dessineBoutonSuivant(false);
    //selectionRoute(route.getNom());
     ActionUtilisateur reponse = this.ihm.attenteActionJoueur();
     switch(reponse.getType()){
     case FINTOUR : // A COMPLETER
         changerJoueur();
         //dernierTour=false;
     break;
     default : break;
    
}
}
void selectionRoute(String s){
    demandeAction();
    if(route.getProprietaire()!=null){
        this.ihm.afficheMessageErreur("erreur la route a un p roprietaire");
    }
    else{
        route.setProprietaire(getJoueurCourant());
        affichePlateau();
    }
}
    

    /**
     * Méthode principale de la classe Jeu
     * Lance le jeu des Aventuriers du Rail et implémente le déroulement prévu par les
     * règles du jeu et la modélisation associée (voir Diagrammes d'activité UML)
     * @since Incrément 1
     * @param args les paramètres de l'application
     */
    public static void main(String[] args){
        Jeu j= new Jeu();
        j.affichePlateau();
        j.creeJoueurs(5);
        while(!j.dernierTour){
        //j.afficheJoueurCourant();
        j.tourDeJeu();
        }
        
    }
}
