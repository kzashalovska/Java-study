package FundamentalspPractice_4Exception;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UnClosedStream extends FilterInputStream {
    public UnClosedStream(InputStream in) {
        super(in);
    }

    @Override
    public void close() throws IOException {
        //NOP
    }
}
