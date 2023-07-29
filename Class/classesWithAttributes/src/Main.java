public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Monster", "Abra A5 v17.2", 22000, 264, "Gray");
//        product.setName("Monster");
//        product.setId(1);
//        product.setDescription("Abra A5 v17.2");
//        product.setPrice(22000);
//        product.setStockAmount(264);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getCode());
    }
}