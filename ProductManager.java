package marketplace;
import java.util.*;

public class ProductManager {
    //list untuk menyimpan semua produk
    private List<Product<?>> products = new ArrayList<>();
    //set untuk menyimpan kategori unik
    private Set<String> categories = new HashSet<>();
    //queue untuk produk yang sudah diproses
    private Queue<Product<?>> processedQueue = new LinkedList<>();
    //map kategori (daftar produk dalam kategori)
    private Map<String, List<Product<?>>> categoryMap = new HashMap<>();
    
    //method menambahkan produk ke daftar
    public void addProduct(Product<?> product) {
        products.add(product); //menambahkan ke list utama
        categories.add(product.getCategory().toString()); //menyimpan kategori unik
        //menambahkan ke map per kategori
        categoryMap.computeIfAbsent(product.getCategory().toString(), k -> new ArrayList<>()).add(product);
    }
    
    //method menghapus produk berdasarkan ID
    public boolean removeProductById(int id) {
        return products.removeIf(p -> p.getId() == id);
    }
    
    //method mencari produk berdasarkan nama dan kategori
    public List<Product<?>> searchByNameAndCategory(String name, String category) {
        List<Product<?>> result = new ArrayList<>();
        for (Product<?> p : products) {
            if (p.getName().equalsIgnoreCase(name) && p.getCategory().toString().equalsIgnoreCase(category)) {
                result.add(p);
            }
        }
        return result;
    }
    
    //method menampilkan semua produk yang telah diurutkan berdasarkan kategori
    public void showAllProductsSorted() {
        List<Product<?>> sorted = new ArrayList<>(products);
        sorted.sort((a, b) -> a.getCategory().toString().compareTo(b.getCategory().toString()));
        for (Product<?> p : sorted) {
            System.out.println(p);
        }
    }
    
    //method menampilkan semua kategori unik
    public void showUniqueCategories() {
        System.out.println("Kategori Unik:");
        for (String category : categories) {
            System.out.println("- " + category);
        }
    }
    
    //method menambahkan produk ke antrian "sudah diproses"
    public void addToProcessed(Product<?> product) {
        processedQueue.offer(product);
    }
    
    //method menampilkan semua produk dalam antrian yang telah diproses
    public void showProcessedQueue() {
        System.out.println("Produk yang sudah diproses:");
        for (Product<?> p : processedQueue) {
            System.out.println(p);
        }
    }
    
    //menampilkan produk per kategori menggunakan Map
    public void showProductsPerCategory() {
        System.out.println("Produk berdasarkan kategori:");
        for (String cat : categoryMap.keySet()) {
            System.out.println("Kategori: " + cat);
            for (Product<?> p : categoryMap.get(cat)) {
                System.out.println("  - " + p);
            }
        }
    }
}
