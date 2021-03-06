package model.POJO;
// Generated Dec 24, 2014 1:02:19 AM by Hibernate Tools 4.3.1

import java.util.Date;




/**
 * Urun generated by hbm2java
 */
public class Urun  implements java.io.Serializable {


     private Integer urunId;
     private Kategori kategori;
     private Platform platform;
     private String urunAdi;
     private int urunKiraFiyat;
     private int urunSatisFiyat;
     private byte[] urunResim;
     private int urunAdet;
     private int ID;
     private String Kat;
     private String Plat;
     private Date KiraBasTarih;
     private Date KiraSonTarih;
    

    public Urun() {
    }

    public Urun(Kategori kategori, Platform platform, String urunAdi, int urunKiraFiyat, int urunSatisFiyat, byte[] urunResim, int urunAdet) {
       this.kategori = kategori;
       this.platform = platform;
       this.urunAdi = urunAdi;
       this.urunKiraFiyat = urunKiraFiyat;
       this.urunSatisFiyat = urunSatisFiyat;
       this.urunResim = urunResim;
       this.urunAdet = urunAdet;
    }
   
    public Integer getUrunId() {
        return this.urunId;
    }
    
    public void setUrunId(Integer urunId) {
        this.urunId = urunId;
    }
    public Kategori getKategori() {
        return this.kategori;
    }
    
    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }
    public Platform getPlatform() {
        return this.platform;
    }
    
    public void setPlatform(Platform platform) {
        this.platform = platform;
    }
    public String getUrunAdi() {
        return this.urunAdi;
    }
    
    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }
    public int getUrunKiraFiyat() {
        return this.urunKiraFiyat;
    }
    
    public void setUrunKiraFiyat(int urunKiraFiyat) {
        this.urunKiraFiyat = urunKiraFiyat;
    }
    public int getUrunSatisFiyat() {
        return this.urunSatisFiyat;
    }
    
    public void setUrunSatisFiyat(int urunSatisFiyat) {
        this.urunSatisFiyat = urunSatisFiyat;
    }
    public byte[] getUrunResim() {
        return this.urunResim;
    }
    
    public void setUrunResim(byte[] urunResim) {
        this.urunResim = urunResim;
    }
    public int getUrunAdet() {
        return this.urunAdet;
    }
    
    public void setUrunAdet(int urunAdet) {
        this.urunAdet = urunAdet;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getKat() {
        return Kat;
    }

    public void setKat(String Kat) {
        this.Kat = Kat;
    }

    public String getPlat() {
        return Plat;
    }

    public void setPlat(String Plat) {
        this.Plat = Plat;
    }

    public Date getKiraBasTarih() {
        return KiraBasTarih;
    }

    public void setKiraBasTarih(Date KiraBasTarih) {
        this.KiraBasTarih = KiraBasTarih;
    }

    public Date getKiraSonTarih() {
        return KiraSonTarih;
    }

    public void setKiraSonTarih(Date KiraSonTarih) {
        this.KiraSonTarih = KiraSonTarih;
    }

    
    
    

}


