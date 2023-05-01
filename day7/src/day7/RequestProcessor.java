package day7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class RequestProcessor {
	private ExecutorService threadPool;
	private ThreadGroup databaseThreadGroup;
	private ThreadGroup reportGeneration;
	
	public RequestProcessor(){
		// create thread poll for 10 thraeds
		threadPool = Executors.newFixedThreadPool(10,new ThreadFactory() {

			@Override
			public Thread newThread(Runnable r) {
				// TODO Auto-generated method stub
				return new Thread(r);
			}
			
		});
		// create thread group for database and report
		databaseThreadGroup = new ThreadGroup("Database thread");
		reportGeneration  = new ThreadGroup("REpport thread");
		
	}
	public void processRequest(Request request) {
		Runnable task = new Runnable() {
	}
}
enum RequestType{
	DATABASE_QUERY,
	REPORT_GENERATION
}
class Request{
	private RequestType type;
	private String data;
	public Request(RequestType type, String data) {
		super();
		this.type = type;
		this.data = data;
	}
	public RequestType getType() {
		return type;
	}
	public void setType(RequestType type) {
		this.type = type;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
