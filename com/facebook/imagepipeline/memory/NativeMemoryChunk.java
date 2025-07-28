package com.facebook.imagepipeline.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;

@lj4
public class NativeMemoryChunk implements hl8, Closeable {
    public final long a;
    public final int b;
    public boolean c;

    static {
        kjd.D("imagepipeline");
    }

    public NativeMemoryChunk(int i) {
        ez3.j(Boolean.valueOf(i > 0));
        this.b = i;
        this.a = nativeAllocate(i);
        this.c = false;
    }

    @lj4
    private static native long nativeAllocate(int i);

    @lj4
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @lj4
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @lj4
    private static native void nativeFree(long j);

    @lj4
    private static native void nativeMemcpy(long j, long j2, int i);

    @lj4
    private static native byte nativeReadByte(long j);

    public final synchronized int S(int i, int i2, int i3, byte[] bArr) {
        int b2;
        bArr.getClass();
        ez3.o(!isClosed());
        b2 = udd.b(i, i3, this.b);
        udd.j(i, bArr.length, i2, b2, this.b);
        nativeCopyToByteArray(this.a + ((long) i), bArr, i2, b2);
        return b2;
    }

    public final synchronized int U(int i, int i2, int i3, byte[] bArr) {
        int b2;
        bArr.getClass();
        ez3.o(!isClosed());
        b2 = udd.b(i, i3, this.b);
        udd.j(i, bArr.length, i2, b2, this.b);
        nativeCopyFromByteArray(this.a + ((long) i), bArr, i2, b2);
        return b2;
    }

    public final void a(hl8 hl8, int i) {
        if (hl8 instanceof NativeMemoryChunk) {
            ez3.o(!isClosed());
            NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) hl8;
            ez3.o(!nativeMemoryChunk.isClosed());
            udd.j(0, nativeMemoryChunk.b, 0, i, this.b);
            long j = (long) 0;
            nativeMemcpy(nativeMemoryChunk.a + j, this.a + j, i);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public final synchronized void close() {
        if (!this.c) {
            this.c = true;
            nativeFree(this.a);
        }
    }

    public final long e0() {
        return this.a;
    }

    public final void finalize() {
        if (!isClosed()) {
            Integer.toHexString(System.identityHashCode(this));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public final int getSize() {
        return this.b;
    }

    public final synchronized boolean isClosed() {
        return this.c;
    }

    public final long m() {
        return this.a;
    }

    public final void n(hl8 hl8, int i) {
        hl8.getClass();
        if (hl8.m() == this.a) {
            Integer.toHexString(System.identityHashCode(this));
            Integer.toHexString(System.identityHashCode(hl8));
            Long.toHexString(this.a);
            ez3.j(Boolean.FALSE);
        }
        if (hl8.m() < this.a) {
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
        return nativeReadByte(this.a + ((long) i));
    }

    public final ByteBuffer r() {
        return null;
    }

    public NativeMemoryChunk() {
        this.b = 0;
        this.a = 0;
        this.c = true;
    }
}
