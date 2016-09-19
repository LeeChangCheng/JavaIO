import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ioDemo05 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("buf.txt");
BufferedReader bufr=new BufferedReader(fr);
String line=null;
while((line=bufr.readLine())!=null)
	System.out.println(line);
bufr.close();
	}

}
