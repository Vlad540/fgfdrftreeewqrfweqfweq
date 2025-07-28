package defpackage;

import java.nio.ByteBuffer;

/* renamed from: m24  reason: default package */
public class m24 extends rx {
    public boolean X;
    public long Y;
    public ByteBuffer Z;
    public final nw3 c = new nw3(0);
    public ByteBuffer o;
    public final int w0;
    public final int x0;

    static {
        a55.a("goog.exo.decoder");
    }

    public m24(int i) {
        super(2);
        this.w0 = i;
        this.x0 = 0;
    }

    public void v() {
        this.b = 0;
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.Z;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.X = false;
    }

    public final ByteBuffer w(int i) {
        int i2 = this.w0;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.o;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    public final void x(int i) {
        int i2 = i + this.x0;
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer == null) {
            this.o = w(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.o = byteBuffer;
            return;
        }
        ByteBuffer w = w(i3);
        w.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            w.put(byteBuffer);
        }
        this.o = w;
    }

    public final void y() {
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.Z;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
