package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: nu0  reason: default package */
public enum nu0 {
    ;

    public static void a(int i, ByteBuffer byteBuffer) {
        if (i < 0 || i >= byteBuffer.capacity()) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public static void b(ByteBuffer byteBuffer, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("lengths must be >= 0");
        } else if (i2 > 0) {
            a(i, byteBuffer);
            a((i + i2) - 1, byteBuffer);
        }
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        ByteOrder byteOrder = pze.a;
        return order.equals(byteOrder) ? byteBuffer : byteBuffer.duplicate().order(byteOrder);
    }

    public static int d(int i, ByteBuffer byteBuffer) {
        return ((byteBuffer.get(i + 1) & 255) << 8) | (byteBuffer.get(i) & 255);
    }

    public static void e(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.put(i, (byte) i2);
        byteBuffer.put(i + 1, (byte) (i2 >>> 8));
    }
}
