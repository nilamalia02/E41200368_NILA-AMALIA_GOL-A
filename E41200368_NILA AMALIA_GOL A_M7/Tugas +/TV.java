package wsibd_m7_nila;

/**
 *
 * @author Nila Amalia
 */
public class TV {
    String deskripsi = "";
    int Tchannel = 0;
    String[] channel = new String[Tchannel];
    int CAktif = 0;
    int vlm = 0;
    String pembeli = "";
    
    // constructor (Method Khusus)
    TV(final String n, final String deskripsi, final int Tchannel) {
        this.pembeli = n;
        this.deskripsi = deskripsi;
        this.Tchannel = Tchannel;
    }
    
    // set deskripsi
    public void getdeskripsi() { 
        System.out.println(pembeli + " membeli " + deskripsi);
    }
    
    // set channel
    public void setchannel(String[] channel) {
        if (channel.length > this.Tchannel) {
            System.out.println("Tv ini hanya dapat menyimpan " + this.Tchannel + " channel");
        } else {
            this.channel = channel;
            System.out.println("Informasi channel anda berhasil diupdate!");
        }
    }
    
    // channel aktif
    public void getchannel() {
        if(this.channel.length == 0) {
            System.out.println("Belum ada channel yang diseting!");
        } else {
            String data = "";
            for (String chnl : this.channel) {
                data += chnl + " ";
            }
            System.out.println("Channel yang ada : [ " + data + "]");
        }
    }
    
    // set channel aktif
    public void setCAktif(int x) {
        this.CAktif = x;
        int data = x;
        System.out.println("Pindah ke-channel : " + this.channel[x-1]);
    }
    
    // set volume
    public void setvlm(int v) {
        System.out.println("Volume sekarang : " + v);
    }
    
    
}
class User {
    public static void main(String[] args) {
        
        TV Nila = new TV("Nila Syantix", "TV jumbo THOSIBA, Warna Hitam", 11);
        String[]  channel = {"SCTV", "TransTV", "TVONE", "RCTI", "GlobalTV",
                             "KompasTV", "MOPChanel", "JTV", "NilaPunya", 
                             "Indosiar","ANTV"};
            
        Nila.getdeskripsi();
        Nila.getchannel();
        Nila.setchannel(channel);
        
        Nila.setCAktif(8);
        Nila.setvlm(70);
        Nila.setCAktif(11);
        
    }
}
