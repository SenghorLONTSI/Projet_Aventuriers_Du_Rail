public class TestPlateauRechercheVille{
	
	public static void main(String[] args) {
		TestPlateauRechercheVille testPlateauRecherche = new TestPlateauRechercheVille();
		testPlateauRecherche.testeRechercheVille();
		testPlateauRecherche.testeRechercheVilleInexistante();
	}
	
	/**
	 * @since Incrément 1
	 */
	void testeRechercheVille(){
		Plateau plateau = new Plateau();
		Test.assertEquals(plateau.rechercheVille("Boston").versChaine(),"Boston (876.0,150.0)", "Recherche Ville => Boston (876.0,150.0)");
	}
	
	/**
	 * @since Incrément 1
	 */
	void testeRechercheVilleInexistante(){
		Plateau plateau = new Plateau();
		Test.assertEquals(plateau.rechercheVille("Paris"),null, "Recherche Ville => Paris n'existe pas sur le plateau");
	}
	
	
}
