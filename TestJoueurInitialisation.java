public class TestJoueurInitialisation {

	public static void main(String[] args) {
		TestJoueurInitialisation testJoueurInitialisation = new TestJoueurInitialisation();
		testJoueurInitialisation.testeJoueurInitialisation();
	}

	/**
	 * @since Incrément 2
	 */
	void testeJoueurInitialisation(){
		Joueur joueur = new Joueur(1,"bleu");
		Test.assertEquals(joueur.getCouleur(),"bleu", "Init Joueur => couleur = bleu");
		Test.assertEquals(joueur.getNumero(),1, "Init Joueur => numero = 1");
		Test.assertEquals(joueur.getNombreWagons(),45, "Init Joueur => nombre de wagons = 45");
		Test.assertEquals(joueur.getScore(),0, "Init Joueur => score = 0");
	}
}
