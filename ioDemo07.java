import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import sun.java2d.pipe.BufferedOpCodes;


public class ioDemo07 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
long start= System.currentTimeMillis();
copy_1();
long end=System.currentTimeMillis();
System.out.println(end-start);
}
	public static void copy_1() throws IOException
	{
		BufferedInputStream bufis=
	    new BufferedInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\14.pdf"));
	    BufferedOutputStream bufos=
	    new BufferedOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\14_copy.pdf"));
	    int by=0;
	while((by=bufis.read())!=-1)
	{
		bufos.write(by);
	}
bufis.close();
bufos.close();
	}
}