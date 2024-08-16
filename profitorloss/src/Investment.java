import java.util.Arrays;

public class Investment extends Thread{
	
	public  Float ISum=null;
	@Override
	public void run() {
		Integer[] inv= {20,30,40,50,20};
		Arrays.stream(inv).sum();
		
	}
	

}
