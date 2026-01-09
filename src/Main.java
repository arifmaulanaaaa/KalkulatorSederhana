import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;
        ArrayList<String> riwayat = new ArrayList<>();

        while (lanjut) {

            System.out.println("=== Kalkulator Sederhana ===");
            System.out.println("1 untuk HITUNG");
            System.out.println("2 untuk RIWAYAT");
            System.out.println("3 untuk KELUAR");
            System.out.println("pilihan (1/2/3): ");
            int pilihanHalamanAwal = input.nextInt();

            if (pilihanHalamanAwal == 1) {
                System.out.println("Masukkan angka pertama: ");
                int angkaPertama = input.nextInt();

                System.out.println("Masukkan angka kedua: ");
                int angkaKedua = input.nextInt();

                System.out.println("Masukkan Sistem Operasi: ");
                System.out.println("1 untuk pertambahan");
                System.out.println("2 untuk pengurangan");
                System.out.println("3 untuk perkalian");
                System.out.println("4 untuk pembagian");
                int pilihan = input.nextInt();

                int hasil = 0;

                switch (pilihan) {
                    case 1:
                        hasil = angkaPertama + angkaKedua;
                        System.out.println("hasilnya adalah " + hasil);
                        riwayat.add(angkaPertama + " + " + angkaKedua + " = " + hasil);
                        break;

                    case 2:
                        hasil = angkaPertama - angkaKedua;
                        System.out.println("hasilnya adalah " + hasil);
                        riwayat.add(angkaPertama + " - " + angkaKedua + " = " + hasil);
                        break;

                    case 3:
                        hasil = angkaPertama * angkaKedua;
                        System.out.println("hasilnya adalah " + hasil);
                        riwayat.add(angkaPertama + " x " + angkaKedua + " = " + hasil);
                        break;

                    case 4:
                        if (angkaKedua != 0) {
                            hasil = angkaPertama / angkaKedua;
                            System.out.println("hasilnya adalah " + hasil);
                            riwayat.add(angkaPertama + " : " + angkaKedua + " = " + hasil);
                        } else {
                            System.out.println("Pembagian dengan nol tidak valid!");
                        }
                        break;
                }
                System.out.println("Masih mau lanjut menghitung? (yes/no)");
                String pilihanLanjut = input.next();
                if (pilihanLanjut.equalsIgnoreCase("no")) {
                    lanjut = false;
                }

            } else if (pilihanHalamanAwal == 2) {
                System.out.println("=== Riwayat Menghitung ===");
                if (riwayat.isEmpty()) {
                    System.out.println("Riwayat belum ada.");
                    System.out.println("Tekan enter untuk kembali ke menu sebelumnya.");
                    input.nextLine();
                    // input.nextLine();
                }
                for (int i = 0; i < riwayat.size(); i++) {
                    System.out.println((i + 1) + ". " + riwayat.get(i));
                }
            } else if (pilihanHalamanAwal == 3) {
                lanjut = false;
            }
        }

        System.out.println("=== Terimakasih telah menggunakan Kalkulator ===");
        input.close();
    }
}
