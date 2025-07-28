package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: i50  reason: default package */
public interface i50 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    void b(ByteBuffer byteBuffer);

    void c();

    boolean d();

    g50 e(g50 g50);

    void flush();

    boolean isActive();

    void reset();
}
