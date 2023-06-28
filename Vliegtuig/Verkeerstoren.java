class Verkeerstoren {
    private VliegtuigManager vliegtuigManager;
    private boolean magVliegen;
    private int wind;

    Verkeerstoren(VliegtuigManager vliegtuigManager, boolean magVliegen, int wind) {
        this.vliegtuigManager = vliegtuigManager;
        this.magVliegen = magVliegen;
        this.wind = wind;
    }

    public void kanOpstijgen() {
        if (magVliegen == true) {
            if (vliegtuigManager.getGewicht() <= 1000 || wind > 50) {
                System.out.println("Vliegtuig Mag Vertrekken");
            } else {
                System.out.println("Vleigtuig Stopt!");
            }
        } else {
            System.out.println("Vliegtuig mag niet opstijgen");
        }
    }

    public int VluchtKosten() {
        return vliegtuigManager.VliegtuigLandingsKosten();
    }

    public int getWind() {
        return wind;
    }
}

