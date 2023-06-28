import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitTests {
@Test
    void testKanOpstijgen1() {
            Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", 900, 6);
            VliegtuigManager vliegtuigManager = new VliegtuigManager(vliegtuig, true);
            Verkeerstoren verkeerstoren = new Verkeerstoren(vliegtuigManager, true, 51);

            verkeerstoren.kanOpstijgen();
            // MC/DC: A is waar (gewicht <= 1000kg), B is waar (wind > 50 km/u) en C is waar (magVliegen)

            vliegtuig = new Vliegtuig("Cessna_172", "NL", 2000, 3);
            vliegtuigManager = new VliegtuigManager(vliegtuig, true);
            verkeerstoren = new Verkeerstoren(vliegtuigManager, false, 30);

            verkeerstoren.kanOpstijgen();
            // MC/DC: A is onwaar (gewicht <= 1000kg), B is onwaar (wind > 50 km/u) en C is onwaar (magVliegen)
            }
    @Test
    void testKanOpstijgen2() {
        Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", 900, 6);
        VliegtuigManager vliegtuigManager = new VliegtuigManager(vliegtuig, true);
        Verkeerstoren verkeerstoren = new Verkeerstoren(vliegtuigManager, true, 49);

        verkeerstoren.kanOpstijgen();
        // MC/DC: A is waar (gewicht <= 1000kg), B is onwaar (wind > 50 km/u) en C is waar (magVliegen)

        vliegtuig = new Vliegtuig("Cessna_172", "NL", 2000, 3);
        vliegtuigManager = new VliegtuigManager(vliegtuig, true);
        verkeerstoren = new Verkeerstoren(vliegtuigManager, true, 51);

        verkeerstoren.kanOpstijgen();
        // MC/DC: A is onwaar (gewicht <= 1000kg), B is waar (wind > 50 km/u) en C is waar (magVliegen)
    }
    @Test
    void testKanOpstijgen3() {
        Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", 900, 6);
        VliegtuigManager vliegtuigManager = new VliegtuigManager(vliegtuig, true);
        Verkeerstoren verkeerstoren = new Verkeerstoren(vliegtuigManager, false, 49);

        verkeerstoren.kanOpstijgen();
        // MC/DC: A is waar (gewicht <= 1000kg), B is onwaar (wind > 50 km/u) en C is onwaar (magVliegen)

        vliegtuig = new Vliegtuig("Cessna_172", "NL", 2000, 3);
        vliegtuigManager = new VliegtuigManager(vliegtuig, true);
        verkeerstoren = new Verkeerstoren(vliegtuigManager, true, 49);

        verkeerstoren.kanOpstijgen();
        // MC/DC: A is onwaar (gewicht <= 1000kg), B is onwaar (wind > 50 km/u) en C is waar (magVliegen)
    }
    @Test
    void testGewicht1(){
    Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", -1, 2);
    Verkeerstoren verkeerstoren = new Verkeerstoren(new VliegtuigManager(vliegtuig, true), true, 50);
    int expectedPrice = 19800;
    assertEquals(expectedPrice, verkeerstoren.VluchtKosten());

    }
    @Test
    void testGewicht2(){
        Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", 0, 2);
        Verkeerstoren verkeerstoren = new Verkeerstoren(new VliegtuigManager(vliegtuig, true), true, 50);
        int expectedPrice = 19800;
        assertEquals(expectedPrice, verkeerstoren.VluchtKosten());
    }
    @Test
    void testGewicht3(){
        Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", 999, 2);
        Verkeerstoren verkeerstoren = new Verkeerstoren(new VliegtuigManager(vliegtuig, true), true, 50);
        int expectedPrice = 19800;
        assertEquals(expectedPrice, verkeerstoren.VluchtKosten());
    }
    @Test
    void testGewicht4(){
        Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", 1000, 2);
        Verkeerstoren verkeerstoren = new Verkeerstoren(new VliegtuigManager(vliegtuig, true), true, 50);
        int expectedPrice = 28600;
        assertEquals(expectedPrice, verkeerstoren.VluchtKosten());
    }
    @Test
    void testGewicht5(){
        Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", 4999, 2);
        Verkeerstoren verkeerstoren = new Verkeerstoren(new VliegtuigManager(vliegtuig, true), true, 50);
        int expectedPrice = 28600;
        assertEquals(expectedPrice, verkeerstoren.VluchtKosten());
    }
    @Test
    void testGewicht6(){
        Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", 5000, 2);
        Verkeerstoren verkeerstoren = new Verkeerstoren(new VliegtuigManager(vliegtuig, true), true, 50);
        int expectedPrice = 72600;
        assertEquals(expectedPrice, verkeerstoren.VluchtKosten());
    }
    @Test
    void testGewicht7(){
        Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", 23420, 2);
        Verkeerstoren verkeerstoren = new Verkeerstoren(new VliegtuigManager(vliegtuig, true), true, 50);
        int expectedPrice = 72600;
        assertEquals(expectedPrice, verkeerstoren.VluchtKosten());
    }
    @Test
    void testPairwise1(){
        Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", 999, 2);
        Verkeerstoren verkeerstoren = new Verkeerstoren(new VliegtuigManager(vliegtuig, true), true, 50);
        int expectedPrice = 19800;
        assertEquals(expectedPrice, verkeerstoren.VluchtKosten());
    }
    @Test
    void testPairwise2(){
        Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", 999, 3);
        Verkeerstoren verkeerstoren = new Verkeerstoren(new VliegtuigManager(vliegtuig, false), true, 50);
        int expectedPrice = 3300;
        assertEquals(expectedPrice, verkeerstoren.VluchtKosten());
    }
    @Test
    void testPairwise3(){
        Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", 3000, 2);
        Verkeerstoren verkeerstoren = new Verkeerstoren(new VliegtuigManager(vliegtuig, true), true, 50);
        int expectedPrice = 28600;
        assertEquals(expectedPrice, verkeerstoren.VluchtKosten());
    }
    @Test
    void testPairwise4(){
        Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", 3000, 3);
        Verkeerstoren verkeerstoren = new Verkeerstoren(new VliegtuigManager(vliegtuig, false), true, 50);
        int expectedPrice = 16500;
        assertEquals(expectedPrice, verkeerstoren.VluchtKosten());
    }
    @Test
    void testPairwise5(){
        Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", 23420, 2);
        Verkeerstoren verkeerstoren = new Verkeerstoren(new VliegtuigManager(vliegtuig, false), true, 50);
        int expectedPrice = 55000;
        assertEquals(expectedPrice, verkeerstoren.VluchtKosten());
    }
    @Test
    void testPairwise6(){
        Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", 23420, 3);
        Verkeerstoren verkeerstoren = new Verkeerstoren(new VliegtuigManager(vliegtuig, true), true, 50);
        int expectedPrice = 100100;
        assertEquals(expectedPrice, verkeerstoren.VluchtKosten());
    }
}



