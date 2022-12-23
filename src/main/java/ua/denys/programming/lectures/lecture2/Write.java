package ua.denys.programming.lectures.lecture2;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class Write extends FilterWriter {
    protected Write(Writer out) {
        super(out);
    }
    @Override
    public void close() throws IOException {
        throw new IOException("Exception in close() of class Write");
    }

}
