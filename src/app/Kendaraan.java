package app;

/**
 * Dosen
 */
public class Kendaraan {
    private String jenisK;
    private String merkK;

    public String getJenisK() {
        return this.jenisK;
    }

    public void setJenisK(String jenisK) {
        this.jenisK = jenisK;
    }

    public String getMerkK() {
        return this.merkK;
    }

    public void setMerkK(String merkK) {
        this.merkK = merkK;
    }

    
    private Mesin mesin;
    private Roda roda;


    public Mesin getMesin() {
        return this.mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public Roda getRoda() {
        return this.roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public Kendaraan(String jenisk,
    String merkk,
    Mesin  mesin,
    Roda roda) {
        this.jenisK = jenisk;
        this.merkK = merkk;
        this.mesin = mesin;
        this.roda = roda;
    }
    
}