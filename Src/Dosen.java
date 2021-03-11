package Src;

import java.util.ArrayList;

public class Dosen extends Person {
    private String nidn;
    private ArrayList <Matakuliah> listMatakuliahPengampu;
    private Matakuliah matakuliahPengampu;

    public Dosen(String nidn, String nama) {
        
    }

    public void lihatListMatakuliahPengampu() {

    }

    public void tambahMatakulihaPengampu(Matakuliah matakuliah) {

    }

    void setNidn(String nidn) {
        this.nidn = nidn;
    }

    String getNidn() {
        return nidn;
    }
}