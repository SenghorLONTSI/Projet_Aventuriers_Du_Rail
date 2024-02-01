/**
 * La classe Plateau représente le plateau de jeu des Aventuriers du Rail.
 * Il se compose d'un ensemble d'objets {@link Etat}, d'un ensemble d'objets {@link Ville} et d'un
 * ensemble d'objets {@link Route}.
 * @since Incrément 1
 * @ACOMPLETER
 */
class Plateau {

    /**
     * La liste des états du plateau de jeu
     * @FOURNI
     */
    Etat[] etats;
    Ville[] villes;
    Route[] routes;
    
    /** 
     * Crée le plateau de jeu
     */
    Plateau() {
        initialiseEtats(); // @FOURNI
        initialiseVilles();
        initialiseRoutes();
        //TODO
    }
    
    // ACCESSEURS
    /**
     * , @return les états du plateau de jeu
     * @FOURNI
     */
    Etat[] getEtats() {
        return this.etats;
    }
    public Ville[] getVilles(){
        return this.villes;
    }
    Route[] getRoutes(){
        return this.routes;
    }
    
    /**
     * Initialise l'ensemble des états du jeu à partir des données fournies (
     * {@link Donnees#ETATS}) Les données utilisées sont transformées pour
     * isoler le nom de l'état et son "contour".
     * @FOURNI
     */
    void initialiseEtats() {
        this.etats = new Etat[Donnees.ETATS.length];
        for(int i=0;i<Donnees.ETATS.length;i++){
            this.etats[i] = new Etat(Donnees.ETATS[i][0],Donnees.ETATS[i][1]);
        }
    }
    void initialiseVilles(){
        this.villes=new Ville[Donnees.VILLES.length];
        for(int i=0;i<Donnees.VILLES.length;i++){
            String[] s=Donnees.VILLES[i].split(" ");
            String nom;
            double X ;
            double Y;
            
            if(s.length==5){
                nom=s[0]+" "+s[1]+" "+" "+s[2];
                X=Double.parseDouble(s[3]);
                Y=Double.parseDouble(s[4]);
                }
             else if(s.length==4){
                nom=s[0]+" "+s[1];
                X=Double.parseDouble(s[2]);
                Y=Double.parseDouble(s[3]);
            }else{
                nom=s[0];
                X=Double.parseDouble(s[1]);
                Y=Double.parseDouble(s[2]);
                
            }
            
            //Y = Double.parseDouble(s[s.length-1]);
            //X = Double.parseDouble(s[s.length-2]);
            //for (int j=0; j<s.length-2;j++) {
            //    nom = nom + s[j]+ " ";
            //}
        this.villes[i]=new Ville(nom,X,Y);
        }
    }
    
    
    public  Ville rechercheVille(String nom){
        
        for(int i=0;i<this.getVilles().length;i++){
            if(nom.equals(this.getVilles()[i].getNom())){
                return this.getVilles()[i] ;
            }
        } 
            
        return new Ville("inconnu",0.0,0.0);
        
    }
    public void  initialiseRoutes(){
        this.routes= new Route[Donnees.ROUTES.length];
        for(int i=0;i<Donnees.ROUTES.length;i++){
             String[] str=Donnees.ROUTES[i];
            Ville villeDepart=rechercheVille(str[0]);
            Ville villeArrivee=rechercheVille(str[1]);
            String Couleur=str[2];
            this.routes[i]=new Route(villeDepart,villeArrivee, Couleur);
              }
}


  public Route rechercheRoute(String nomRoute){
      initialiseRoutes();
      int i=0;
      boolean found=false;
      while(i<Donnees.ROUTES.length && !found){
          if(this.getRoutes()[i].getNom().equals(nomRoute)){
              found=true;
      }i++;
    }
      if(found){
          return this.routes[--i];
      }
    return null;
      
      
      
}


  
}



     
   
    













