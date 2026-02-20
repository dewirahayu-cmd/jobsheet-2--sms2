public class DosenMain {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Siti Rahayu";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2005;
        dosen1.bidangKeahlian = "Sistem Operasi";

        System.out.println("===== Informasi Dosen 1 =====");
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        int masaKerja1 = dosen1.hitungMasaKerja(2026);
        System.out.println("Masa kerja: " + masaKerja1 + " tahun");
        dosen1.ubahKeahlian("Computer Science");
        System.out.println();

        Dosen dosen2 = new Dosen("D002", "Budi Prasetyo, M.Kom", false, 2015, "Jaringan Komputer");

        System.out.println("===== Informasi Dosen 2 =====");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        int masaKerja2 = dosen2.hitungMasaKerja(2026);
        System.out.println("Masa kerja: " + masaKerja2 + " tahun");
        dosen2.ubahKeahlian("Keamanan Jaringan");
    }
}
