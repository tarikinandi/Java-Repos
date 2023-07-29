import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name = "Mouse";
        product.price = 259;
        manager.add(product);

        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();

    }
}