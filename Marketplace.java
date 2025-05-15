package marketplace;

public class Marketplace {
    public static void main(String[] args) {
        //membuat instansiasi ProductManager
        ProductManager manager = new ProductManager();
        
        //membuat beberapa produk contoh
        Product<String> p1 = new Product<>(1, "Laptop", "Elektronik", 8500000);
        Product<String> p2 = new Product<>(2, "Kaos Polos", "Fashion", 75000);
        Product<String> p3 = new Product<>(3, "Speaker", "Elektronik", 500000);
        Product<String> p4 = new Product<>(4, "Jeans", "Fashion", 250000);
        
        //menambahkan produk ke manager
        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);
        manager.addProduct(p4);
        
        //menampilan semua produk secara terurut berdasarkan kategori
        System.out.println("\n--- Semua Produk (Terurut Berdasarkan Kategori) ---");
        manager.showAllProductsSorted();
        
        //menampilkan kategori-kategori unik
        System.out.println("\n--- Kategori Unik ---");
        manager.showUniqueCategories();
        
        //mencari produk berdasarkan nama dan kategori
        System.out.println("\n--- Cari Produk: Nama = 'Speaker', Kategori = 'Elektronik' ---");
        var result = manager.searchByNameAndCategory("Speaker", "Elektronik");
        result.forEach(System.out::println);
        
        //menambahkan beberapa produk ke antrian yang sudah diproses
        System.out.println("\n--- Tambahkan ke antrian produk yang diproses ---");
        manager.addToProcessed(p2);
        manager.addToProcessed(p4);
        
        //menampilkan isi antrian produk yang diproses
        System.out.println("\n--- Antrian Produk yang Sudah Diproses ---");
        manager.showProcessedQueue();
        
        //menampilkan produk berdasarkan kategori
        System.out.println("\n--- Produk per Kategori ---");
        manager.showProductsPerCategory();
    }
}
