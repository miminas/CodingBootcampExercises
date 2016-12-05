import java.io.IOException;

public class ReadWriteTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		
		ReadWriteFile reader = new ReadWriteFile();
		
		String input = reader.readFile("/Applications/eclipse/workspace/DesignPatterns/src/test.txt");
		
		System.out.println(input);
		
		ReadWriteFile writer = new ReadWriteFile();
		
		writer.writeFile("/Applications/eclipse/workspace/DesignPatterns/src/generated_file.txt", input);
	}
}
