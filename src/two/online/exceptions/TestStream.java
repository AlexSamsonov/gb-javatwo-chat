package two.online.exceptions;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestStream implements Closeable {

    void open() throws FileNotFoundException {
        System.out.println("i opened");
//        throw new FileNotFoundException("I failed to open file");
    }

    void read() throws IOException {
        System.out.println("i read a byte from file");
        throw new IOException("I fail to read");
    }

    @Override
    public void close() throws IOException {
//        System.out.println("i'm a thread and close");
        throw new IOException("I failed to close(((");
    }
}
