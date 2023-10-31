import java.util.Scanner;

public class BioskopWithScanner10 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        int menu = sc10.nextInt();

        while (true) {
            System.out.println("Masukkan nama  : ");
            nama = sc10.nextLine();
            System.out.print("Masukkan baris : ");
            baris = sc10.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = sc10.nextInt();
            sc10.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n) : ");
            next = sc10.nextLine();

            if (next.equalsIgnoreCase("n")) {
                    break;
            }
        }
    }
}
