import java.io.FileWriter;
import java.io.IOException;


public class ioDemo02 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
FileWriter fw=new FileWriter("demo.txt",true);
fw.write("什\n么鬼！");
		fw.close();
	}

}
