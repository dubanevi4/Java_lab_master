import org.eclipse.jetty.http2.hpack.HpackDecoder;
import org.eclipse.jetty.http2.hpack.HpackException;
import org.eclipse.jetty.http2.hpack.HeaderField;
import org.eclipse.jetty.util.BufferUtil;

import java.nio.ByteBuffer;

public class HpackDecoderJettyExample {
    public static void main(String[] args) throws HpackException {
        // Example HPACK-encoded headers (you can replace this with your own encoded data)
        byte[] encodedHeaders = new byte[]{(byte) 0x82, (byte) 0x87, (byte) 0x86};

        // Initialize the HPACK decoder with a max table size and max header list size
        HpackDecoder decoder = new HpackDecoder(4096, 4096);

        // Create a ByteBuffer to hold the encoded headers
        ByteBuffer buffer = ByteBuffer.wrap(encodedHeaders);

        // Decode and print the headers
        while (BufferUtil.hasContent(buffer)) {
            HeaderField header = decoder.decode(buffer);
            System.out.println(header.getName() + ": " + header.getValue());
        }
    }
}