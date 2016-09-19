import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ioDemo03 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
FileReader fr=new FileReader("demo.txt");
while(true)
{
	int ch;
	if((ch=fr.read())!=-1)
	{
		break;
	}
	System.out.println((char)ch);
}
	}

}
