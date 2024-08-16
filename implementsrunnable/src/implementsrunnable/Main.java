package implementsrunnable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		// initialization of thread
		Thread t = new Thread(student);
		t.start(); // Thread scheduler
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("In main() :" + i);
		}
	}

}
