package Entity;

public class NoSufficientBalanceException extends Exception{
	
	public NoSufficientBalanceException(String message) {
        super(message);
    }
}
