import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3Test {

	@SuppressWarnings("static-access")
	public static void main( String args[] ) throws IOException {
		
		ReadWriteFile reader = new ReadWriteFile();
		
		// String input = reader.readFile("/Applications/eclipse/workspace/DesignPatterns/src/ReadWriteFile.java");
		String input = reader.readFile("/Applications/eclipse/workspace/superprice-0.5/src/superprice/dao/CustomerDAO.java");
		
		String linesREGEX = "(\n)";
		String classesREGEX = "(private|default|protected|public|final)+\\s+(class)+\\s+(.*?)+(\\{)";
		String methodsREGEX = "((public|private|protected|static|final|native|synchronized|abstract|transient)+\\s)+[\\$_\\w\\<\\>\\[\\]]*\\s+[\\$_\\w]+\\([^\\)]*\\)?\\s*\\{?[^\\}]*\\}?";
		
		Pattern classes = Pattern.compile(classesREGEX);
		Matcher matchedClasses = classes.matcher(input);   // get a matcher object
		
		Pattern methods = Pattern.compile(methodsREGEX);
		Matcher matchedMethods = methods.matcher(input);
		
		Pattern lines = Pattern.compile(linesREGEX);
		Matcher matchedLines = lines.matcher(input);
		
		int classesFound = 0;
		while(matchedClasses.find()) {
			
			classesFound++;
		}
		
		int methodsFound = 0;
		while(matchedMethods.find()) {
			
			methodsFound++;
		}
		int linesFound = 0;
		while(matchedLines.find()) {
			
			linesFound++;
		}
		
		System.out.println("--------------------------");
		System.out.println("LOC: " + linesFound);
		System.out.println("Classes: " + classesFound);
		System.out.println("Methods: " + methodsFound);
		System.out.println("--------------------------");
		
	}
}