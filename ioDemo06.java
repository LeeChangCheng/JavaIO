import java.io.*;


public class ioDemo06 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
BufferedReader bufr=new BufferedReader(new FileReader("buf.txt"));
BufferedWriter bufw=new BufferedWriter(new FileWriter("buf_copy.txt"));
String line =null;
while((line=bufr.readLine())!=null)
{
	bufw.write(line);
	bufw.newLine();
	bufw.flush();
	
}
	}

}
