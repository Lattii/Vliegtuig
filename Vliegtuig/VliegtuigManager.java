public class VliegtuigManager {
    private Vliegtuig vliegtuig;
    private boolean bagageLoopband;
    VliegtuigManager(Vliegtuig vliegtuig, boolean bagageLoopband) {
        this.vliegtuig = vliegtuig;
        this.bagageLoopband = bagageLoopband;
    }

    public int VliegtuigLandingsKosten() {
        int prijs = BerekenGewichtPrijs();

        if (vliegtuig.getAantalPassagiers() > 2) {
            prijs *= 1.5;
        }
        if (bagageLoopband == true) {
            prijs += 800;
        }
        if (vliegtuig.getCountry().equals("NL")) {
            int btw = prijs * 21;
            prijs += btw;
        }
        return prijs;
    }

    private int BerekenGewichtPrijs() {
        int gewicht = vliegtuig.getGewicht();

        if (gewicht < 1000) {
            return 100;
        } else if (gewicht >= 1000 && gewicht < 5000) {
            return 500;
        } else if (gewicht >= 5000) {
            return 2500;
        }
        return 0;
    }

    public int getGewicht() {
        return vliegtuig.getGewicht();
    }

    public boolean getBagageLoopband() {
        return bagageLoopband;
    }
}