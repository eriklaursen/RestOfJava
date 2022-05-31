import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Generates Frequency maps of a large book
 * 
 * @author s-elaursen
 *
 */
public class BookMap {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		Scanner book = getBookScanner(console);
		
		//open the book line by line
		
		while(book.hasNextLine()) {
			String line = book.nextLine();
			System.out.println(line);
		}
		System.out.println("hi");
		
	}

	/** Prompts the user for a text file and returns a scanner
	 * 
	 * @param console
	 * @return
	 * @throws FileNotFoundException 
	 */
	public static Scanner getBookScanner(Scanner console) throws FileNotFoundException {
		System.out.println("Give me a book file: ");
		File f = new File(console.nextLine());
		Scanner s = new Scanner(f);
		return s;
	}
}
