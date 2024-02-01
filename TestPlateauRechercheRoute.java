public class TestPlateauRechercheRoute{
	
	public static void main(String[] args) {
		TestPlateauRechercheRoute testPlateauRecherche = new TestPlateauRechercheRoute();
		testPlateauRecherche.testeRechercheRoute();
		testPlateauRecherche.testeRechercheRouteInexistante();
	}
	
	
	/**
	 * @since Incrément 1
	 * @EXTENSION
	 */
	void testeRechercheRoute(){
		Plateau plateau = new Plateau();
		Test.assertEquals(plateau.rechercheRoute("Little Rock - New Orleans").getNom(),"Little Rock - New Orleans", "Recherche Route => Little Rock - New Orleans");
	}
	
	/**
	 * @since Incrément 1
	 * @EXTENSION
	 */
	void testeRechercheRouteInexistante(){
		Plateau plateau = new Plateau();
		Test.assertEquals(plateau.rechercheRoute("Paris - Marseille"),null, "Recherche Route => Paris - Marseille n'est pas une route du plateau" );
	}
}
