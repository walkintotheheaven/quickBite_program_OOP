package QuickBite;
import java.util.*;

public class Main {

    public static void main() {
        Scanner sc = new Scanner(System.in);

        MenuItem menu1 = new MenuItem();
        MenuItem menu2 = new MenuItem("Nasi Goreng Cak Suhat", 12000);
        MenuItem menu3 = new MenuItem("Mie Indo Bangladesh 9-2", "Makanan", 10000, 30);

        int pilihMenu;
        do {
            System.out.println("=== MENNU RESTORAN QUCKBITE CABANG MERR ===");
            System.out.println("1. Lihat Menu");
            System.out.println("2. Update Stok Menu");
            System.out.println("3. Simpan & keluar");
            System.out.println("Pilih bang (1-3): ");

            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println();
                    System.out.println("Tampilkan Menu: ");
                    menu1.tampilkanInformasi();
                    menu2.tampilkanInformasi();
                    menu3.tampilkanInformasi();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Update Stok Menu: ");
                    System.out.println("Pilih menu yang ingin diupdate: ");
                    int opsi = sc.nextInt();

                    System.out.println();
                    System.out.println("Input Jumlah yang ingin ditambah / kurangi");
                    int jumlah = sc.nextInt();
                switch (opsi) {
                    case 1:
                        menu1.updateStok(jumlah);
                        break;
                    case 2:
                        menu2.updateStok(jumlah);
                        break;
                    case 3:
                        menu3.updateStok(jumlah);
                        break;
                }
                break;

                case 3:
                    System.out.println();
                    System.out.println("Done");
                    break;
            }
            System.out.println("Lanjutkan Menu Program? (KETIK 1 UNTUK LANJUT, KETIK 0 UNTUK KELUAR)");
            pilihMenu = sc.nextInt();
        } while (pilihMenu == 1);
    }
}
