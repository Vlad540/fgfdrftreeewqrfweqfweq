package defpackage;

import java.nio.ByteBuffer;

/* renamed from: hl8  reason: default package */
public interface hl8 {
    int S(int i, int i2, int i3, byte[] bArr);

    int U(int i, int i2, int i3, byte[] bArr);

    void close();

    long e0();

    int getSize();

    boolean isClosed();

    long m();

    void n(hl8 hl8, int i);

    byte o(int i);

    ByteBuffer r();
}
