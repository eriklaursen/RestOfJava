import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/** Generates Frequency maps of a large book
 * 
 * @author s-elaursen
 *
 */
public class BookMap {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		Scanner book = getBookScanner(console);
		//create a map of words to occurrences
		Map<String, Integer> bookMap = new TreeMap<String, Integer>();
		
		//open the book line by line
		
		while(book.hasNextLine()) {
			String line = book.nextLine();
			line = formatLine(line);
			//create a scanner of the current line
			Scanner lineScan = new Scanner(line);
			//read each word in the line
			while(lineScan.hasNext()) {
				String token = lineScan.next();
				//Have we already seen this word?
				if(bookMap.containsKey(token)) {
					//if so add one to the existing occurrences
					int value = bookMap.get(token);
					bookMap.put(token,  value + 1);
				} else {
					//otherwise add it to the map with one occurrence
					bookMap.put(token, 1);
				}
			}
			lineScan.close();
			
		}
		//keep prompting the user for a word until quit ... share the frequency
		System.out.print("Enter a work (q to quit): ");
		String word = console.nextLine();
		
		while(!word.equals("q")) {
			Integer occurance = bookMap.get(word);
			System.out.println(word + " : " + occurance);
			System.out.print("Enter a work (q to quit): ");
			word = console.nextLine();
		}
		
		//share all words in alphabetical order that occur more then 200 times
		for(String key :bookMap.keySet()) {
			Integer occurance = bookMap.get(key);
			if(occurance >= 200) {
				System.out.println(key + " : " + occurance);
			}
		}
		
		
		console.close();
		book.close();
	}
	
	/*
	 
	  hi
	 
	 */
	
	public static String formatLine(String s) {
		s = s.toLowerCase();
		s = s.replace('.', ' ');
		s = s.replace(',', ' ');
		s = s.replace('!', ' ');
		s = s.replace('?', ' ');
		s = s.replace(':', ' ');
		s = s.replace(';', ' ');
		s = s.replace('"', ' ');
		s = s.replace(')', ' ');
		s = s.replace('(', ' ');
		return s;
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
		Scanner s = new Scanner(f, "UTF-8");
		return s;
	}
}
