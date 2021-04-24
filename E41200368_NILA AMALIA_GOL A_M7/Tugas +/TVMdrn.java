/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsibd_m7_nila;

/**
 *
 * @author Nila Amalia
 */
public class TVMdrn extends TV {
    public TVMdrn(String n, String deskripsi, int TChannel) {
        super(n, deskripsi, TChannel);
    }
    
    static String TELETxt = "Teletxt";
    static String TV = "Televisi";
    
    public void setModusTampilan(String t) {
        this.TELETxt = t;
    }
    
    public void getModusTampilan() {
        System.out.println("Modus tampilan : " + TV);
    }
    
    public void setHlmnTeletxt(int t) {
        System.out.println("Berpindah ke-teletext " + t);
    }
    
    //    CD
    
    String cd = "";
    public void setDiscTray(String d) {
        this.cd = d;
    }
    
    public void playcd() {
        if (cd.equals("")) {
            System.out.println("CD tidak ditemukan");
        } else {
            System.out.println("Memutar film " + cd);
        }
    }
    
    
    public static void main(String[] args) {
        
        TVMdrn Nila = new TVMdrn("Nila Syantix", "TV Polytron, Warna Merah", 11);
 
        String[] channel = {"SCTV", "TransTV", "TVONE", "RCTI", "GlobalTV",
                             "KompasTV", "MOPChanel", "JTV", "NilaPunya", 
                             "Indosiar","ANTV"};
        
        
        Nila.getdeskripsi();
        Nila.getchannel();
        Nila.setchannel(channel);
        Nila.setCAktif(4);
        Nila.setvlm(70);
        Nila.setCAktif(11);
        Nila.setCAktif(1);
        Nila.setModusTampilan(TVMdrn.TELETxt);
        Nila.setHlmnTeletxt(225);
        Nila.setModusTampilan(TVMdrn.TV);
        Nila.playcd();
        Nila.setDiscTray("DIVERGENT");
        Nila.playcd();
        
    }
}
