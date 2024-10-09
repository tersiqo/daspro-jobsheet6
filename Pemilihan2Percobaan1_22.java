import java.util.Scanner;

public class Pemilihan2Percobaan1_22 {
    public static void main(String[] args) {

        Scanner input22 = new Scanner(System.in);
        int tahun;

        System.out.println("==========Menghitung Tahun Kabisat=========");

        System.out.println("Masukkan Tahun Kabisat : ");
        tahun = input22.nextInt();

       
        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    System.out.println(tahun + " Adalah Tahun kabisat");
            } else {
                System.out.println(tahun + " Bukan Tahun kabisat");
                }   
            }else{
                System.out.println(tahun + " Adalah Tahunn Kabisat");
            }
        } else{
            System.out.println(tahun + " Bukan Tahun Kabisat");
        }
    }
}
