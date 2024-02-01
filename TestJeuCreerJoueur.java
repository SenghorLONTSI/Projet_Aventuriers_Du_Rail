public class TestJeuCreerJoueur {

	public static void main(String[] args) {
		TestJeuCreerJoueur testJeuCreerJoueur = new TestJeuCreerJoueur();
		testJeuCreerJoueur.testeJeuCreerJoueursInitialisation();
		testJeuCreerJoueur.testeJeuCreerJoueursJoueurCourant();
	}

	/**
	 * @since Incrément 2
	 */
	void testeJeuCreerJoueursInitialisation(){
		Jeu jeu = new Jeu();
		jeu.creeJoueurs(5);
		Test.assertEquals(jeu.getJoueurs().length,5,"Jeu Init Joueurs => Taille du tableau de joueurs = 5");
		Test.assertEquals(jeu.getJoueurs()[0].getNumero(),0, "Jeu Init Joueurs => 1er joueur : numero = 0");
		Test.assertEquals(jeu.getJoueurs()[0].getCouleur(), "bleu", "Jeu Init Joueurs => 1er joueur : bleu");
		Test.assertEquals(jeu.getJoueurs()[2].getNumero(),2, "Jeu Init Joueurs => 3e joueur : numero = 2");
		Test.assertEquals(jeu.getJoueurs()[2].getCouleur(), "vert", "Jeu Init Joueurs => 3e joueur : vert");
		Test.assertEquals(jeu.getJoueurs()[4].getNumero(),4, "Jeu Init Joueurs => 5e joueur : numero = 4");
		Test.assertEquals(jeu.getJoueurs()[4].getCouleur(), "noir", "Jeu Init Joueurs => 5e joueur : noir");
		
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
