package app;

/**
 * Dosen
 */
public class Dosen {

    Kendaraan [] kendaraans = new Kendaraan[3];

    public void setKendaraans(Kendaraan[] kendaraans) {
        this.kendaraans = kendaraans;
    }
    private String nama;

    public Kendaraan[] getKendaraans() {
        return this.kendaraans;
    }
    private int kode;


    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKode() {
        return this.kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public Dosen(String nama,int kode , Kendaraan kendaraan[]) {
        this.nama = nama;
        this.kode = kode;
        this.kendaraans = kendaraan;
    }

	public Dosen(String nama2, String string, Kendaraan[] kendaraans2) {
	}
}