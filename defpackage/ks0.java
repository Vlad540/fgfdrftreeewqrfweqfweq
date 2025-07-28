package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ks0  reason: default package */
public final class ks0 {
    public final int a;
    public final int b;
    public final ByteBuffer c;
    public long d;

    public ks0(ByteBuffer byteBuffer, p80 p80, int i, int i2) {
        byteBuffer.rewind();
        int limit = byteBuffer.limit() - byteBuffer.position();
        if (limit == p80.a) {
            this.a = i;
            this.b = i2;
            this.c = byteBuffer;
            this.d = p80.b;
            return;
        }
        StringBuilder m = me4.m(limit, "Byte buffer size is not match with packet info: ", " != ");
        m.append(p80.a);
        throw new IllegalStateException(m.toString());
    }

    public final p80 a(ByteBuffer byteBuffer) {
        int i;
        long j = this.d;
        ByteBuffer byteBuffer2 = this.c;
        int position = byteBuffer2.position();
        int position2 = byteBuffer.position();
        if (byteBuffer2.remaining() > byteBuffer.remaining()) {
            i = byteBuffer.remaining();
            this.d += r1g.j(this.b, r1g.D(this.a, (long) i));
            ByteBuffer duplicate = byteBuffer2.duplicate();
            duplicate.position(position).limit(position + i);
            byteBuffer.put(duplicate).limit(position2 + i).position(position2);
        } else {
            i = byteBuffer2.remaining();
            byteBuffer.put(byteBuffer2).limit(position2 + i).position(position2);
        }
        byteBuffer2.position(position + i);
        return new p80(i, j);
    }
}
