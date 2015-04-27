import java.io.*;

public class Question2 {

	public static void main(String[] args) {
		try{
			PrintWriter a = new PrintWriter("D:\AM021353\MiMi2\Source");
			int i=0;
			while(i++ <100){
				a.println("This is a Text:"+i);
			}
			a.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
