import java.io.FileWriter;
import java.io.IOException;


public class ioDemo02 {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
FileWriter fw=new FileWriter("demo.txt",true);
fw.write("ʲ\nô��");
		fw.close();
	}

}
