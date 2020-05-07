public class Hello2030 {
	public int radius;
	public String name;
	
	public Hello2030() {
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String arg[]) {
		Hello2030 pizza;
		pizza = new Hello2030();
		
		pizza.radius=10;
		pizza.name="자바피자";
		double area=pizza.getArea();
	}
}
