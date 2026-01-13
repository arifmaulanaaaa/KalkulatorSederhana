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
                try {
                    System.out.println("Masukkan angka pertama: ");
                    double angkaPertama = input.nextDouble();

                    System.out.println("Masukkan angka kedua: ");
                    double angkaKedua = input.nextDouble();

                    System.out.println("Masukkan Sistem Operasi: ");
                    System.out.println("1 untuk pertambahan");
                    System.out.println("2 untuk pengurangan");
                    System.out.println("3 untuk perkalian");
                    System.out.println("4 untuk pembagian");
                    int pilihan = input.nextInt();

                    double hasil;

                    switch (pilihan) {
                        case 1:
                            hasil = tambah(angkaPertama, angkaKedua);
                            System.out.println("hasilnya adalah " + hasil);
                            riwayat.add(angkaPertama + " + " + angkaKedua + " = " + hasil);
                            break;

                        case 2:
                            hasil = kurang(angkaPertama, angkaKedua);
                            System.out.println("hasilnya adalah " + hasil);
                            riwayat.add(angkaPertama + " - " + angkaKedua + " = " + hasil);
                            break;

                        case 3:
                            hasil = kali(angkaPertama, angkaKedua);
                            System.out.println("hasilnya adalah " + hasil);
                            riwayat.add(angkaPertama + " x " + angkaKedua + " = " + hasil);
                            break;

                        case 4:
                            if (angkaKedua != 0) {
                                hasil = bagi(angkaPertama, angkaKedua);
                                System.out.println("hasilnya adalah " + hasil);
                                riwayat.add(angkaPertama + " : " + angkaKedua + " = " + hasil);
                            } else {
                                System.out.println("Pembagian dengan nol tidak valid!");
                            }
                            break;
                    }

                } catch (Exception e) {
                    System.out.println("Terjadi kesalahan. Mohon masukkan input berupa angka.");
                    input.nextLine();
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
                } else {
                    for (int i = 0; i < riwayat.size(); i++) {
                        System.out.println((i + 1) + ". " + riwayat.get(i));
                    }
                    System.out.println("\nBatas riwayat hanya sampai 10.");
                    System.out.println("Jika melebihi batas, akan dihapus otomatis.");
                }

                System.out.println("\nMau menghapus riwayat?");
                String jawabanHapus = input.next();
                if (jawabanHapus.equalsIgnoreCase("yes")) {
                    riwayat.clear();
                    System.out.println("Riwayat berhasil dihapus.");
                } else if (riwayat.size() >= 10) {
                    riwayat.clear();
                }

                System.out.println("Tekan enter untuk kembali ke menu utama");
                input.nextLine();
                input.nextLine();

            } else if (pilihanHalamanAwal == 3) {
                lanjut = false;
            }

        }

        System.out.println("=== Terimakasih telah menggunakan Kalkulator ===");
        input.close();
    }

    public static double tambah(double a, double b) {
        return a + b;
    }

    public static double kurang(double a, double b) {
        return a - b;
    }

    public static double kali(double a, double b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        return a / b;
    }
}
