package homework_16;

public class TransferResult {
    boolean success;
    String message;
    double remainingBalance;
    public TransferResult( String message,boolean success, double remainingBalance) {
        this.success = success;
        this.message = message;
        this.remainingBalance = remainingBalance;
    }
}

