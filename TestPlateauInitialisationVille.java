public class TestPlateauInitialisationVille{
    
    public static void main(String[] args){
        TestPlateauInitialisationVille testPlateauInitialisation = new TestPlateauInitialisationVille();
        testPlateauInitialisation.testeTailleTabVilles();
        testPlateauInitialisation.testeInitTabVilles();
    }
    
    /**
     * @since Incrément 1
     */
    void testeTailleTabVilles(){
        Plateau plateau = new Plateau();
        Test.assertEquals(plateau.getVilles().length, 36, "villes : taille du tableau = 36");
    }
    
    /**
     * @since Incrément 1
     */
    void testeInitTabVilles(){
        Plateau plateau = new Plateau();
        Test.assertEquals("Vancouver (94.0,15.0)",plateau.getVilles()[0].versChaine(), "Init Tab Ville => 1:Vancouver");
        Test.assertEquals("Duluth (538.0,102.0)",plateau.getVilles()[14].versChaine(), "Init Tab Ville => 15:Duluth");
        Test.assertEquals("Boston (876.0,150.0)",plateau.getVilles()[35].versChaine(), "Init Tab Ville => 36:Boston");
    }
    
}
