
public class BrowserException extends RuntimeException{
	
	public BrowserException() {
		// TODO Auto-generated constructor stub
	}

	public BrowserException(String message){
		super(message);
	}
	
	public BrowserException(Throwable cause){
		super(cause);
	}
	
	public BrowserException(String message, Throwable cause){
		super(message,cause);
	}
	
	public BrowserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
