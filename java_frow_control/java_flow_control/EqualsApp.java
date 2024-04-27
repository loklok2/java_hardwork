package java_flow_control;

public class EqualsApp {

	public static void main(String[] args) {
		
		String o1 = new String("Java");
		String o2 = new String("Java");
		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));
		
		String o3 = "Java2";
		String o4 = "Java2";
		System.out.println(o3==o4);
	}

}
