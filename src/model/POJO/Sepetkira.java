package model.POJO;
// Generated 02.Oca.2015 16:58:18 by Hibernate Tools 4.3.1



/**
 * Sepetkira generated by hbm2java
 */
public class Sepetkira  implements java.io.Serializable {


     private Integer ksepetId;
     private Urun urun;

    public Sepetkira() {
    }

    public Sepetkira(Urun urun) {
       this.urun = urun;
    }
   
    public Integer getKsepetId() {
        return this.ksepetId;
    }
    
    public void setKsepetId(Integer ksepetId) {
        this.ksepetId = ksepetId;
    }
    public Urun getUrun() {
        return this.urun;
    }
    
    public void setUrun(Urun urun) {
        this.urun = urun;
    }




}


