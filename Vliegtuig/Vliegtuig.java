class Vliegtuig {
    private String naam;
    private String country;
    private int gewicht;
    private int aantalPassagiers;

    Vliegtuig(String naam, String country, int gewicht, int aantalPassagiers) {
        this.naam = naam;
        this.country = country;
        this.gewicht = gewicht;
        this.aantalPassagiers = aantalPassagiers;
    }

    public String getNaam() {
        return naam;
    }

    public String getCountry() {
        return country;
    }

    public int getGewicht() {
        return gewicht;
    }

    public int getAantalPassagiers() {
        return aantalPassagiers;
    }
}