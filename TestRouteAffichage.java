public class TestRouteAffichage {
	
	public static void main(String[] args) {
		TestRouteAffichage testRouteAffichage = new TestRouteAffichage();
		testRouteAffichage.testeVersChaine();
	}

	/**
	 * @since Incrément 1
	 */
	void testeVersChaine(){
		Ville vancouver = new Ville("Vancouver", 94.0, 15.0);
		Ville seattle = new Ville("Seattle", 88.0, 52.0);
		Route route = new Route(vancouver,seattle,"gris");

		/*Test visuel de l'affichage*/
		System.out.println(route.versChaine());
		/*Test automatique de l'affichage*/
		Test.assertEquals(route.versChaine(),"Vancouver - Seattle /gris-1", "Affichage Route => Vancouver - Seattle est de couleur gris et de taille 1");
	}
}
