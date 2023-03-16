import java.io.InputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;




public class InvestigatingWAVFiles {
    public static void main(String[] args) {
        /*
          We open a WAV file and attempt to
          read the first 4096 bytes to an array.
        */


        InputStream in = null;
        byte[] data = new byte[4096];


        try {
            in = new FileInputStream("fmt1_chan2_sr44100_bit16.wav");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


        if (in != null) {
            try {
                in.read(data);
            }
            catch (IOException e) {
                System.out.println("File read failed");
            }
        }




        /*
          We print some bytes after casting to chars
          and print others in their numerical form.
          This allows us to start to make sense of
          the header to the WAV file.
        */


        for (int i = 0; i < 4; ++i) {
            System.out.print((char) data[i]);
        }
        System.out.println();

        for (int i = 8; i < 12; ++i) {
            System.out.print((char) data[i]);
        }
        System.out.println();

        for (int i = 12; i < 16; ++i) {
            System.out.print((char) data[i]);
        }
        System.out.println();
        System.out.println();

        for (int i = 16; i < 20; ++i) {
            System.out.println(data[i]);
        }
        System.out.println();

        for (int i = 20; i < 22; ++i) {
            System.out.println(data[i]);
        }
        System.out.println();

        for (int i = 22; i < 24; ++i) {
            System.out.println(data[i]);
        }
        System.out.println();

        for (int i = 32; i < 34; ++i) {
            System.out.println(data[i]);
        }
        System.out.println();

        for (int i = 34; i < 36; ++i) {
            System.out.println(data[i]);
        }
        System.out.println();

        for (int i = 36; i < 40; ++i) {
            System.out.print((char) data[i]);
        }
        System.out.println();
        System.out.println();




        /*
          We close the stream.
        */
        if (in != null) {
            try {
                in.close();
            }
            catch (IOException e) {
                System.out.println("Stream close failed");
            }
        }
    }
}
