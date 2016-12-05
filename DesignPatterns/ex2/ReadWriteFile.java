import java.io.*;

public class ReadWriteFile {

  /**
   * Reads a file and converts it to string
   */
  public static String readFile(String filename) throws IOException {

    BufferedReader reader = new BufferedReader(new FileReader(filename)); // new buffered reader that reads a file
    String line;
    StringBuilder sb = new StringBuilder(); // string builder
    
    while ((line = reader.readLine()) != null) { // while there is a line it is added to the line string variable ...
      sb.append(line + "\n"); // ... and then to the string builder
    }
    
    System.out.println("File successfully read!");
    
    reader.close(); // closes reader
    return sb.toString(); // casts string builder to string object and returns it
  }

  /**
   * Make a file (filename_path) with the given text (input_text)
   */
  public static void writeFile(String filename_path, String input_text) throws IOException {
	  
    File file = new File(filename_path); // new file creation
    BufferedWriter out = new BufferedWriter(new FileWriter(file)); // new BufferedWriter object getting the new file as input
    
    System.out.println("File successfully created!");
    
    out.write(input_text); // write using input_text
    out.close(); // closes BufferedWriter object
  }

}