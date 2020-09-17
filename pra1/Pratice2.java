package pratices;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Pratice2 {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\pratice" + File.separator+"test.txt");
		Reader input=new FileReader(f);
		char[] c=new char[1024];
		int temp=0;
		int len=0;
		while((temp=input.read())!=-1){
		c[len]=(char) temp;
		len++;
		}
		input.close();
		System.out.println(new String(c,0,len));
		} 

}
