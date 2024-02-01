

public class TestVilleAffichage {

	public static void main(String[] args) {
		TestVilleAffichage testVilleAffichage = new TestVilleAffichage();
		testVilleAffichage.testeVilleAffichage();
	}
	
	/**
	 * @since Incrément 1
	 */
	void testeVilleAffichage(){
		Ville ville = new Ville("Vancouver",94.0,15.0);
		Test.assertEquals(ville.versChaine(),"Vancouver (94.0,15.0)","Affichage Ville => Vancouver aux coordonnees (94.0,15.0)");
	}
}
