package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: at0  reason: default package */
public interface at0 extends tld, ReadableByteChannel {
    boolean B();

    String G(long j);

    long K(yw ywVar);

    String O(Charset charset);

    void Q(wr0 wr0, long j);

    void R(long j);

    String X();

    int d0(gga gga);

    uu0 e(long j);

    wr0 getBuffer();

    void h0(long j);

    long j0();

    InputStream l0();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();
}
