package Practice_IO;
import java.io.*;
public class filestream {

    public static void main(String[] args) {
        InputStream in = null;

        try {
            in = new FileInputStream("src/sample.txt");
            int data;
            while ((data = in.read()) != -1) {
                System.out.println((char) data);
            }if (in instanceof FileInputStream) {
                FileInputStream fin = (FileInputStream) in;
                System.out.println("\n[파일 이름: sample.txt]");
            }


        }catch (IOException e){
            e.printStackTrace();
        } try {
            if (in != null) in.close();  // 자원 해제
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
