# 🍔 QuickBite - Program Menu Restoran

QuickBite adalah program Java sederhana berbasis **Object-Oriented Programming (OOP)** yang digunakan untuk mengelola menu restoran dan stok menu.

Program ini dibuat sebagai tugas pembelajaran Java OOP dengan menerapkan konsep **Class, Object, Constructor Overloading, Constructor Chaining, Method, dan Encapsulation**.

## 📌 Fitur

* Menampilkan informasi menu restoran
* Membuat objek menu menggunakan beberapa constructor
* Menambahkan atau mengurangi stok menu
* Stok tidak dapat bernilai kurang dari 0
* Menu interaktif menggunakan `switch` dan `do-while`

## 🛠️ Teknologi

* Java
* Java Scanner
* Object-Oriented Programming (OOP)

## 📂 Struktur Program

```text
QuickBite/
├── Main.java
└── MenuItem.java
```

### `MenuItem.java`

Class `MenuItem` digunakan sebagai cetakan untuk membuat objek menu.

Atribut yang digunakan:

```java
private String namaMenu;
private String kategori;
private double harga;
private int stok;
```

### `Main.java`

Class `Main` digunakan untuk menjalankan program dan menyediakan menu interaktif untuk pengguna.

## 🧩 Constructor

Program menggunakan beberapa constructor dengan parameter yang berbeda.

### 1. Default Constructor

```java
public MenuItem() {
    this("Menu masih kosong", "No Kategori", 0.0, 0);
}
```

Digunakan untuk membuat menu tanpa memberikan parameter.

### 2. Constructor Nama dan Harga

```java
public MenuItem(String namaMenu, double harga) {
    this(namaMenu, "Makanan", harga, 10);
}
```

Digunakan ketika hanya nama dan harga menu yang ingin ditentukan. Kategori otomatis menjadi `Makanan` dan stok awal `10`.

### 3. Full Parameter Constructor

```java
public MenuItem(String namaMenu, String kategori, double harga, int stok) {
    this.namaMenu = namaMenu;
    this.kategori = kategori;
    this.harga = harga;
    this.stok = stok;
}
```

Digunakan ketika seluruh informasi menu ingin ditentukan.

## 🔗 Constructor Chaining

Program menggunakan `this()` untuk memanggil constructor lain di dalam class yang sama.

Contohnya:

```java
public MenuItem(String namaMenu, double harga) {
    this(namaMenu, "Makanan", harga, 10);
}
```

Dengan constructor chaining, kode yang sama tidak perlu ditulis berulang kali.

## 📦 Contoh Object

Pada `Main.java` dibuat tiga object menggunakan constructor yang berbeda:

```java
MenuItem menu1 = new MenuItem();

MenuItem menu2 = new MenuItem(
    "Nasi Goreng Cak Suhat", 12000
);

MenuItem menu3 = new MenuItem(
    "Mie Indo Bangladesh 9-2",
    "Makanan",
    10000,
    30
);
```

## 🔄 Update Stok

Stok dapat ditambah maupun dikurangi menggunakan method:

```java
updateStok(int jumlah)
```

Contoh:

```java
menu3.updateStok(5);
```

Jika stok sebelumnya `30`, maka menjadi:

```text
30 + 5 = 35
```

Untuk mengurangi stok:

```java
menu3.updateStok(-5);
```

Stok menjadi:

```text
30 - 5 = 25
```

Program juga memastikan stok tidak menjadi angka negatif.

## ▶️ Cara Menjalankan

1. Pastikan Java sudah terinstall.
2. Clone repository ini.

```bash
git clone <URL-REPOSITORY>
```

3. Masuk ke folder project.

```bash
cd QuickBite
```

4. Jalankan program melalui IDE seperti VS Code, IntelliJ IDEA, atau NetBeans.

Atau melalui terminal:

```bash
javac QuickBite/*.java
java QuickBite.Main
```

## 🎯 Konsep OOP yang Digunakan

| Konsep                  | Penerapan                                     |
| ----------------------- | --------------------------------------------- |
| Class                   | `MenuItem` dan `Main`                         |
| Object                  | `menu1`, `menu2`, `menu3`                     |
| Encapsulation           | Atribut `MenuItem` menggunakan `private`      |
| Constructor Overloading | Beberapa constructor dengan parameter berbeda |
| Constructor Chaining    | Penggunaan `this()`                           |
| Method                  | `tampilkanInformasi()` dan `updateStok()`     |

## 👨‍💻 Tujuan Project

Project ini dibuat untuk memahami dasar pemrograman berorientasi objek menggunakan Java, terutama dalam penggunaan **constructor, object, method, dan constructor chaining** melalui studi kasus sederhana pada sistem menu restoran.

---

**QuickBite — Simple Restaurant Menu Management 🍔**
