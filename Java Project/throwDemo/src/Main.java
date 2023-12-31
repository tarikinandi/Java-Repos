public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println("Hesap = " +manager.getBalance());
        manager.deposit(100);
        System.out.println("Hesap = " +manager.getBalance());

        try {
            manager.withDraw(60);
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Hesap = " +manager.getBalance());

        try {
            manager.withDraw(50);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap = " +manager.getBalance());

    }
}