class Main {
    public static void main(String[] args){
        Vliegtuig vliegtuig = new Vliegtuig("Cessna_172", "NL", 1555, 3);
        VliegtuigManager vliegtuigManager = new VliegtuigManager(vliegtuig, true);
        Verkeerstoren verkeer = new Verkeerstoren(vliegtuigManager, true, 51);

        System.out.println("Vlucht: " + vliegtuig.getNaam() + " Land: " + vliegtuig.getCountry());
        System.out.println("Gewicht: " + vliegtuig.getGewicht() + "Kg");
        System.out.println("BagageLoopBand Actief: " + vliegtuigManager.getBagageLoopband());
        System.out.println("Wind Snelheid (km/h): " + verkeer.getWind());
        System.out.println("Landings Kosten: $" + verkeer.VluchtKosten());
        verkeer.kanOpstijgen();
    }
}
