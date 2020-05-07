import java.util.Scanner;
public class Book {
	String title;
	String author;
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
	public static void main(String arg[]) {
		Book [] b;
		b = new Book[2]; //-> Book [] b= new Book[2];
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<b.length;i++) {
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author= scanner.nextLine();
			b[i]=new Book(title,author);
		}
		for(int i=0;i<b.length;i++) {
			System.out.print("("+b[i].title+", "+b[i].author+")");
		}
		scanner.close();
	}
}
