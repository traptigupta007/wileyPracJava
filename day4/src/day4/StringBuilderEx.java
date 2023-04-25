package day4;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder logMessage = new StringBuilder();
		long timestamp = System.currentTimeMillis();
		logMessage.append("[").append(timestamp).append("] ");
		int userId=12345;
		logMessage.append("user ").append(userId).append(": logged in");
		System.out.println(logMessage);
	}

}
