package QuickBite;

public class MenuItem {
    private String namaMenu;
    private String kategori;
    private double harga;
    private int stok;

    //    CONSTRUCTOR 1
    public MenuItem(){
        this("Menu masih kosong", "No Kategori",
            0.0, 0);
    }


    //    CONSTRUCTOR 2
    public MenuItem(String namaMenu, double harga){
        this(namaMenu, "Makanan", harga, 10);
    }

    //    CONSTRUCTOR 3
    public MenuItem(String namaMenu, String kategori, double harga, int stok){
        this.namaMenu = namaMenu;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInformasi(){
        System.out.println("=======================================");
        System.out.println("Nama Menu   : " + this.namaMenu);
        System.out.println("Kategori    : " + this.kategori);
        System.out.println("Harga       : " + this.harga);
        System.out.println("Sisa Stok   : " + this.stok);
        System.out.println("=======================================");
    }

    public void updateStok(int jumlah){
        this.stok += jumlah;
        if (this.stok < 0){
            this.stok = 0;
        }
        System.out.println("===============================================");
        System.out.println("STOK " + this.namaMenu + " BERHASIL DIUPDATE");
        System.out.println("===============================================");
    }
}
