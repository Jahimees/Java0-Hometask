package Validation;

public class WrongFactoryException extends Exception {
	public WrongFactoryException(String message) {
		super("Factory doesn't exists: " + message);
	}
}
