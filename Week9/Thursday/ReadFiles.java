import java.io.*;

public class ReadFiles{
    public static void main(String[] args) throws IOException { //throws IOException is important
        
        InputStream in = new FileInputStream("f1.txt");
        while (true) {

            int nextByte = in.read();

            if (nextByte == -1)
                break;

            System.out.print(nextByte + " ");           
        }
        in.close();
    }
}