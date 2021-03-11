package Src;

public class Mahasiswa extends Person{
    private String nim;
    KRS krs;

    public Mahasiswa(String nim, String nama) {
      
    }

    public void cetakKRS() {

    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return nim;
    }

    public void pilihPaketKRS(KRS krs) {
        this.krs = krs;
    }

    public KRS getKRS() {
        return krs;
    }
}