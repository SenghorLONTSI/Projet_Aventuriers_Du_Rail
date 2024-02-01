

public class TestVilleInitialisation {

	public static void main(String[] args) {
		TestVilleInitialisation testVilleInitialisation = new TestVilleInitialisation();
		testVilleInitialisation.testeVilleInitialisation();
	}
	
	/**
	 * @since Incrément 1
	 */
	void testeVilleInitialisation(){
		Ville ville = new Ville("Vancouver",94.0,15.0);
		
		/*Tester les différents accesseurs afin de vérifier la bonne 
		 *initialisation de chacun des attributs de la classe
		 */
		Test.assertEquals(ville.getX(),94.0,"Init Ville => coordonnées x = 94.0");
		Test.assertEquals(ville.getY(),15.0,"Init Ville => coordonnées y = 15.0");
		Test.assertEquals(ville.getNom(),"Vancouver","Init Ville => nom = Vancouver");
	}
}
