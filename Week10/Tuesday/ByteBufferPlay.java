import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ByteBufferPlay {

    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.allocate(8);
        buffer.order(ByteOrder.BIG_ENDIAN);

        buffer.putInt(123);
        buffer.putShort((short) 456);
        buffer.put((byte) 78);

        buffer.flip();

        int num = buffer.getInt();
        short s = buffer.getShort();
        byte b = buffer.get();

        System.out.println("num: " + num);
        System.out.println("short: " + s);
        System.out.println("byte: " + b);

        // Rewind the buffer to read again from the beginning
        buffer.rewind();

        // Get the data as a byte array
        byte[] array = buffer.array();

        // Print the bytes in the array
        System.out.print("Bytes: ");
        for (byte bb : array) {
            System.out.print(bb + " ");
        }
        System.out.println();

        // Clear the buffer to start over
        buffer.clear();

        // Put some new data into the buffer
        buffer.putInt(789);
        buffer.putShort((short) 101);
        buffer.put((byte) 112);

        // Flip the buffer to prepare for reading
        buffer.flip();

        // Read the data from the buffer again
        int num2 = buffer.getInt();
        short s2 = buffer.getShort();
        byte b2 = buffer.get();

        System.out.println("num2: " + num2);
        System.out.println("short2: " + s2);
        System.out.println("byte2: " + b2);
    }
}
