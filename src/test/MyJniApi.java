package test;
/**
 * 
 * @author mashaobo
 *
 */
public class MyJniApi {

	public native int sum(int a, int b);
	
	static {
		System.loadLibrary("myjni");
	}
	
	public static void main(String[] args) {
		MyJniApi api = new MyJniApi();
		System.out.println(api.sum(2, 2));
	}
}
