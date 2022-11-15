package base64;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.logging.Logger;


public class base64Demo {

    private static final Logger log = Logger.getLogger(String.valueOf(base64Demo.class));

    public static void main(String[] args) {
        String string = "Hello there! Nov25.22";

        //encode string
        String encodedString = null;
        try {
            encodedString = encodeString(string);
            System.out.println("Base64 encoded String: " + encodedString);
        } catch (UnsupportedEncodingException e) {
            log.warning("Encode Exception in encodeString{}  " + e);
        }

        //decoding string
        assert encodedString != null;
        String decodedString = decodeString(encodedString);
        System.out.println("Base64 decoded string: " + decodedString);
    }

    private static String encodeString(String string) throws UnsupportedEncodingException {
        String encodeValue = "";
        Base64.Encoder encoder = Base64.getEncoder();
        encodeValue = encoder.encodeToString(string.getBytes(StandardCharsets.UTF_8));
        return encodeValue;
    }

    private static String decodeString(String encodedString) {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodeValue = decoder.decode(encodedString.getBytes(StandardCharsets.UTF_8));
        return new String(decodeValue);
    }
}
