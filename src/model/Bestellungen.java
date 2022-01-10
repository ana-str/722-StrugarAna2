package model;

import java.util.List;

public class Bestellungen {
    private int bestellnr;
    private String adresse;
    private List<Produkt> produkteList;

    public Bestellungen(int bestellnr, String adresse, List<Produkt> produkteList) {
        this.bestellnr = bestellnr;
        this.adresse = adresse;
        this.produkteList = produkteList;
    }

    @Override
    public String toString() {
        return "Bestellungen{" +
                "bestellnr=" + bestellnr +
                ", adresse='" + adresse + '\'' +
                ", produktList=" + produkteList +
                '}';
    }

    public int getBestellnr() {
        return bestellnr;
    }

    public void setBestellnr(int bestellnr) {
        this.bestellnr = bestellnr;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Produkt> getProdukteList() {
        return produkteList;
    }

    public void setProdukteList(List<Produkt> produkteList) {
        this.produkteList = produkteList;
    }


}
