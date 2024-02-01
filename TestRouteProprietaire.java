public class TestRouteProprietaire {
	
	public static void main(String[] args) {
		TestRouteProprietaire testRouteProprietaire = new TestRouteProprietaire();
		testRouteProprietaire.testeRouteProprietaireInit();
		testRouteProprietaire.testeRouteProprietaireJoueur();
		testRouteProprietaire.testeRouteProprietaireChangement();
	}

	/**
	 * @since Incrément 3
	 */
	void testeRouteProprietaireInit(){
		Ville vancouver = new Ville("Vancouver", 94.0, 15.0);
		Ville seattle = new Ville("Seattle", 88.0, 52.0);
		Route route = new Route(vancouver,seattle,"gris");
		
		Test.assertEquals(route.getProprietaire(),null, "Propietaire Route Init => aucun proprietaire");
	}
	
	/**
	 * @since Incrément 3
	 */
	void testeRouteProprietaireJoueur(){
		Ville vancouver = new Ville("Vancouver", 94.0, 15.0);
		Ville seattle = new Ville("Seattle", 88.0, 52.0);
		Route route = new Route(vancouver,seattle,"gris");
		Joueur joueur = new Joueur(0,"bleu");
		route.setProprietaire(joueur);
		
		Test.assertEquals(route.getProprietaire(),joueur, "Propietaire Route Proprietaire => joueur bleu");
	}
	
	/**
	 * @since Incrément 3
	 */
	void testeRouteProprietaireChangement(){
		Ville vancouver = new Ville("Vancouver", 94.0, 15.0);
		Ville seattle = new Ville("Seattle", 88.0, 52.0);
		Route route = new Route(vancouver,seattle,"gris");
		Joueur joueur = new Joueur(0,"bleu");
		Joueur joueur2 = new Joueur(1,"rouge");
		route.setProprietaire(joueur);
		
		Test.assertEquals(route.getProprietaire(),joueur, "Propietaire Route Proprietaire => joueur bleu");
		route.setProprietaire(joueur2);
		Test.assertEquals(route.getProprietaire(),joueur2, "Propietaire Route Proprietaire => joueur rouge");
	}
}