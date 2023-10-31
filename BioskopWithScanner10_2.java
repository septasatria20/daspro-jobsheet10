import java.util.Scanner;

public class BioskopWithScanner10_2 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        
        System.out.println("============================");
        System.out.println("Selamat datang di Menu");
        System.out.println("============================");
        System.out.println("Pilih Menu dibawah ini (ketik angka)");
        System.out.println("1. Input data penonton");
        System.out.println("2. Tampilkan data penonton");
        System.out.println("3. Exit");
        int menu = sc10.nextInt();

        switch (menu) {
            case 1 :
            while (true) {
            System.out.print("Masukkan nama  : ");
            nama = sc10.next();
            System.out.print("Masukkan baris : ");
            baris = sc10.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = sc10.nextInt();
            sc10.nextLine();

            if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                // Pengecekan apakah kursi sudah terisi
                if (penonton[baris-1][kolom-1] == null) {
                    penonton[baris-1][kolom-1] = nama;
                    System.out.println("Penonton " + nama + " ditempatkan pada kursi " + baris + ", " + kolom);
                } else {
                    System.out.println("Maaf, kursi tersebut sudah terisi. Silakan pilih kursi lain.");
                }
            } else {
                System.out.println("Posisi baris atau kolom tidak valid.");
            }

            System.out.print("Input penonton lainnya? (y/n) : ");
            next = sc10.nextLine();

                if (next.equalsIgnoreCase("n")) {
                    break;
                }
            }
        
            case 2 :
            System.out.println(penonton.length);
            for (int i = 0; i < penonton.length; i++) {
                System.out.println("Panjang baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
            }
            break;
            case 3 :
            break;
            
            default:
            System.out.println("Maaf, input yang Anda masukkan salah ");

        
        }
    }
}