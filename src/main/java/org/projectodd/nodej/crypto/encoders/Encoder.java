package org.projectodd.nodej.crypto.encoders;

import java.nio.charset.Charset;

public interface Encoder {

    public static final Charset CHARSET = Charset.forName("US-ASCII");

    public static final Hex HEX = new Hex();
    public static final Raw RAW = new Raw();

    public byte[] decode(String data);

    public String encode(final byte[] data);
}