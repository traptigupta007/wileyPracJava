package day4;

public class StrignBufferEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer chatHistory=new StringBuffer();
		String sender = "trapti";
		String message = "heyyy hellloooooooooooooooo!!!!!!!";
		chatHistory.append(sender);
		chatHistory.append(": "+message);
		chatHistory.append("\n");
	    sender = "isha";
		message = "hey";
		chatHistory.append(sender);
		chatHistory.append(": "+message);
		chatHistory.append("\n");
		System.out.println(chatHistory);
	}

}
