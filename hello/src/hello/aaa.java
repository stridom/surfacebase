package hello;
import java.io.*;
public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hello world\n"+"Java");
		int time = 111;
		try {
            String file = "C:\\Users\\strik\\Desktop\\�ձ�\\0707.txt";
            InputStreamReader in = new InputStreamReader (new FileInputStream(file),"UTF-8");
            BufferedReader reader=new BufferedReader(in);
            String strLine = null;
            int lineCount = 1;
            while(null != (strLine = reader.readLine())){
                System.out.println("��[" + lineCount + "]������:[" + strLine + "]");
            	lineCount++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
