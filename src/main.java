import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		String pathname = "tekst.txt";

		try {

			File file = new File(pathname);
			Scanner sc = new Scanner(file);
			int counter = 0;
			while (sc.hasNext()) {
				// System.out.println(sc.next());
				sc.next();
				counter++;
			}
			System.out.println(counter);

			PrintWriter output = new PrintWriter("summary.txt", "UTF-8");
			output.println("File " + pathname + " have :" + counter + " words!");
			output.close();

		} catch (IOException ex) {
			System.out.println("file does not exist");
		}
	}
}
