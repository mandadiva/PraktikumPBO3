package praktikum3;
/**
 *
 * @author user
 */
public class Hewan {
    private String nama; 
    private int umur;
    
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    void suara() {
        System.out.println("Hewan sedang Berlari");
    }
    void info() {
        System.out.println("Nama: " + getNama() + " \nUmur: " + getUmur());
    }
}