package uts_oop_2301010316;

/**
 *
 * @author Liryana Purnama
 */
public class AnggotaUKM {
    private String nama;
    private String nim;
    private String jurusan;
    private String divisi;

    public AnggotaUKM() {}
    
    public AnggotaUKM(String nama, String nim, String jurusan, String divisi) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.divisi = divisi;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    
    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }
    
    public String getJurusan() { return jurusan; }
    public void setJurusan(String jurusan) { this.jurusan = jurusan; }
    
    public String getDivisi() { return divisi; }
    public void setDivisi(String divisi) { this.divisi = divisi; }

    // Overriding toString()
    @Override
    public String toString() {
        return "Nama: " + nama + 
               "\nNIM: " + nim + 
               "\nJurusan: " + jurusan + 
               "\nDivisi: " + divisi + "\n";
    }
}

