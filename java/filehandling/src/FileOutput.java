import java.io.FileInputStream;

import java.io.IOException;

public class FileOutput {
	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("anu.txt");
		String s1="anu anand";
		byte b1[]=s1.getBytes();
	     f.write(b1);
		System.out.println("sucess");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
