import java.net.*;
import java.io.*;

public class StreamBytes {
    public static void main(String[] args) throws IOException { //throws IOException is important
        
        InputStream in = new FileInputStream("f1.txt");
        OutputStream out; 
        out = new FileOutputStream("f2.txt");
        
        while (true) {
            int nextByte = in.read();

            if (nextByte == -1)
                break;

            System.out.print((char) nextByte);           
            
            out.write((char) nextByte);
        }
        in.close();
        out.close();
    }
}