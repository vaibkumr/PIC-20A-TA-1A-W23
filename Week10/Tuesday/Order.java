import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Order {

    public static void main(String[] args) {

        byte[] bytes = new byte[]{
            (byte) 0x52, 
            (byte) 0x49, 
            (byte) 0x46, 
            (byte) 0x46,
        };
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        buffer.order(ByteOrder.BIG_ENDIAN);

        
        byte b = buffer.get();
        System.out.println((char) b);
        

     

       

        // .get

        // .getInt





        // byte val = buffer.get();
        // System.out.println(val);

        // val = buffer.get();
        // System.out.println(val);
        
        // val = buffer.get();
        // System.out.println(val);
        
        // val = buffer.get();
        // System.out.println(val);  
        

            

        // buffer.order(ByteOrder.LITTLE_ENDIAN);
        // int val = buffer.getInt();

    }
}
