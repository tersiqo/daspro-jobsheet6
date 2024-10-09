import java.util.Scanner;

public class DiskonBuku22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (Kamus / Novel / Komik): ");
        String jenisBuku = input.nextLine().toLowerCase(); 
        System.out.print("Masukkan jumlah buku: ");
        int JumlahBUku = input.nextInt();

        double Diskon = 0.0;

        if (jenisBuku.equals("kamus") && JumlahBUku >= 3) {
            Diskon = 12;
        } else if (jenisBuku.equals("kamus") && JumlahBUku <= 2) {
            Diskon = 10;
        } else if (jenisBuku.equals("novel") && JumlahBUku > 3) {
            Diskon = 9;
        } else if (jenisBuku.equals("novel") && JumlahBUku <= 3) {
            Diskon = 8;
        } else if (jenisBuku.equals("komik") && JumlahBUku >= 3) {
            Diskon = 5;
        } else {
            Diskon = 0;
        }
       
        System.out.print("Masukkan total harga buku: ");
        double TotalHarga = input.nextDouble();
        double TotalDiskon = (Diskon / 100) * TotalHarga;
        double TotalBayar = TotalHarga - TotalDiskon;

        System.out.println("=====RIncian pembelian=====");
        System.out.println("Diskon: " + Diskon + "%");
        System.out.println("Total Diskon: Rp " + TotalDiskon);
        System.out.println("Total yang harus dibayar: Rp " + TotalBayar);

    }
}