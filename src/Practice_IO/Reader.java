package Practice_IO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("src/Practice_io/output.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("읽은 줄: " + line);
            }


            br.close();

        }catch (IOException e){
            System.out.println("파일 읽기 중 오류 발생: " + e.getMessage());
        }
    }



}
