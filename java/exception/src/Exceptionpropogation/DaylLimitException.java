package Exceptionpropogation;

public class DaylLimitException extends RuntimeException {
	String msg;

	public DaylLimitException() {
		super();
	}

	public DaylLimitException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		
		return msg;
	}

	
	

}
