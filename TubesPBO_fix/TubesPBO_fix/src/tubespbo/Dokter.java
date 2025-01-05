package tubespbo;

public class Dokter extends Person {

    private String jadwal;
    private String ruangan;

    public Dokter(String nama, String noKartu, String jadwal, String ruangan) {
        super(nama, noKartu);
        this.jadwal = jadwal;
        this.ruangan = ruangan;
    }

    public String getJadwal() {
        return jadwal;
    }

    public String getRuangan() {
        return ruangan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jadwal: " + jadwal);
        System.out.println("Ruangan: " + ruangan);
    }
}
