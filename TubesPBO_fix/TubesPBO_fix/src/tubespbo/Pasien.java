package tubespbo;

public class Pasien extends Person {

    private String keluhan;
    private String obat;

    public Pasien(String nama, String noKartu, String keluhan, String obat) {
        super(nama, noKartu);
        this.keluhan = keluhan;
        this.obat = obat;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public String getObat() {
        return obat;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Keluhan: " + keluhan);
        System.out.println("Obat: " + obat);
    }
}
