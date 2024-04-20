package structural.decorator;

import javax.xml.crypto.Data;
import java.io.*;

/**
 *
 */
public class Decorator {

    public static void main(String[] args) {
        try{
            InputStream inputStream = new FileInputStream("example.txt");
            InputStream bufferedInputStream = new BufferedInputStream(inputStream);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);

            //Decorator Hell--nested
            InputStream myStream = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("example.txt")
                    )
            );
            inputStream.close();
            bufferedInputStream.close();
            dataInputStream.close();
            myStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
