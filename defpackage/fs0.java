package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: fs0  reason: default package */
public final class fs0 implements hl8, Closeable {
    public ByteBuffer a;
    public final int b;
    public final long c = ((long) System.identityHashCode(this));

    public fs0(int i) {
        this.a = ByteBuffer.allocateDirect(i);
        this.b = i;
    }

    public final synchronized int S(int i, int i2, int i3, byte[] bArr) {
        int b2;
        bArr.getClass();
        ez3.o(!isClosed());
        this.a.getClass();
        b2 = udd.b(i, i3, this.b);
        udd.j(i, bArr.length, i2, b2, this.b);
        this.a.position(i);
        this.a.get(bArr, i2, b2);
        return b2;
    }

    public final synchronized int U(int i, int i2, int i3, byte[] bArr) {
        int b2;
        bArr.getClass();
        ez3.o(!isClosed());
        this.a.getClass();
        b2 = udd.b(i, i3, this.b);
        udd.j(i, bArr.length, i2, b2, this.b);
        this.a.position(i);
        this.a.put(bArr, i2, b2);
        return b2;
    }

    public final void a(hl8 hl8, int i) {
        if (hl8 instanceof fs0) {
            ez3.o(!isClosed());
            fs0 fs0 = (fs0) hl8;
            ez3.o(!fs0.isClosed());
            this.a.getClass();
            udd.j(0, fs0.b, 0, i, this.b);
            this.a.position(0);
            ByteBuffer r = fs0.r();
            r.getClass();
            r.position(0);
            byte[] bArr = new byte[i];
            this.a.get(bArr, 0, i);
            r.put(bArr, 0, i);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public final synchronized void close() {
        this.a = null;
    }

    public final long e0() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    public final int getSize() {
        return this.b;
    }

    public final synchronized boolean isClosed() {
        return this.a == null;
    }

    public final long m() {
        return this.c;
    }

    public final void n(hl8 hl8, int i) {
        hl8.getClass();
        long m = hl8.m();
        long j = this.c;
        if (m == j) {
            Long.toHexString(j);
            Long.toHexString(hl8.m());
            ez3.j(Boolean.FALSE);
        }
        if (hl8.m() < this.c) {
            synchronized (hl8) {
                synchronized (this) {
                    a(hl8, i);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (hl8) {
                a(hl8, i);
            }
        }
    }

    public final synchronized byte o(int i) {
        boolean z = false;
        ez3.o(!isClosed());
        ez3.j(Boolean.valueOf(i >= 0));
        if (i < this.b) {
            z = true;
        }
        ez3.j(Boolean.valueOf(z));
        this.a.getClass();
        return this.a.get(i);
    }

    public final synchronized ByteBuffer r() {
        return this.a;
    }
}
