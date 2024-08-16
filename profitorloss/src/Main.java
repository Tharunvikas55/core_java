
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Investment invest=new Investment();
		Thread t=new Thread(invest);
		t.start();
		System.out.println("In main");

	}

}
