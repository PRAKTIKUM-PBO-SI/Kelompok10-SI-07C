package tubespbo;

public class Transaksi {

    private String noKartu;
    private String noDokter;
    private String namaPasien;
    private double biaya;

    public Transaksi(String noKartu, String noDokter, String namaPasien, double biaya) {
        this.noKartu = noKartu;
        this.noDokter = noDokter;
        this.namaPasien = namaPasien;
        this.biaya = biaya;
    }

    // Getter dan setter
    public String getNoKartu() {
        return noKartu;
    }

    public String getNoDokter() {
        return noDokter;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public double getBiaya() {
        return biaya;
    }
}
