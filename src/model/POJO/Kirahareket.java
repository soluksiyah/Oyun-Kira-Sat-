package model.POJO;
// Generated 24.Ara.2014 00:38:24 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Kirahareket generated by hbm2java
 */
public class Kirahareket  implements java.io.Serializable {


     private Integer kiraHareketId;
     private Musteri musteri;
     private Urun urun;
     private Date kiraBaslangicTarih;
     private Date kiraSonTarih;
     private int kiraFiyat;
     
     private int ID;
     private String Urunler;
     private String Musteriler;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUrunler() {
        return Urunler;
    }

    public void setUrunler(String Urunler) {
        this.Urunler = Urunler;
    }

    public String getMusteriler() {
        return Musteriler;
    }

    public void setMusteriler(String Musteriler) {
        this.Musteriler = Musteriler;
    }
     

    public Kirahareket() {
    }

    public Kirahareket(Musteri musteri, Urun urun, Date kiraBaslangicTarih, Date kiraSonTarih, int kiraFiyat) {
       this.musteri = musteri;
       this.urun = urun;
       this.kiraBaslangicTarih = kiraBaslangicTarih;
       this.kiraSonTarih = kiraSonTarih;
       this.kiraFiyat = kiraFiyat;
    }
   
    public Integer getKiraHareketId() {
        return this.kiraHareketId;
    }
    
    public void setKiraHareketId(Integer kiraHareketId) {
        this.kiraHareketId = kiraHareketId;
    }
    public Musteri getMusteri() {
        return this.musteri;
    }
    
    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }
    public Urun getUrun() {
        return this.urun;
    }
    
    public void setUrun(Urun urun) {
        this.urun = urun;
    }
    public Date getKiraBaslangicTarih() {
        return this.kiraBaslangicTarih;
    }
    
    public void setKiraBaslangicTarih(Date kiraBaslangicTarih) {
        this.kiraBaslangicTarih = kiraBaslangicTarih;
    }
    public Date getKiraSonTarih() {
        return this.kiraSonTarih;
    }
    
    public void setKiraSonTarih(Date kiraSonTarih) {
        this.kiraSonTarih = kiraSonTarih;
    }
    public int getKiraFiyat() {
        return this.kiraFiyat;
    }
    
    public void setKiraFiyat(int kiraFiyat) {
        this.kiraFiyat = kiraFiyat;
    }




}


