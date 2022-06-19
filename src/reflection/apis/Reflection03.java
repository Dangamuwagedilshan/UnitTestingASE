package reflection.apis;

public class Reflection03 {

	public static void main(String[] args) {
		Simple s = new Simple();
		System.out.println("Class ="+s.getClass());
		System.out.println("Class Name ="+s.getClass().getName());
	}
}
