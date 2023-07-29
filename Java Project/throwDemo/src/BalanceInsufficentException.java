public class BalanceInsufficentException extends Exception{
    String message;
    BalanceInsufficentException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
