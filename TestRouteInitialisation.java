public class TestRouteInitialisation {
	
	public static void main(String[] args) {
		TestRouteInitialisation testRouteInitialisation = new TestRouteInitialisation();
		testRouteInitialisation.testeRouteInitialisation();
	}

	/**
	 * @since Incrément 1
	 */
	void testeRouteInitialisation(){
		Ville vancouver = new Ville("Vancouver", 94.0, 15.0);
		Ville seattle = new Ville("Seattle", 88.0, 52.0);
		Route route = new Route(vancouver,seattle,"gris");
		Test.assertEquals(route.getNom(),"Vancouver - Seattle","Initialisation Route : nom = Vancouver - Seattle");
		Test.assertEquals(route.getVilleDepart(),vancouver,"Initialisation Route : ville départ = Vancouver");
		Test.assertEquals(route.getVilleArrivee(),seattle,"Initialisation Route : ville arrivée = Seattle");
		Test.assertEquals(route.getVilleArrivee(),seattle,"Initialisation Route : couleur = gris");
		Test.assertEquals("gris", route.getCouleur(),"Initialisation Route : couleur = gris");
		Test.assertEquals(1, route.getLongueur(),"Initialisation Route : longueur = 1");
		Test.assertEquals(1, route.getNombrePoints(),"Initialisation Route : nombre points = 1");
	}
}
