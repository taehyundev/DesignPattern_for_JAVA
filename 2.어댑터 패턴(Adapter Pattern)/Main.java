
public class Main {
	public static void main(String[] args) {
		Adapter a = new AdapterImpl();

		System.out.println(a.twiceOf(100f));
		System.out.println(a.halfOf(100f));
	}
}
