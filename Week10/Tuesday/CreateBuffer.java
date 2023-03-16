import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class CreateBuffer {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        byte[] bytes = new byte[10];
        ByteBuffer buffer2 = ByteBuffer.wrap(bytes);

    }
    
}
