import java.io.FileWriter;
import java.io.IOException;


public class ioDemo01 {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
FileWriter fw=new FileWriter("demo.txt");
fw.write("asdadas");
fw.flush();
fw.write("//dwdfsdf");
fw.flush();
fw.close();
	}

}
