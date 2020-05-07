import java.util.Scanner;

public class Rectangle {
	public int width;
	public int height;
	
	public Rectangle() {
	}
	public int getArea() {
		return width*height;
	}
	public static void main(String arg[]) {
		Scanner scanner = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		System.out.print(">>");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		double area = rect.getArea();
		
		System.out.println("사각형의 면적은 "+area);
		scanner.close();
	}
}
