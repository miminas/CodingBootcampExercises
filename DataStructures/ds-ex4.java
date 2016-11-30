import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

// EXERCISE 4
// Create a method that accepts Java source code as input
// and creates a "bracket" fingerprint. A bracket fingerprint
// includes all brackets in their order of appearance.
// example: {{}}

public class ds-ex4 {

	public static void main(String[] args) throws IOException {

		List<String> fingerprint = new ArrayList<>();

		Scanner s = null;
		try {
			s = new Scanner(new BufferedReader(new FileReader("/Applications/eclipse/workspace/DataStructures/src/Deadlock.java"))); // java file input
			while (s.hasNext())
			{
				String str = s.next();

				for(int i = 0; i < str.length(); i++) {

					if (String.valueOf(str.charAt(i)).equals("{") || String.valueOf(str.charAt(i)).equals("}")) {
						fingerprint.add(String.valueOf(str.charAt(i)));
					}
				}
			}
		} finally {
			if (s != null) {
				s.close();
			}

		}

		for (int i=0; i < fingerprint.size(); ++i) {
			System.out.print(fingerprint.get(i));
		}
	}
}
