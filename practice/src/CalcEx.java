
public class CalcEx {
	public static int abs(int a) {
		return a>0?a:-a;
	}
	public static int max(int a, int b) {
		return (a>b)?a:b;
	}
	public static int min(int a, int b) {
		return (a>b)?b:a;
	}
	public static void main(String arg[]) {
		System.out.println(max(10,20));
		System.out.println(CalcEx.abs(5));
	}
}
