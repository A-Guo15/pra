package pratices;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Pratice3 {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\pratice" + File.separator+"test1.txt");
		Writer out=new FileWriter(f,true);//×·¼Ó
		String str="\t\n Day4";
		out.write(str);
		out.close();
		} 
}
