public class TestPlateauInitialisationRoute{
	
	public static void main(String[] args) {
		TestPlateauInitialisationRoute testPlateauInitialisation = new TestPlateauInitialisationRoute();
		testPlateauInitialisation.testeTailleTabRoutes();
		testPlateauInitialisation.testeInitTabRoutes();
	}
	
	/**
	 * @since Incrément 1
	 */
	void testeTailleTabRoutes(){
		Plateau plateau = new Plateau();
		Test.assertEquals(plateau.getRoutes().length, 78, "routes : taille du tableau = 78");		
	}

	
	/**
	 * @since Incrément 1
	 */
	void testeInitTabRoutes(){
		Plateau plateau = new Plateau();
		Test.assertEquals(plateau.getRoutes()[0].getNom(),"Vancouver - Seattle", "Init Tab Route => Vancouver - Seattle");
		Test.assertEquals(plateau.getRoutes()[53].getNom(),"Little Rock - New Orleans", "Init Tab Route => Little Rock - New Orleans");
		Test.assertEquals(plateau.getRoutes()[77].getNom(),"New York - Washington", "Init Tab Route => New York - Washington");
	}
}
