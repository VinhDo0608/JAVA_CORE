package vn.devpro.trenlop.vd02;

public class DivideByZeroException extends Exception{
	
	private String messageError;

	public DivideByZeroException(String messageError) {
		super();
		this.messageError = messageError;
	}

	public DivideByZeroException() {
		super();
	}

	public String getMessageError() {
		return messageError;
	}

	public void setMessageError(String messageError) {
		this.messageError = messageError;
	}
	
	
}
