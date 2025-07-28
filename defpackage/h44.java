package defpackage;

import java.nio.ByteBuffer;

/* renamed from: h44  reason: default package */
public final class h44 {
    public long a;
    public final h50 b;
    public final j12 c;
    public final /* synthetic */ i44 d;

    public h44(i44 i44, h50 h50, j12 j12, long j) {
        this.d = i44;
        this.b = h50;
        this.a = j;
        this.c = j12;
    }

    public final void a(long j, ByteBuffer byteBuffer) {
        oyb.d(j >= this.a);
        byteBuffer.position((((int) (j - this.a)) * this.b.d) + byteBuffer.position());
        this.a = j;
    }
}
