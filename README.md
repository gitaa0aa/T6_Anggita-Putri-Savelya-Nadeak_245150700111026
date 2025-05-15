# Marketplace 

## Identitas
Nama  : Anggita Putri Savelya Nadeak
NIM   : 245150700111026
Kelas : TI C

## Deskripsi Program
Program ini adalah simulasi **Marketplace Sederhana** berbasis Java yang memanfaatkan **Generic Class**, **Generic Method**, dan **Java Collections**.

### Fitur Utama
○ Menambahkan produk ke dalam daftar produk. 
○ Menghapus produk berdasarkan ID. 
○ Mencari produk berdasarkan nama dan kategori. 
○ Menampilkan seluruh produk dan mengurutkannya berdasarkan kategori. 
○ Menampilkan seluruh kategori unik. 
○ Menambahkan produk ke antrian produk yang telah diproses.
○ Menampilkan antrian produk yang telah diproses. 

### Struktur Kelas
1. 'Product<T>':
   - Class generik untuk menyimpan informasi produk
   - Mendukung perbandingan antar produk berdasarkan kategori (`T extends Comparable<T>`)  
2. `ProductManager`:  
   - Mengelola seluruh produk, kategori, dan antrian proses menggunakan:
     - `ArrayList` untuk daftar produk
     - `HashSet` untuk kategori unik
     - `LinkedList` (Queue) untuk antrian produk yang telah diproses
3. `Marketplace`:  
   - Kelas utama untuk simulasi program

### Fitur Tambahan
○ Menambahkan fitur **pengelompokan produk berdasarkan kategori** menggunakan:
'''java
Map<String, List<Product?>>> categoryMap;
