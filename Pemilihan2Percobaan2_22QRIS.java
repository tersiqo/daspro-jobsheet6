import java.util.Scanner;

public class Pemilihan2Percobaan2_22QRIS {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        int pilihan_menu;
        String member, payment_metode;
        double diskon = 0, total_bayar, harga = 0;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input22.nextInt();
     input22.nextLine();  

        System.out.print("Apakah punya member (y/n) ? = ");
        member = input22.nextLine();

        System.out.print("Metode pembayaran (qris/cash) = ");
        payment_metode = input22.nextLine();
        System.out.println("-------------------------");
     input22.close();
        System.out.println("======= STRUK PEMBAYARAN ======= \n");

        total_bayar = 0;

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.1;  
            System.out.println("Mendapatkan Diskon 10%");
            switch (pilihan_menu) {
                case 1:
                    harga = 14000;
                    System.out.println("Harga Ricebowl : " + harga);
                    break;
                case 2:
                    harga = 3000;
                    System.out.println("Harga Ice Tea : " + harga);
                    break;
                case 3:
                    harga = 15000;
                    System.out.println("Harga Paket Bundling : " + harga);
                    break;
                default:
                    System.out.println("Masukkan Pilihan menu dengan benar");
                    return;
            }
            total_bayar = harga - (harga * diskon);

        } else if (member.equalsIgnoreCase("n")) {
            switch (pilihan_menu) {
                case 1:
                    harga = 14000;
                    System.out.println("Harga Ricebowl : " + harga);
                    break;
                case 2:
                    harga = 3000;
                    System.out.println("Harga Ice Tea : " + harga);
                    break;
                case 3:
                    harga = 15000;
                    System.out.println("Harga Paket Bundling : " + harga);
                    break;
                default:
                    System.out.println("Masukkan Pilihan menu dengan benar");
                    return;
            }
            total_bayar = harga;
        }

        double final_payment = total_bayar;
        if (payment_metode.equalsIgnoreCase("qris")) {
            final_payment = total_bayar - 1000;  
            System.out.println("Diskon tambahan Rp1000 untuk pembayaran QRIS");
        }

        System.out.println("Member \t\t : " + (member.equalsIgnoreCase("y") ? "Ya" : "Tidak"));
        System.out.println("Metode bayar  \t: " + payment_metode);
        System.out.println("Total bayar  \t: " + final_payment);
    }
}