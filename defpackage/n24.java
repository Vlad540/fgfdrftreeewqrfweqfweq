package defpackage;

import java.nio.ByteBuffer;

/* renamed from: n24  reason: default package */
public class n24 extends rx {
    public ByteBuffer X;
    public boolean Y;
    public long Z;
    public xu5 c;
    public final nw3 o = new nw3(1);
    public ByteBuffer w0;
    public final int x0;
    public final int y0;

    static {
        g78.a("media3.decoder");
    }

    public n24(int i) {
        super(3);
        this.x0 = i;
        this.y0 = 0;
    }

    public void v() {
        this.b = 0;
        ByteBuffer byteBuffer = this.X;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.w0;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.Y = false;
    }

    public final ByteBuffer w(int i) {
        int i2 = this.x0;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.X;
        throw new IllegalStateException(rf0.g("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i, ")"));
    }

    public final void x(int i) {
        int i2 = i + this.y0;
        ByteBuffer byteBuffer = this.X;
        if (byteBuffer == null) {
            this.X = w(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.X = byteBuffer;
            return;
        }
        ByteBuffer w = w(i3);
        w.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            w.put(byteBuffer);
        }
        this.X = w;
    }

    public final void y() {
        ByteBuffer byteBuffer = this.X;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.w0;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
