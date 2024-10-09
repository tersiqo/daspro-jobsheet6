import java.util.Scanner;

public class BilanganTerbesar22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=====Menentukan Bilangan Terbesar=====");
        System.out.print("Masukkan bilangan yang pertama (bil1): ");
        int bil1 = input.nextInt();
        
        System.out.print("Masukkan bilangan yang kedua (bil2): ");
        int bil2 = input.nextInt();
        
        System.out.print("Masukkan bilangan yang ketiga (bil3): ");
        int bil3 = input.nextInt();

        if (bil1 < bil2) {
            if (bil2 < bil3) {
                System.out.println("Bilangan terbesar adalah (bil3): " + bil3);
            } else {
                System.out.println("Bilangan terbesar adalah (bil2): " + bil2);
            }
        } else {
            if (bil1 < bil3) {
                System.out.println("Bilangan terbesar adalah (bil3): " + bil3);
            } else {
                System.out.println("Bilangan terbesar adalah (bil1): " + bil1);
            }
        }
    }
}