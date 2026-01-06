import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Kalkulator Sederhana ===");

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
                break;

            case 2:
                hasil = angkaPertama - angkaKedua;
                System.out.println("hasilnya adalah " + hasil);
                break;

            case 3:
                hasil = angkaPertama * angkaKedua;
                System.out.println("hasilnya adalah " + hasil);

            case 4:
                if (angkaKedua != 0) {
                    hasil = angkaPertama / angkaKedua;
                    System.out.println("hasilnya adalah " + hasil);
                } else {
                    System.out.println("Pembagian dengan nol tidak valid!");
                }
        }

        System.out.println("=== Terimakasih telah menggunakan Kalkulator ===");
        input.close();
    }
}
