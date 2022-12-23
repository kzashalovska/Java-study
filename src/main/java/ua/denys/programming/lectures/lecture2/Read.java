package ua.denys.programming.lectures.lecture2;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class Read extends FilterReader
{
    protected Read(Reader in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        throw new IOException("Exception in Read");
    }

    @Override
    public void close() throws IOException {
        throw new IOException("Exception in close() of class Read");
    }
}
