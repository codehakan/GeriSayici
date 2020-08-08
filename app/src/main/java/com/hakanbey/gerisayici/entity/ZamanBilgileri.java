package com.hakanbey.gerisayici.entity;

public class ZamanBilgileri {
    private String baslik;
    private int gun;
    private int saat;
    private int dakika;
    private int saniye;
    private String bitis_tarihi;

    public ZamanBilgileri(){

    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public int getGun() {
        return gun;
    }

    public void setGun(int gun) {
        this.gun = gun;
    }

    public int getSaat() {
        return saat;
    }

    public void setSaat(int saat) {
        this.saat = saat;
    }

    public int getDakika() {
        return dakika;
    }

    public void setDakika(int dakika) {
        this.dakika = dakika;
    }

    public int getSaniye() {
        return saniye;
    }

    public void setSaniye(int saniye) {
        this.saniye = saniye;
    }

    public String getBitis_tarihi() {
        return bitis_tarihi;
    }

    public void setBitis_tarihi(String bitis_tarihi) {
        this.bitis_tarihi = bitis_tarihi;
    }
}
