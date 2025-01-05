package tubespbo;

public class Person {

    protected String nama;
    protected String noKartu;

    public Person(String nama, String noKartu) {
        this.nama = nama;
        this.noKartu = noKartu;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKartu() {
        return noKartu;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("No Kartu: " + noKartu);
    }
}
