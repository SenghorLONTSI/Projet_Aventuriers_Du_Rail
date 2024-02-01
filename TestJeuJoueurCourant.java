public class TestJeuJoueurCourant {

	public static void main(String[] args) {
		TestJeuJoueurCourant testJeuCreerJoueur = new TestJeuJoueurCourant();
		testJeuCreerJoueur.testeJeuCreerJoueursJoueurCourant();
	}
	
	/**
	 * @since Incrément 2
	 */
	void testeJeuCreerJoueursJoueurCourant(){
		Jeu jeu = new Jeu();
		jeu.creeJoueurs(5);
		Test.assertEquals(jeu.getJoueurCourant().getNumero(),0, "Jeu Joueur Courant => numero  = 0");
		Test.assertEquals(jeu.getJoueurCourant().getCouleur(), "bleu", "Jeu Joueur Courant => couleur = bleu");
	}
}