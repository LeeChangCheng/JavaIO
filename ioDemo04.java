import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class ioDemo04 {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������

		FileWriter fw=new FileWriter("buf.txt");
		BufferedWriter bufw=new BufferedWriter(fw);
		for(int i=0;i<=5;i++)
		{
			bufw.write("abce"+i);
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
	}

}
