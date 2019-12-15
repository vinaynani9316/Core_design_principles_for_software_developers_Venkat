import java.util.ArrayList;
import java.util.List;

class Book{}

class TextBook{}

public class Sample
{
	
	public static void process(List<Book> books)
	{
		
	}
	public static void doprocess(List<TextBook> textbooks)
	{
		System.out.println("l");
	}

	public static void main(String[] args) 
	{
		List<Book> books= new ArrayList<>();
		process(books);
		System.out.println("ok");
		
		List<TextBook> textbooks =new ArrayList<>();
		doprocess(textbooks);
		
		

	}

}
