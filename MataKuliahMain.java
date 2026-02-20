public class MataKuliahMain {
    public static void main(String[] args) {

        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "TI101";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        System.out.println("===== Informasi Mata Kuliah 1 =====");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.kurangiJam(10); 
        System.out.println();

        MataKuliah mk2 = new MataKuliah("TI202", "Pemrograman Berorientasi Objek", 3, 6);

        System.out.println("===== Informasi Mata Kuliah 2 =====");
        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(3);
        mk2.kurangiJam(2);
    }
}
