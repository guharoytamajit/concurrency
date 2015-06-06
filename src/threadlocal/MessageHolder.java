package threadlocal;

public class MessageHolder {
private static ThreadLocal<String> threadMessage=new ThreadLocal<>();

public static String getMessage() {
	return threadMessage.get();
}

public static void setMessage(String message) {
	threadMessage.set(message);	
}
public static void clearMessage() {
	threadMessage.set(null);	
}
}
