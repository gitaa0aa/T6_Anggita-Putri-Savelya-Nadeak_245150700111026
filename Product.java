package marketplace;

public class Product<T extends Comparable<T>> implements Comparable<Product<T>> {
    //atribut
    private int id;
    private String name;
    private T category;
    private double price;
    
    //konstruktor untuk membuat produk baru
    public Product(int id, String name, T category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
    
    //method getter utk ID
    public int getId() {
        return id;
    }
    
    //method getter utk nama
    public String getName() {
        return name;
    }
    
    //method getter utk kategori
    public T getCategory() {
        return category;
    }
    
    //method getter utk harga
    public double getPrice() {
        return price;
    }
    
    //method compareTo agar produk dibandingkan berdasarkan kategori
    @Override
    public int compareTo(Product<T> other) {
        return this.category.compareTo(other.category);
    }
    
    //method untuk menampilkan info produk ringkas
    @Override
    public String toString() {
        return "ID: " + id + "Nama: " + name + " | " + "Kategori: " + " | " + category.toString() + " | " + "Harga: " + price;
    }
}
