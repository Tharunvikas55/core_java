package implementsrunnable;

public class Student implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("In getMarks() : " + i);
		}
	}
}
