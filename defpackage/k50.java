package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: k50  reason: default package */
public interface k50 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    void b(ByteBuffer byteBuffer);

    void c();

    boolean d();

    h50 e(h50 h50);

    long f(long j) {
        return j;
    }

    void flush();

    boolean isActive();

    void reset();
}
